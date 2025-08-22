package JavaIO.File.D_Difference_Between_mkdirAndmkdirs;

import java.io.File;

public class mkdirVsmkdirs {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) {

        /*

        mkdir -- > if parent folder exists, then only create
        mkdirs -- > if parent folder not exists, then create parent then child

         */

        File dir= new File(DIR + "/Parent/Child");
        dir.mkdir();
        dir.mkdirs();


    }
}
