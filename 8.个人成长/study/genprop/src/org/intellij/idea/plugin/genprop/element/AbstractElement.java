package org.intellij.idea.plugin.genprop.element;

/**
 * Base class to extends for Elements. <p/> Currently there are two kind of elements: Field and Method.
 *
 * @author Claus Ibsen
 * @since 2.15
 */
public abstract class AbstractElement
        implements Element {

    private String name;
    private boolean isArray;
    private boolean isPrimitiveArray;
    private boolean isObjectArray;
    private boolean isStringArray;
    private boolean isCollection;
    private boolean isMap;
    private boolean isSet;
    private boolean isList;
    private boolean isPrimitive;
    private boolean isString;
    private boolean isNumeric;
    private boolean isObject;
    private boolean isDate;
    private boolean isCalendar;
    private boolean isBoolean;
    private String typeName;
    private String typeQualifiedName;
    private String typePresentableText;
    private boolean isModifierStatic;
    private boolean isModifierPublic;
    private boolean isModifierProtected;
    private boolean isModifierPackageLocal;
    private boolean isModifierPrivate;
    private boolean isModifierFinal;

    public String getName() {
        return name;
    }

    public boolean isArray() {
        return isArray;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public boolean isMap() {
        return isMap;
    }

    public boolean isPrimitive() {
        return isPrimitive;
    }

    public boolean isString() {
        return isString;
    }

    public boolean isPrimitiveArray() {
        return isPrimitiveArray;
    }

    public boolean isObjectArray() {
        return isObjectArray;
    }

    public boolean isNumeric() {
        return isNumeric;
    }

    public boolean isObject() {
        return isObject;
    }

    public boolean isDate() {
        return isDate;
    }

    public boolean isSet() {
        return isSet;
    }

    public boolean isList() {
        return isList;
    }

    public boolean isStringArray() {
        return isStringArray;
    }

    public boolean isCalendar() {
        return isCalendar;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getTypeQualifiedName() {
        return typeQualifiedName;
    }

    public boolean isBoolean() {
        return isBoolean;
    }

    public void setBoolean(boolean aBoolean) {
        isBoolean = aBoolean;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setNumeric(boolean numeric) {
        isNumeric = numeric;
    }

    void setObject(boolean object) {
        isObject = object;
    }

    void setDate(boolean date) {
        isDate = date;
    }

    void setArray(boolean array) {
        isArray = array;
    }

    void setCollection(boolean collection) {
        isCollection = collection;
    }

    void setMap(boolean map) {
        isMap = map;
    }

    void setPrimitive(boolean primitive) {
        isPrimitive = primitive;
    }

    void setString(boolean string) {
        isString = string;
    }

    void setPrimitiveArray(boolean primitiveArray) {
        isPrimitiveArray = primitiveArray;
    }

    void setObjectArray(boolean objectArray) {
        isObjectArray = objectArray;
    }

    void setSet(boolean set) {
        isSet = set;
    }

    void setList(boolean list) {
        isList = list;
    }

    void setStringArray(boolean stringArray) {
        isStringArray = stringArray;
    }

    void setCalendar(boolean calendar) {
        isCalendar = calendar;
    }

    void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    void setTypeQualifiedName(String typeQualifiedName) {
        this.typeQualifiedName = typeQualifiedName;
    }

    public boolean isModifierStatic() {
        return isModifierStatic;
    }

    public boolean isModifierPublic() {
        return isModifierPublic;
    }

    void setModifierPublic(boolean modifierPublic) {
        isModifierPublic = modifierPublic;
    }

    public boolean isModifierProtected() {
        return isModifierProtected;
    }

    void setModifierProtected(boolean modifierProtected) {
        isModifierProtected = modifierProtected;
    }

    public boolean isModifierPackageLocal() {
        return isModifierPackageLocal;
    }

    void setModifierPackageLocal(boolean modifierPackageLocal) {
        isModifierPackageLocal = modifierPackageLocal;
    }

    public boolean isModifierPrivate() {
        return isModifierPrivate;
    }

    void setModifierPrivate(boolean modifierPrivate) {
        isModifierPrivate = modifierPrivate;
    }

    public boolean isModifierFinal() {
        return isModifierFinal;
    }

    void setModifierFinal(boolean modifierFinal) {
        isModifierFinal = modifierFinal;
    }

    void setModifierStatic(boolean modifierStatic) {
        isModifierStatic = modifierStatic;
    }

    public String getTypePresentableText() {
        return typePresentableText;
    }

    void setTypePresentableText(String typePresentableText) {
        this.typePresentableText = typePresentableText;
    }

    public String toString() {
        return "AbstractElement{" +
                "isArray=" + isArray +
                ", name='" + name + '\'' +
                ", isPrimitiveArray=" + isPrimitiveArray +
                ", isObjectArray=" + isObjectArray +
                ", isStringArray=" + isStringArray +
                ", isCollection=" + isCollection +
                ", isMap=" + isMap +
                ", isSet=" + isSet +
                ", isList=" + isList +
                ", isPrimitive=" + isPrimitive +
                ", isString=" + isString +
                ", isNumeric=" + isNumeric +
                ", isObject=" + isObject +
                ", isDate=" + isDate +
                ", isCalendar=" + isCalendar +
                ", isBoolean=" + isBoolean +
                ", typeName='" + typeName + '\'' +
                ", typeQualifiedName='" + typeQualifiedName + '\'' +
                ", isModifierStatic=" + isModifierStatic +
                ", isModifierPublic=" + isModifierPublic +
                ", isModifierProtected=" + isModifierProtected +
                ", isModifierPackageLocal=" + isModifierPackageLocal +
                ", isModifierPrivate=" + isModifierPrivate +
                ", isModifierFinal=" + isModifierFinal +
                '}';
    }


}
