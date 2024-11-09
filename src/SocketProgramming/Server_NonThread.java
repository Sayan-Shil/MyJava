package SocketProgramming;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_NonThread {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Creating a ServerSocket with port
        try (ServerSocket ss = new ServerSocket(3000)) {
            System.out.println("Waiting For Client to connect.....");
            Scanner sc = new Scanner(System.in);
            // Creating a Socket to accept request from Client
            // After accepting Client Request, extract Socket Input data and inject Socket Output Data

            try (Socket socket = ss.accept();
                 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());  //Create ObjectOutputStream for writing operation , in parameter we will take OutputStream provided by socket as Destination Path (Client)
                 ObjectInput ois = new ObjectInputStream(socket.getInputStream())) {         //Create ObjectInputStream for reading operation , in parameter we will take InputStream provided by socket as Source Path (Client)

                while (true) {
                    // From Client , Take Object by InputStream
                    String message = (String)ois.readObject();       //Typecasting Object to String and receive String from the Source Path (Client)
                    System.out.println("Client: \n "+ message);

                    // To Server , Send and flush Object by output Stream
                    System.out.println("SERVER:");
                    String Message = sc.nextLine();
                    oos.writeObject(Message);                       // Upcasting String to Object and send Object to the Destination Path (Client)
                    oos.flush();                                   // Ensures that all message totally sent
                }

            }


        }
    }
}