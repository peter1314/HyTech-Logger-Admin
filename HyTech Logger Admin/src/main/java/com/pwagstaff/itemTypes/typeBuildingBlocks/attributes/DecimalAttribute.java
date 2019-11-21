package com.pwagstaff.itemTypes.typeBuildingBlocks.attributes;

//Attribute that represents a decimal
public class DecimalAttribute extends Attribute {

    /**
     * Declare Attribute and finalize its fields
     * @param key Key of the Attribute
     * @param name Name of the Attribute
     * @param nickName Shortened name for nickName purposes
     */
    public DecimalAttribute(String key, String name, String nickName) {
        super(key, name, nickName, "0", 0);
    }

    /**
     * Declare Attribute and finalize its fields
     * @param key Key of the Attribute
     * @param name Name of the Attribute
     */
    public DecimalAttribute(String key, String name) {
        this(key, name, name);
    }
}
