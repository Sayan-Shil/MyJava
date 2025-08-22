package JavaIO.File.F_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) {

        //Create String Source
        String source = """
                #SpaceForce launched the #X37B on a
                @SpaceX
                 Falcon 9 last night marking the eighth flight for the program.
                
                Mission 8 will continue to pioneer operational demonstrations and experimentation in space.
                
                #USSF36
                
                """;

        // As OutputStream is byte oriented, so we need to convert it into byte array
        byte[] sourceByte = source.getBytes();

        // Make OutputStream Object
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;

        try{

            fileOutputStream = new FileOutputStream(DIR + "/" + "file1.txt");
            fileOutputStream2 = new FileOutputStream(DIR + "/" + "file2.txt");
            fileOutputStream3 = new FileOutputStream(DIR + "/" + "file3.txt");

            // Write first file one by one byte
            for (int i = 0; i < sourceByte.length ; i+=2) {
                fileOutputStream.write(sourceByte[i]);
            }

            // Write File all at once
            fileOutputStream2.write(sourceByte);

            // Write File with offset, limit
            fileOutputStream3.write(sourceByte, sourceByte.length - sourceByte.length/4, sourceByte.length/4 );


        } catch (IOException e){
            System.out.println("IO Exception occurred");
        } finally {
            try{
                if(fileOutputStream !=null)
                    fileOutputStream.close();
            } catch(IOException e){
                System.out.println("IO Exception occurred");
            }

            try{
                if(fileOutputStream2 !=null)
                    fileOutputStream2.close();
            } catch(IOException e){
                System.out.println("IO Exception occurred");
            }

            try{
                if(fileOutputStream3 !=null)
                    fileOutputStream3.close();
            } catch(IOException e){
                System.out.println("IO Exception occurred");
            }
        }

    }
}
