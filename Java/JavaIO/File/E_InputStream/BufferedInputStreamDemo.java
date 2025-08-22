package JavaIO.File.E_InputStream;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static final String DIR = "/home/sayan/IdeaProjects/MyJava/Java/JavaIO/SavedFile";

    public static void main(String[] args) throws IOException{

        String text = "ABCDEFGHIJKLMNOPQRSTUVW";
        ByteArrayInputStream bais = new ByteArrayInputStream(text.getBytes());
        BufferedInputStream bis = new BufferedInputStream(bais);

        System.out.println("markSupported? " + bis.markSupported());

        // Read first 3 chars
        System.out.print((char) bis.read()); // A
        System.out.print((char) bis.read()); // B
        System.out.print((char) bis.read()); // C
        System.out.println();

        // Drop a bookmark here (at D)
//        bis.mark(10);
        bis.mark(1);

        // Read next 3 chars
        System.out.print((char) bis.read()); // D
        System.out.print((char) bis.read()); // E
        System.out.print((char) bis.read()); // F
        System.out.println();

        // Now reset back to bookmark (D)
        bis.reset();

        // Re-read from D again
        System.out.print((char) bis.read()); // D
        bis.mark(1);
        System.out.print((char) bis.read()); // E
        System.out.print((char) bis.read()); // F
        System.out.print((char) bis.read()); // G
        System.out.print((char) bis.read()); // H
        System.out.print((char) bis.read()); // I
        System.out.print((char) bis.read()); // J
        System.out.print((char) bis.read()); // K
        System.out.print((char) bis.read()); // L
        System.out.print((char) bis.read()); // M
        System.out.print((char) bis.read()); // N
        System.out.print((char) bis.read()); // O
        System.out.print((char) bis.read()); // P
        System.out.println();
        bis.reset();
        System.out.print((char) bis.read());
        System.out.println();


        // Check Buffered Concept
        String text2 = "ABCDEFGH";
        ByteArrayInputStream bais2 = new ByteArrayInputStream(text2.getBytes());
        BufferedInputStream bis2 = new BufferedInputStream(bais2,5);

        bis2.mark(2);
        System.out.print((char) bis2.read()); // A
        System.out.print((char) bis2.read()); // B
        System.out.print((char) bis2.read()); // C
        System.out.print((char) bis2.read()); // D
        System.out.print((char) bis2.read()); // E
        System.out.print((char) bis2.read()); // F
        System.out.print((char) bis2.read()); // G
        System.out.print((char) bis2.read()); // H


        /*
        Without Buffer:
Java writes A → syscall → OS writes A → back to JVM
Java writes B → syscall → OS writes B → back to JVM
... repeated millions of times

With Buffer:
Java writes A → stores in JVM buffer
Java writes B → stores in JVM buffer
...
Buffer full → syscall → OS writes 8KB at once

         */


    }
}
