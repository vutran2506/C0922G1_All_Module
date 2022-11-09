package ss4_class_and_object.bai_tap;

public class PhuongTrinhBachai {
    public static void main(String[] args) {
        class QuadraticEquation {
            double a, b, c,delta;

            public QuadraticEquation() {
            }

            public QuadraticEquation(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            public double SolveQuadraticEquation() {
                return delta =  (this.b * this.b - 4 * this.a * this.c);
            }
        }
    }
}
