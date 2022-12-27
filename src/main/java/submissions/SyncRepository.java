package submissions;

import java.io.*;

public class SyncRepository {
    private static final String GITHUB_USERNAME = "hardikkwl";
    private static final String BASE_FOLDER = "../core";

    // Creates a folder if it doesn't exist
    private static void createFolder(String filePath){
        File f = new File(filePath);

        if(f.exists()){
            System.out.println("Skipping creation of folder as it already exists");
            return;
        }

        boolean isFolderCreated = f.mkdir();

        if(isFolderCreated){
            System.out.println("Folder successfully created for the user");
        }
        else{
            System.out.println("Error in folder creation. Please try again...");
        }
    }

    private static void runSync(){
        createFolder(GITHUB_USERNAME);
    }

    public static void main(String[] args) {
         runSync();
    }
}
