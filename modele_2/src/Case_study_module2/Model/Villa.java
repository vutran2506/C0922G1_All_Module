package Case_study_module2.Model;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    public int soTang;

    public Villa() {
    }

    public Villa(String name, double dienTichSuDung, double giaPhong, int soNguoiSuDungToiDa, String kieuThue,
                 String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(name, dienTichSuDung, giaPhong, soNguoiSuDungToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
