package Java8.Bi_Functional_Interfaces.BiFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiFunction;

//Create a Java program that uses a BiFunction to calculate the total marks of a student by taking two custom objects as input:
//Student: Contains the student's name and ID.
//Marks: Contains marks for three subjects (Math, Science, English).
//The BiFunction should return the total marks of the student.
class Student{
    String name;
    int id;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
class Marks{
    int ID;
    int Math;
    int Science;
    int English;

    Marks(int ID, int Math, int Science , int English){
        this.ID =ID;
        this.Math = Math;
        this.English=English;
        this.Science = Science;
    }


}
public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Marks> markList = new ArrayList<>();

        BiFunction<String,Integer,Student> createStudent = (name,id) -> new Student(name,id);
        studentList.add(createStudent.apply("Sayan",61));
        studentList.add(createStudent.apply("Arnab",57));
        studentList.add(createStudent.apply("Bibek",62));
        studentList.add(createStudent.apply("Shuvradip",34));
        studentList.add(createStudent.apply("Sahoo",63));

        markList.add(new Marks(61,87,85,89));
        markList.add(new Marks(57,87,84,95));
        markList.add(new Marks(62,97,92,93));
        markList.add(new Marks(34,79,84,85));
        markList.add(new Marks(63,88,74,91));

        // BiFunction to calculate total marks for a student
        BiFunction<Student, Marks, Integer> calculateTotalMarks = (student, marks) ->
                (student.id == marks.ID) ? marks.Math + marks.Science + marks.English : 0;

        // HashMap to store student names and their total marks
        HashMap<String, Integer> studentTotalMarks = new HashMap<>();

        // Iterate through the students and marks lists to calculate total marks
        for (Student student : studentList) {
            for (Marks marks : markList) {
                int totalMarks = calculateTotalMarks.apply(student, marks);
                if (totalMarks > 0) { // Only add if IDs match
                    studentTotalMarks.put(student.name, totalMarks);
                    break;
                }
            }
        }

        studentTotalMarks.forEach((name, totalMarks) ->
                System.out.println("Student: " + name + ", Total Marks: " + totalMarks)
        );



    }

}
