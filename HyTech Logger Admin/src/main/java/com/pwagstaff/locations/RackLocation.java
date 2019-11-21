package com.pwagstaff.locations;

import org.json.simple.parser.ParseException;

//Represents a location within a rack, this is a specific stock rack
public class RackLocation extends Location {

    //Value of the special type tag for an RackLocation
    public static final String TYPE = "rack";

    /**
     * Declares a RackLocation
     */
    public RackLocation() {
        super();
        tags.put(TYPE_KEY, TYPE);
    }

    /**
     * Create a new RackLocation from a Location as a JSON String
     * The JSON String should represent a RackLocation
     * @param locationAsJSONString A Location represented by a JSON String
     */
    public RackLocation(String locationAsJSONString) throws ParseException {
        super(locationAsJSONString);
    }

    @Override
    public String fancyPrint() {
        return tags.get("rack").toString();
    }
}
