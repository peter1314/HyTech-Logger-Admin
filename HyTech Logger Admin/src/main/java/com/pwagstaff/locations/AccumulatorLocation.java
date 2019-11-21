package com.pwagstaff.locations;

import org.json.simple.parser.ParseException;
import org.junit.Test;

//Represents a location within an accumulator
public class AccumulatorLocation extends Location {

    //Value of the special type tag for an AccumulatorLocation
    public static final String TYPE = "accumulator";

    /**
     * Declare an AccumulatorLocation with an iteration
     * @param iteration The iteration of the accumulator
     */
    public AccumulatorLocation(int iteration) {
        super();
        tags.put(TYPE_KEY, TYPE);
        tags.put("iteration", iteration);
    }

    /**
     * Create a new AccumulatorLocation from a Location as a JSON String
     * The JSON String should represent an AccumulatorLocation
     * @param locationAsJSONString A Location represented by a JSON String
     */
    public AccumulatorLocation(String locationAsJSONString) throws ParseException {
        super(locationAsJSONString);
    }

    @Override
    public String fancyPrint() {
        return "HT0" + tags.get("iteration") + ": Seg " + tags.get("segment") + ", Cell " + tags.get("cell");
    }

    /**
     * Get the iteration of the AccumulatorLocation, which is its year
     * @return The iteration of the AccumulatorLocation
     */
    public int getIteration() { return (int) tags.get("iteration"); }
}
