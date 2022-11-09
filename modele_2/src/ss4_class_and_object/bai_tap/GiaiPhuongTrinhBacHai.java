package ss4_class_and_object.bai_tap;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        class QuadraticEquation {
            double a, b, c;

            public QuadraticEquation() {
            }

            public QuadraticEquation(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public double getA() {
                return a;
            }

            public double getB() {
                return b;
            }

            public double getC() {
                return c;
            }

            public double getDiscriminant() {
                return this.b * this.b - 4 * this.a * this.c;

            }

            public double getRoot1() {
              return (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;

            }
            public double getRoot2(){
                return (-this.b-Math.sqrt(getDiscriminant()))/2*this.a;
            }

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc hai có dạng:ax^2 + bx + c = 0.");
        System.out.println("Nhập giá  trị a");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Giá trị delta là: "+ quadraticEquation.getDiscriminant());
        if(a==0){
            System.out.println("Nghiệm của phương trình là: "+ (-c/b));
        } else if (quadraticEquation.getDiscriminant()>0) {
            System.out.println("Phương trình có 2 ghiệm phân biệt là"+ quadraticEquation.getRoot1()+ " và "+quadraticEquation.getRoot2());

        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("Phương trinh có nghiệm kép là:"+(-b/2*a));
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
