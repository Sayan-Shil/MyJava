package JavaIO.File.C_Filtering;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Filtering_Files {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) {

        //Making a directory reference
        File file = new File(DIR);

        FilenameFilter onlyJavaFile  = new OnlyExt("java");
        String[] javaFiles = file.list(onlyJavaFile);
        for(String jFile : javaFiles){
            System.out.println(jFile);
        }

        FilenameFilter onlyDirectory  = new OnlyDirectory();
        String[] directory = file.list(onlyDirectory);
        for(String dir : directory){
            System.out.println(dir);
        }

        // Using Lambda
        String[] onlyHtml = file.list((directoryname, filename) -> filename.endsWith(".html"));
        System.out.println("Only HTML >>>>>");
        for(String dir : onlyHtml){
            System.out.println(dir);
        }
        System.out.println("------------");


        // Extracting Files Only Not String
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f.getName());
        }

        // Create a FileFilter
        FileFilter filter = File::isDirectory;


    }

}


class OnlyExt implements FilenameFilter{
    String ext;

    OnlyExt(String ext){
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);  // If true, accept or reject
    }
}

class OnlyDirectory implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) { // dir means the root folder
//        return dir.isDirectory(); ***
        File f = new File(dir, name);  // Now pointing to the actual file
        return f.isDirectory();         // Accept only if it’s a directory
    }
}

