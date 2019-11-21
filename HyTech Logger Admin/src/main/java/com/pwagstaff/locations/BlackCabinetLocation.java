package com.pwagstaff.locations;

import org.json.simple.parser.ParseException;

//Represents a location within the black tool cabinet, this is a specific cabinet
public class BlackCabinetLocation extends Location {

    //Value of the special type tag for an CellCabinetLocation
    public static final String TYPE = "black_cabinet";

    /**
     * Declares a BlackCabinetLocation
     */
    public BlackCabinetLocation() {
        super();
        tags.put(TYPE_KEY, TYPE);
    }

    /**
     * Create a new BlackCabinetLocation from a Location as a JSON String
     * The JSON String should represent a BlackCabinetLocation
     * @param locationAsJSONString A Location represented by a JSON String
     */
    public BlackCabinetLocation(String locationAsJSONString) throws ParseException {
        super(locationAsJSONString);
    }

    @Override
    public String fancyPrint() {
        return "Black Cab: Shelf " + tags.get("shelf");
    }
}
