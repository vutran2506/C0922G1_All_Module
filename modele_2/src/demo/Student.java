package demo;

public class Student {

    int rollno;
    String name;
    static String college = "ITS";


        Student() {

    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

class TestStaticVariable1 {
    public static void main(String args[]) {
        StaticMethod s = new StaticMethod(1,"Yaz");
        StaticMethod s1 = new StaticMethod(2,"Ma");
        StaticMethod s2 =new StaticMethod(3 ,"HA");

        s.display();
        s1.display();
        s2.display();
    }
}
//         static là biến dùng chung trong cả class;
