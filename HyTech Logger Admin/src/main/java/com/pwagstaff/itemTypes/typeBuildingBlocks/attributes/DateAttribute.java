package com.pwagstaff.itemTypes.typeBuildingBlocks.attributes;

//Attribute that represents a date
public class DateAttribute extends Attribute {

    /**
     * Declare Attribute and finalize its fields
     * @param key Key of the Attribute
     * @param name Name of the Attribute
     * @param nickName Shortened name for nickName purposes
     */
    public DateAttribute(String key, String name, String nickName) {
        super(key, name, nickName, "00/00/0000", 0);
    }

    /**
     * Declare Attribute and finalize its fields
     * @param key Key of the Attribute
     * @param name Name of the Attribute
     */
    public DateAttribute(String key, String name) {
        this(key, name, name);
    }
}
