package JavaIO.File.E_InputStream;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {

        // Only works on Byte Array
        String source = """
                Happy 84th Birthday to the U.S. Explosive Ordnance Disposal community!
                
                Since the first
                @USNavy
                 mine disposal class in 1941, EOD technicians have bravely confronted bombs, IEDs and hazardous threats to protect lives and missions.
                
                """;

        byte[] byteSource = source.getBytes();

        // Get Constructor According to the read function of fileInputStream
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteSource);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteSource,0,20); // Take first 20 bytes

        // Special Reset in ByteInputStream

        for (int i = 0; i <2 ; i++) {
            int c;


            while( (c = byteArrayInputStream.read()) != -1){
                if(i==0) {
                    System.out.print((char)c);
                } else{
                    System.out.print(Character.toUpperCase((char)c));
                }
            }
            System.out.println();
            byteArrayInputStream.reset();
        }

    }
}
