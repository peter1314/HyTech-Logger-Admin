package com.pwagstaff.locations;

import org.json.simple.parser.ParseException;

//Represents a location within the cell cabinet, this is a specific cabinet which has 9 shelves
public class CellCabinetLocation extends Location {

    //Value of the special type tag for an CellCabinetLocation
    public static final String TYPE = "cell_cabinet";

    /**
     * Declares a CellCabinetLocation
     */
    public CellCabinetLocation() {
        super();
        tags.put(TYPE_KEY, TYPE);
    }

    /**
     * Create a new CellCabinetLocation from a Location as a JSON String
     * The JSON String should represent a CellCabinetLocation
     * @param locationAsJSONString A Location represented by a JSON String
     */
    public CellCabinetLocation(String locationAsJSONString) throws ParseException {
        super(locationAsJSONString);
    }

    @Override
    public String fancyPrint() {
        return "Cabinet: Shelf " + tags.get("shelf");
    }
}
