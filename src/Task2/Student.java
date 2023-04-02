// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894
package Task2;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        if(name.length() < 5){
            throw new IllegalArgumentException("Name must be longer that 5 character");

        }else{
            this.name = name;
        }
        if(age < 18){
            throw new IllegalArgumentException("Student is age must be greater than 17");
        }else {
            this.age = age;
        }

    }
}
