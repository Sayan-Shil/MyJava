package JavaIO.File.A_Files;

import java.io.File;
import java.util.Date;

public class Files {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) {

        //Constructors
        File file1 = new File(DIR); // Hey, I am now referencing dir
        File file2  = new File(DIR,"firstCreatedFile.txt"); // Hey, I am now referencing a file inside the dir
        File file3 = new File(file1,"secondCreatedFile.txt"); // Hey, I am now referencing a file inside directory of file1

        // Exploring several File Methods
        File copyright = new File(DIR,"COPYRIGHT");
        System.out.println(copyright.getName()); // Get Name
        System.out.println(copyright.getPath()); // Get Short Path
        System.out.println(copyright.getAbsolutePath()); // Get Full Path
        System.out.println(copyright.getParent()); //Parent Name (Upper Directory)
        System.out.println(copyright.exists() ? "File Exists" : "Not exists"); // Check existence
        System.out.println(copyright.canWrite() ? "Writable" : "Not Writable"); //Check if we can write or not?
        System.out.println(copyright.canRead() ? "Readable" : "Not Readable"); //Check if we can read or not?
        System.out.println(copyright.isDirectory() ? "Yes,Directory" : "Not a Directory"); //Check if direction? **
        System.out.println(copyright.isFile() ? "Yes,Normal File" : "Just Named Pipe"); //Check if file ? **
        System.out.println(copyright.isAbsolute() ? "Absolute Path" : "Not Absolute Path");
        System.out.println(copyright.length() + " bytes"); //Size
        System.out.println(new Date(copyright.lastModified())); // It returns millis since January 1, 1970 (Unix epoch)

        // Useful Utility Methods
        boolean checkIfRename = copyright.renameTo(new File(DIR,"COPYRIGHT"));
        System.out.println(checkIfRename);


        // Make BACKUP File First
        File backup = new File(DIR,"BACKUP");
        backup.deleteOnExit(); // JVM off, file gone
//        while(true);

        //More Operations
        System.out.println(copyright.setReadOnly());
        System.out.println(copyright.setReadable(false));
        System.out.println(copyright.setReadable(true));

    }
}
