package ss5_Access_Modifier_Static.thuc_hanh.StaticMetthod1;

public  class StaticMethod {
    private  int rollno;
    private  String name;
    private static String college= "BBDIT";

    StaticMethod (int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
       }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCollege(String college) {
        StaticMethod.college = college;
    }
    static void change(){
        college = "CODEGYM";
    }
    void  display (){
        System.out.println(rollno+" "+name+" "+college);
    }

    @Override
    public String toString() {
        return "StaticMethod{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}