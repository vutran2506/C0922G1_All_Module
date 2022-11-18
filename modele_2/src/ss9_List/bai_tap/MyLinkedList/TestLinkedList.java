package ss9_List.bai_tap.MyLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student = new Student(1, "Vũ");
        Student student1 = new Student(2, "Hậu");
        Student student2 = new Student(3, "Hùng");
        Student student3 = new Student(4, "Đạt");

        myLinkedList.addFirst(student);
        myLinkedList.addLast(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.add(2, student3);

        myLinkedList.remove(0);

        myLinkedList.remove(student2);

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student students = (Student) myLinkedList.get(i);
            System.out.println(students.getId() + students.getName());
        }

        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student students = (Student) cloneLinkedList.get(i);
            System.out.println(students.getId() + students.getName());

        }
        System.out.println(myLinkedList.constrains(student));

        System.out.println(myLinkedList.indexOf(student3));
    }
}
