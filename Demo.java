

class Student {
    int rollno;
    String name;
    int marks;
}

class Data {
    private String name = "Adino";
    private int age = 19; 

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

/**
 * Demo
 */

public class Demo {
    public static void main (String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno = 1;
        s1.name = "Frencha";
        s1.marks = 98;

        s2.rollno = 2;
        s2.name = "Frea";
        s2.marks = 89;

        s3.rollno = 3;
        s3.name = "Frena";
        s3.marks = 92;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i<students.length; i++) {
        //     System.out.println(students[i].name + " " + students[i].marks);
        // }

        //using enhanced for loops
        for(Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }

        Data data = new Data();
       int x = data.getAge();
       System.out.println(x);
    }
}