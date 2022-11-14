package demo;
public class MyWebsite {
    public static String WEBSITE = "gpcoder.com";
}
  class UsingStaticExample {

    private String subject;

    UsingStaticExample (String subject) {
        this.subject = subject;
    }

    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + MyWebsite.WEBSITE);
    }

    public static void changeWebsite(String website) {
        MyWebsite.WEBSITE = website;
    }


     public static void main(String[] args) {
         UsingStaticExample ex1 = new UsingStaticExample("Java Core");
        ex1.changeWebsite("abc.com");
        ex1.print();
        System.out.println("----");
        UsingStaticExample.changeWebsite("https://gpcoder.com");
        ex1.print();

}
  }