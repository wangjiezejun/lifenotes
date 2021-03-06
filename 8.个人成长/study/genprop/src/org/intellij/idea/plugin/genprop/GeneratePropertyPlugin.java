package org.intellij.idea.plugin.genprop;

import com.intellij.codeInspection.InspectionToolProvider;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import org.apache.log4j.Logger;
import org.intellij.idea.plugin.genprop.config.Config;
import org.intellij.idea.plugin.genprop.template.TemplateResourceLocator;
import org.intellij.idea.plugin.genprop.view.ConfigUI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import javax.swing.JComponent;

/**
 * The IDEA component for this plugin.
 *
 * @author Claus Ibsen
 */
public class GeneratePropertyPlugin
		implements ApplicationComponent, InspectionToolProvider {

	private static final Logger log = Logger.getLogger(GeneratePropertyPlugin.class);
	private static final Class[] EMPTY_CLASSES = new Class[0];
	private ConfigUI configUI;
	private Config config = new Config();

	@NotNull
	public String getComponentName() {
		return "GenerateProperty";
	}

	public void initComponent() {
	}

	public void disposeComponent() {
	}

	public String getDisplayName() {
		return "Generate Property";
	}

	@Nullable
	public Icon getIcon() {
		return null;
	}

	@Nullable
	public String getHelpTopic() {
		return null;
	}

	public JComponent createComponent() {
		if (configUI == null) {
			configUI = new ConfigUI(config);
		}
		return configUI;
	}

	public boolean isModified() {
		return !config.equals(configUI.getConfig());
	}

	public void apply()
			throws ConfigurationException {
		config = configUI.getConfig();
		GeneratePropertyNameContext.setConfig(config); // update context

		// update menus according the settings
		if (config.isDisableActionInMenus()) {
			GeneratePropertyAction.disableActionInMenus();
		} else {
			GeneratePropertyAction.enableActionsInMenus();
		}

		if (log.isDebugEnabled()) {
			log.debug("Config updated:\n" + config);
		}
	}

	public void reset() {
		configUI.setConfig(config);
	}

	public void disposeUIResources() {
		//noinspection AssignmentToNull
		configUI = null;
	}

	public Config getConfig() {
		return config;
	}

	public void readExternal(org.jdom.Element element)
			throws InvalidDataException {
		config.readExternal(element);

		// autosave current template as a kind of backup file
		if (config.getMethodBody() != null) {
			TemplateResourceLocator.autosaveActiveTemplate(config.getMethodBody());
		}

		// set config on context
		GeneratePropertyNameContext.setConfig(config);

		if (log.isDebugEnabled()) {
			log.debug("Config loaded at startup:\n" + config);
		}
	}

	public void writeExternal(org.jdom.Element element)
			throws WriteExternalException {
		config.writeExternal(element);

		// autosave current template as a kind of backup file
		TemplateResourceLocator.autosaveActiveTemplate(config.getMethodBody());
	}

	public Class[] getInspectionClasses() {
		return EMPTY_CLASSES;
		// register our inspection classes
//        return new Class[]{
//                PropertyHasNoNameConstantInspection.class,
//        };
	}


}
