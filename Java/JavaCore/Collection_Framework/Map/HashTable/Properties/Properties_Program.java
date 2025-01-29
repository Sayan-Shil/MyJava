package JavaCore.Collection_Framework.Map.HashTable.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_Program {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties p = new Properties();
        FileInputStream f = new FileInputStream("Java/JavaAdvance.Collection_Framework/Map/HashTable/Properties/Properties");
        p.load(f);
        p.setProperty("Adress", "97,Sri Krishna Nagar, Belgharia, Kolkata- 700056");
        System.out.println(p);
        FileOutputStream o = new FileOutputStream("Java/JavaAdvance.Collection_Framework/Map/HashTable/Properties/Properties");
        p.store(o,"Subject Changed !");




    }

}
