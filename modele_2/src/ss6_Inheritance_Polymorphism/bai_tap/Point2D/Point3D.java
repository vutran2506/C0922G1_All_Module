package ss6_Inheritance_Polymorphism.bai_tap.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    private Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {

    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float arr1[] = {super.getX(), super.getY(), z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "Có toạ độ z là : " + z +
                super.toString();
    }
}
