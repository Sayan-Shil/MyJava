package Lamda_Expression.RelationWithVariable;

public class Case1_StaticVariable {
    static int x = 10; // Static Variable or Class level Variable

    public static void main(String[] args) {
        inter i = ()->
        {
            System.out.println(x);
            int x=7; // Variable Shadowing or Variable Hiding
            System.out.println(x);
            System.out.println(Case1_StaticVariable.x);

        };
        i.m1();
        // 10 Before Variable Shadowing
        // 7 After Variable Shadowing
        // 10 After calling Class level
    }
}
