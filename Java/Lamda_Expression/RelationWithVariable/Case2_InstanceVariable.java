package Lamda_Expression.RelationWithVariable;

public class Case2_InstanceVariable {
    int i = 10; // Object Level or Instance Variable
   public void call(){
       inter in = ()->{
           System.out.println(i);
           int i = 7;  // Variable Shadowing or variable Hiding
           System.out.println(i);
           System.out.println(this.i);
       };
       in.m1();
   }

    public static void main(String[] args) {
        Case2_InstanceVariable c2= new Case2_InstanceVariable();
        c2.call();
    }
}
