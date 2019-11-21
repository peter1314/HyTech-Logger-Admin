package com.pwagstaff.locations;

import org.json.simple.parser.ParseException;

//Represents an unspecified or vague location
public class OtherLocation extends Location {

    //Value of the special type tag for an OtherLocation
    public static final String TYPE = "other";

    /**
     * Declares a OtherLocation
     */
    public OtherLocation() {
        super();
        tags.put(TYPE_KEY, TYPE);
    }

    /**
     * Create a new OtherLocation from a Location as a JSON String
     * The JSON String should represent an OtherLocation
     * @param locationAsJSONString A Location represented by a JSON String
     */
    public OtherLocation(String locationAsJSONString) throws ParseException {
        super(locationAsJSONString);
    }

    @Override
    public String fancyPrint() {
        return tags.get("other").toString();
    }
}
