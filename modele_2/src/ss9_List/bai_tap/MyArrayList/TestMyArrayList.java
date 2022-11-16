package ss9_List.bai_tap.MyArrayList;

public class TestMyArrayList {
    public static   class Student{
        private int id;
        private  String name;
        public Student(){

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

        public  static  void main(String[] args) {
            Student student = new Student(1,"vũ");
            Student student1 = new Student(2,"hải");
            Student student2 = new Student(3,"bảo");
            Student student3 = new Student(4,"huỳnh");
            Student student5 = new Student(5,"duy");

            MyArrayList<Student> studentMyArrayList =  new MyArrayList<>();
            MyArrayList<Student> newMyArraylist = new MyArrayList<>();


            studentMyArrayList.add(student);
            studentMyArrayList.add(student1);
            studentMyArrayList.add(student2);
            studentMyArrayList.add(student3);
            studentMyArrayList.add(student5,2);

//            studentMyArrayList.clear();

//            newMyArraylist = studentMyArrayList.clone();

//            newMyArraylist.remove(2);

//            for (int i = 0; i < newMyArraylist.size(); i++) {
//                System.out.println(newMyArraylist.get(i).getName());
//            }

//            for (int i = 0; i < newMyArraylist.size(); i++) {
//                System.out.println(newMyArraylist.get(i).getName());
//            }

            System.out.println(studentMyArrayList.get(3).getName());

//            System.out.println(studentMyArrayList.size());

//            System.out.println(studentMyArrayList.indexOf(student3));

//            System.out.println(studentMyArrayList.contains(student3));

//            for (int i = 0; i < studentMyArrayList.size(); i++) {
//                Student student4 = (Student) studentMyArrayList.elements[i];
//                System.out.println(student4.getId());
//                System.out.println(student4.getName());
//            }
        }
    }
}
