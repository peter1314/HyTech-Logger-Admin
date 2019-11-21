package com.pwagstaff.locations;

import org.json.simple.parser.ParseException;

//Represents a location within the orange tool cabinet, this is a specific cabinet
public class OrangeCabinetLocation extends Location {

    //Value of the special type tag for an CellCabinetLocation
    public static final String TYPE = "orange_cabinet";

    /**
     * Declares a OrangeCabinetLocation
     */
    public OrangeCabinetLocation() {
        super();
        tags.put(TYPE_KEY, TYPE);
    }

    /**
     * Create a new OrangeCabinetLocation from a Location as a JSON String
     * The JSON String should represent a OrangeCabinetLocation
     * @param locationAsJSONString A Location represented by a JSON String
     */
    public OrangeCabinetLocation(String locationAsJSONString) throws ParseException {
        super(locationAsJSONString);
    }

    @Override
    public String fancyPrint() {
        return "Orange Cab" + ": R" + tags.get("row") + ", S" + tags.get("shelf");
    }
}
