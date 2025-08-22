package JavaIO.File.B_Directories;

import java.io.File;

public class Directories {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void br(){
        System.out.println("\n\n");
    }

    public static void main(String[] args) {

        // A Directory is also a File
        File SavedFile = new File(DIR);
        System.out.println(SavedFile.isDirectory() ? "Directory" : "Not a Directory");

        // Get All Files inside Directory with list() method
        String[] files = SavedFile.list();
        System.out.println("The Files Are :  \n");
        for(String file : files){
            System.out.println(file);
        }
        System.out.println("\n\n");

        // Fetch All File, Folder even a file inside folder from the folder
        for(String filename : files ){
            File file = new File(SavedFile.getAbsolutePath() + "/" +filename);
            if(file.isDirectory()){
                System.out.println(filename + " (Directory)");
                String[] insideFile = file.list();
                for(String filenames : insideFile){
                    System.out.println("------  " + filenames);
                }
            } else{
                System.out.println(filename);
            }
        }




    }
}
