package Lamda_Expression.RelationWithVariable;

public class Case3_MethodLocalVariables {
    public void call(){
        int i=10;
        inter in = ()->{
            System.out.println(i);
           // System.out.println(i++);


        };
        in.m1();
    }

    public static void main(String[] args) {
        Case3_MethodLocalVariables c3 = new Case3_MethodLocalVariables();
        c3.call();
    }
}
