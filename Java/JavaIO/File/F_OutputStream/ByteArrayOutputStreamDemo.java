package JavaIO.File.F_OutputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamDemo {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) {

        // Default buffer size of 32
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Collecting String to byte array
        String s = " This should be end up in the array ";
        byte[] buf = s.getBytes();

        // Writing Operation on ByteArrayOutputStream
        try{
            byteArrayOutputStream.write(buf);
        } catch (Exception E){
            System.out.println(E.getMessage());
        }

        // Try Accessing written stream
        System.out.println(byteArrayOutputStream.toString());
        System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));

        // Save the byte array into a file
        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(DIR,"/byteArray.txt"))){

            // Transferring content into another OutputStream
            byteArrayOutputStream.writeTo(fileOutputStream);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        byteArrayOutputStream.reset();
        System.out.println(byteArrayOutputStream);


    }
}
