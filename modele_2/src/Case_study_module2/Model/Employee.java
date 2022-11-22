package Case_study_module2.Model;

public class Employee extends Person{
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String maSo, String ten, String ngaySinh, String gioiTinh, String cMND, String phone,
                    String email, String trinhDo, String viTri, double luong) {
        super(maSo, ten, ngaySinh, gioiTinh, cMND, phone, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
