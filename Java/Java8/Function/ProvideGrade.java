package Java8.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentMarks{
   String name;
    int marks;

    StudentMarks(String name,int marks){
        this.name = name;
        this.marks= marks;
    }

    @Override
    public String toString() {
        String s = String.format("%s --> %d",name,marks);
        return s;
    }
}

public class ProvideGrade {
    public static void applyFunction(Function<StudentMarks,String> func, ArrayList<StudentMarks> student){
        for( StudentMarks s : student) {
            System.out.println(s + "-->" + func.apply(s));
        }
    }
    public static void applyFunctionWithPredicated(Predicate<StudentMarks> p, Function<StudentMarks, String> func, ArrayList<StudentMarks> student){
        for( StudentMarks s : student) {

            System.out.println( p.test(s) ? (s + "-->" + func.apply(s)+ "--> Eligible For Gold") : (s + "-->" + func.apply(s)) );
        }
    }
    public static StudentMarks addStudents(String name, int marks){
        return new StudentMarks(name, marks);
    }
    public static void main(String[] args) {
        ArrayList<StudentMarks> s = new ArrayList<>();
        s.add(addStudents("Sayan",87));
        s.add(addStudents("Alice", 92));
        s.add(addStudents("Bob", 55));
        s.add(addStudents("Charlie", 88));
        s.add(addStudents("David", 74));
        s.add(addStudents("Eva", 95));
        s.add(addStudents("Frank", 55));
        s.add(addStudents("Grace", 85));
        s.add(addStudents("Hannah", 78));
        s.add(addStudents("Ivy", 82));
        s.add(addStudents("Jack", 45));
        s.add(addStudents("Kylie", 68));
        s.add(addStudents("Liam", 34));
        s.add(addStudents("Mia", 72));
        s.add(addStudents("Nina", 56));
        s.add(addStudents("Oscar", 79));
        s.add(addStudents("Paul", 65));
        s.add(addStudents("Quincy", 77));
        s.add(addStudents("Ruby", 89));
        s.add(addStudents("Sophia", 63));



        // Give Grade
        // A: 90 and above
        //B: 80 to 89
        //C: 70 to 79
        //D: 60 to 69

        Function<StudentMarks,String> func1 = sm -> (sm.marks >=90) ? "A" : (sm.marks>=80 && sm.marks<90) ? "B" : (sm.marks>=70 && sm.marks<80) ? "C" : (sm.marks>=60 && sm.marks<70) ? "D" : "E";
        applyFunction(func1,s);

        // Classroom says that those who are above Marks 85 , Eligible for Gold
        Predicate<StudentMarks> pred1 = sm2 -> sm2.marks > 85;
        applyFunctionWithPredicated(pred1,func1,s);






    }


}
