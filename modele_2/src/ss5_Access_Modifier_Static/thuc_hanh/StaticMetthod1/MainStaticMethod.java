package ss5_Access_Modifier_Static.thuc_hanh.StaticMetthod1;

public class MainStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111,"Vũ thứ Nhất");
        StaticMethod s2 = new StaticMethod(222,"Vũ thứ hai");
        StaticMethod s3 = new StaticMethod(333,"Vũ thứ ba");
     s1.display();
     s2.display();
     s3.display();
    }
}
