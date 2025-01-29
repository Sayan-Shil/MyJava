package Java8.Predicate.PredicateJoining;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String name;
    int id;
    User(String name, int id){
        this.name= name;
        this.id =  id;
    }

}

public class Authentication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Predicate<User> p = user -> user.name.equals("Sayan") && user.id ==61;
        String name;
        int id;
        System.out.print("UserName : ");
        name = sc.nextLine();
        System.out.print("Password : ");
        id = sc.nextInt();
        User user = new User(name.trim(),id);
        System.out.println( p.test(user) ? "Authentication Success !!" : "Authentication Failed");


    }
}
