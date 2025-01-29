package Java8.Supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class GenerateOTP {
    public static void main(String[] args) {
        System.out.println("Enter OTP");
        Supplier<String> s = () -> (int)(1000 + Math.random()*9000)  + "" + (char) ('A' + (int) (Math.random() * 26)) + "ff";
        String otp = s.get();
        System.out.println(otp);

        Scanner sc=new Scanner(System.in);
        int attempt = 10;
        for (int i = 0; i <10 ; i++) {
            System.out.println("Enter The OTP ");
            String OTP = sc.nextLine();
            if(OTP.equals(otp)){
                System.out.println("Authentication Successful");
                break;
            }

        }



    }
}
