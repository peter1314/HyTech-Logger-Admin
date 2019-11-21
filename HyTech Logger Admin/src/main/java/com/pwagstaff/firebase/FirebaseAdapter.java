package com.pwagstaff.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;
import com.google.firebase.internal.NonNull;
import com.pwagstaff.GlobalVariables;
import com.pwagstaff.itemEntry.ItemEntry;
import com.pwagstaff.itemTypes.ItemType;
import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseAdapter {

    private static  DatabaseReference rootRef;

    public static void intializeDatabase() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("project-credentials.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://hytech-logger.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        rootRef = FirebaseDatabase.getInstance().getReference();
    }

    /**
     * Set node in the database to a specified value
     * @param path Path to node
     * @param data Data to put in node
     */
    private static void setData(String path, String data) {
        rootRef.child(GlobalVariables.databaseBranch).child(path).setValueAsync(data);
    }

    /**
     * Specifiy action to perform on the grabbing of a DataSnapshot of a node
     * @param path Path to node
     * @param action firebase.DataUpdateAction to perform on grab
     */
    public static void onGrab(String path, final DataUpdateAction action) {
        rootRef.child(GlobalVariables.databaseBranch).child(path).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                action.doAction(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
    }

    /**
     * Specifiy action to perform on the update of a DataSnapshot of a node
     * @param path Path to node
     * @param action firebase.DataUpdateAction to perform on update
     */
    public static void onUpdate(String path, final DataUpdateAction action) {
        rootRef.child(GlobalVariables.databaseBranch).child(path).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                action.doAction(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
    }

    /**
     * Adds a ItemEntry to the Logs of a Data
     * Also sets the LAST node to this ItemEntry
     * @param timeStamp Chronologically formatted date, used as node tag
     * @param entry ItemEntry to set as node value
     */
    public static void addDataEntry(String timeStamp, ItemEntry entry) {
        setData(entry.getType().BRANCH + "/" + entry.getData("code") + "/LOGS/LAST", entry.toString());
        setData(entry.getType().BRANCH + "/" + entry.getData("code") + "/LOGS/" + timeStamp, entry.toString());
    }

    /**
     * Static method to generate a ItemEntry from a DataSnapshot
     * @param itemType ItemType of the item in the database snapshot
     * @param snapshot DataSnapshot to generate ItemEntry from
     * @return ItemEntry initialized from snapshot
     */
    public static ItemEntry entryFromSnapshot(ItemType itemType, DataSnapshot snapshot) {
        return new ItemEntry(itemType, snapshot.getValue().toString());
    }
}
