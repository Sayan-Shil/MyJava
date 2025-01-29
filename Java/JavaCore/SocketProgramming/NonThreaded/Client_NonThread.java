package JavaCore.SocketProgramming.NonThreaded;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_NonThread {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        // Creating a Server with port and host , helps to create a destination path
        try(Socket socket=new Socket("localhost",3000);
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());    //Create ObjectOutputStream for writing operation , in parameter we will take OutputStream provided by socket as Destination Path (SERVER)
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream())){      //Create ObjectInputStream for reading operation , in parameter we will take InputStream provided by socket as Source Path (SERVER)
            while(true){
                Scanner sc=new Scanner(System.in);

                System.out.println("Client:");
                String message= sc.nextLine();
                oos.writeObject(message);      // Upcasting String to Object and send Object to the Destination Path (SERVER)
                oos.flush();                   // Ensure Entire Object is delivered

                System.out.println("SERVER:");
                String Message= (String) ois.readObject();  //Typecasting Object to String and receive String from the Source Path (SERVER)
                System.out.println(Message);


            }


        }
    }
}