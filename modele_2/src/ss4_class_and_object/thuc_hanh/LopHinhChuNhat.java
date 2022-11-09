package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    public  static  void main(String[] args) {
        class Rectangle {
            double width, height;

            public Rectangle() {
            }

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double getArea() {
                return this.width * this.height;
            }

            public double getPerimeter() {
                return (this.width + this.height) * 2;
            }

            public String Display() {
                return  "Rectangle{"+"width ="+ width+",height="+height+"}";
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng");
        double height = scanner.nextDouble();
        Rectangle retangle = new Rectangle(width,height);
        System.out.println("Your rectangle \n"+ retangle.Display());
        System.out.println("Perimeter of  the Rectangle " + retangle.getPerimeter() );
        System.out.println("Area of the Rectangle  " + retangle.getArea());
    }
}

