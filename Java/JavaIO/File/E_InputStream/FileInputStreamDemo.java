package JavaIO.File.E_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) throws IOException {
        int size;

        //FileInputStream
        File file = new File(DIR,"COPYRIGHT");

        // Several InputStream Methods
        try(FileInputStream fileInputStream = new FileInputStream(file)){

            // Available Bytes for reading
            System.out.println(fileInputStream.available() + " bytes") ;

            // Set Half Bytes
            int half = fileInputStream.available()/4;
            // Reading Process
            for (int i = 0; i < half; i++) {
                System.out.print((char)(fileInputStream.read()));
            }
            System.out.println();

            // Now again check available bytes
            System.out.println(fileInputStream.available() + " bytes") ;

            // Reading via byte array
            byte[] bytes = new byte[half];
            if(fileInputStream.read(bytes) != half){
                System.out.println("Could Not Read " + half + " number of bytes");
            }
            System.out.println(new String(bytes,0,half));
            System.out.println("Still Available " + (size = fileInputStream.available()));

            // Skip Half of Remaining Bytes
            fileInputStream.skip(size/2);
            System.out.println("Still Available " +fileInputStream.available());

            // Read with Offset
            System.out.println("Reading " + half/2 + " into the end of array");
            if(fileInputStream.read(bytes,half/2,half/2) != half){
                System.out.println("Could Not Read " + half + " number of bytes");
            }

            System.out.println(new String(bytes,0, bytes.length));
            System.out.println("Still Avaialble " +fileInputStream.available());


        }


    }
}
