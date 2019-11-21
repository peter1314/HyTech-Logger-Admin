package com.pwagstaff.itemTypes;

import com.pwagstaff.itemTypes.typeBuildingBlocks.Attributes;
import com.pwagstaff.itemTypes.typeBuildingBlocks.LocationConfigurations;
import com.pwagstaff.itemTypes.typeBuildingBlocks.attributes.Attribute;
import com.pwagstaff.locations.LocationConfiguration;

//Represents an undefined item
public class ToolType extends  ItemType{

    //Static information associated with the ToolType, changing them will change its behavior
    private static final String MY_NAME = "TOOL";
    private static final String MY_BRANCH = "TOOLS";

    //Optional Attributes of the StockType, add or remove as needed
    private static final Attribute[] MY_ROW_ATTRIBUTES = {
            Attributes.NAME,
            Attributes.TYPE,
            Attributes.COMPANY,
            Attributes.SIZE,
            Attributes.FLUTES,
            Attributes.STEEL_FEEDS,
            Attributes.ALUMINUM_FEEDS,
            Attributes.NOTE};

    //Attributes by which this ItemType can be filtered, add or remove as needed
    //Test attributes should also be in row attributes
    private static final Attribute[] MY_TEST_ATTRIBUTES = {
            Attributes.NAME,
            Attributes.TYPE,
            Attributes.COMPANY,
            Attributes.SIZE,
            Attributes.NOTE};

    //LocationConfigurations used to create and search Locations of this ItemType, add or remove as needed
    private static final LocationConfiguration[] MY_LOCATION_CONFIGS = {
            LocationConfigurations.ORANGE_CABINET,
            LocationConfigurations.BLACK_CABINET,
            LocationConfigurations.OTHER};

    /**
     * Declares ToolType
     */
    public ToolType() {
        super(MY_NAME, MY_BRANCH, MY_ROW_ATTRIBUTES, MY_TEST_ATTRIBUTES, MY_LOCATION_CONFIGS);
    }
}
