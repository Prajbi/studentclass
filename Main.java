class student {
    String name;
    int age;
    char grade;
}

public class Main {
    public static void main(String[] args) {
        student student1 = new student();
        student student2 = new student();
        student1.name = "jhon";
        student1.age = 18;
        student1.grade = 'A';
        System.out.println("student name :" + student1.name);
        System.out.println("student age :" + student1.age);
        System.out.println("student grade :" + student1.grade);
    }
}