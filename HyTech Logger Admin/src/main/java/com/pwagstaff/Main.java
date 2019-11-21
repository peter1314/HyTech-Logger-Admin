package com.pwagstaff;

import com.google.firebase.database.DataSnapshot;
import com.pwagstaff.csv.CSVAdapter;
import com.pwagstaff.firebase.DataUpdateAction;
import com.pwagstaff.firebase.FirebaseAdapter;
import com.pwagstaff.itemTypes.CellType;
import com.pwagstaff.itemTypes.ItemType;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    /*private static String databaseBranch = "WUNDERMAN_DEMO";
    private static ItemType itemTypeToGrab = new CellType();
    private static String outputFile = "output.csv";*/

    public static void main(String[] args) throws InterruptedException {
        try {
            FirebaseAdapter.intializeDatabase();
        } catch (IOException e) { e.printStackTrace(); }
        /*
        getUserInput();

        GlobalVariables.databaseBranch = databaseBranch;
        GlobalVariables.currentItemType = itemTypeToGrab;
        CSVAdapter.initialize(outputFile);
        CSVAdapter.addEntryHeader(GlobalVariables.currentItemType);

        System.out.println("Grabbing Data");
        FirebaseAdapter.onGrab(GlobalVariables.currentItemType.BRANCH, new DataUpdateAction() {
            @Override
            public void doAction(DataSnapshot snapshot) {
                for(DataSnapshot item: snapshot.getChildren()) {
                    CSVAdapter.addEntry(FirebaseAdapter.entryFromSnapshot(GlobalVariables.currentItemType, item.child("LOGS/LAST")));
                }
                CSVAdapter.closeCSV();
                System.out.println("Done!");
            }
        });*/
        //Thread.sleep(10000);
    }

    /*private static void getUserInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Provide Information");

        System.out.println("Database Branch: ");
        databaseBranch = input.nextLine();

        boolean validType = false;

        while(!validType) {
            System.out.println("Item Type: ");
            String itemType = input.nextLine();

            for(ItemType curType: GlobalVariables.ACTIVE_ITEM_TYPES) {
                if(itemType.toUpperCase().equals(curType.NAME)) {
                    itemTypeToGrab = curType;
                    validType = true;
                }
            }
            if(!validType) { System.out.println("No Such Item Type"); }
        }

        System.out.println("Output File: ");
        outputFile = input.nextLine();
    }*/
}
