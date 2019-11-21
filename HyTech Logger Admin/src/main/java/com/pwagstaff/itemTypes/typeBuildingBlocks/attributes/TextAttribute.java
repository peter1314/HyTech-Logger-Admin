package com.pwagstaff.itemTypes.typeBuildingBlocks.attributes;

//Attribute that represents a text
public class TextAttribute extends Attribute {

    /**
     * Declare Attribute and finalize its fields
     * @param key Key of the Attribute
     * @param name Name of the Attribute
     * @param display Shortened name for display purposes
     */
    public TextAttribute(String key, String name, String display) {
        super(key, name, display, "", 0);
    }

    /**
     * Declare Attribute and finalize its fields
     * @param key Key of the Attribute
     * @param name Name of the Attribute
     */
    public TextAttribute(String key, String name) {
        this(key, name, name);
    }
}
