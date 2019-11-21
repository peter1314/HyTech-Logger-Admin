package com.pwagstaff.csv;

import com.pwagstaff.itemEntry.ItemEntry;
import com.pwagstaff.itemTypes.ItemType;
import com.pwagstaff.itemTypes.typeBuildingBlocks.attributes.Attribute;
import com.pwagstaff.locations.Location;

import java.io.FileWriter;
import java.io.IOException;

public class CSVAdapter {

    private static FileWriter csvWriter;

    public static void initialize(String fileName) {
        try { csvWriter = new FileWriter(fileName);
        } catch (IOException e) {}
    }

    public static void addEntryHeader(ItemType itemType) {
        try {
            csvWriter.append("Code");
            csvWriter.append(",");
            csvWriter.append("Location");
            csvWriter.append(",");
            for(Attribute rowAttribute: itemType.ROW_ATTRIBUTES) {
                csvWriter.append(rowAttribute.NAME);
                csvWriter.append(",");
            }
            csvWriter.append("\n");
            csvWriter.append("\n");
        } catch (IOException e) {}

    }

    public static void addEntry(ItemEntry entry) {
        try {
            csvWriter.append(entry.getData("code"));
            csvWriter.append(",");

            Location entryLocation = Location.LocationFromJSON(entry.getData("location"));
            csvWriter.append(entryLocation.fancyPrint());
            csvWriter.append(",");
            for(Attribute rowAttribute: entry.getType().ROW_ATTRIBUTES) {
                csvWriter.append(entry.getData(rowAttribute.KEY));
                csvWriter.append(",");
            }
            csvWriter.append("\n");
        } catch (IOException e) {}
    }

    public static void closeCSV() {
        try {
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {}
    }
}
