package com.pwagstaff;

import com.pwagstaff.itemTypes.*;

//Class for storing global variables
public class GlobalVariables {

    //Tree of the database the application operates with
    //Default is "DEFAULT_BRANCH" but it is stored and updated using app preferences
    public static String databaseBranch = "DEFAULT_BRANCH";

    //Stores the ItemType the application is currently operating with
    public static ItemType currentItemType;

    //Stores the ItemTypes the application currently has available
    //ADD AND REMOVE ITEMTYPES HERE
    public static final ItemType[] ACTIVE_ITEM_TYPES = {
            new CellType(),
            new StockType(),
            new ToolType(),
            new OtherType()
    } ;
}
