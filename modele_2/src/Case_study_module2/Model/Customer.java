package Case_study_module2.Model;

public class Customer extends Person{
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String maSo, String ten, String ngaySinh, String gioiTinh, String cMND,
                    String phone, String email, String loaiKhach, String diaChi) {
        super(maSo, ten, ngaySinh, gioiTinh, cMND, phone, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
