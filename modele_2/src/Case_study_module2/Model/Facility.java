package Case_study_module2.Model;

public class Facility {
    private String name;
    private double dienTichSuDung;
    private double giaPhong;
    private int soNguoiSuDungToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String name, double dienTichSuDung, double giaPhong, int soNguoiSuDungToiDa, String kieuThue) {
        this.name = name;
        this.dienTichSuDung = dienTichSuDung;
        this.giaPhong = giaPhong;
        this.soNguoiSuDungToiDa = soNguoiSuDungToiDa;
        this.kieuThue = kieuThue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getSoNguoiSuDungToiDa() {
        return soNguoiSuDungToiDa;
    }

    public void setSoNguoiSuDungToiDa(int soNguoiSuDungToiDa) {
        this.soNguoiSuDungToiDa = soNguoiSuDungToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
