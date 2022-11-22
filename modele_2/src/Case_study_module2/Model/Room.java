package Case_study_module2.Model;

public class Room extends Facility {
    private String dichVuFree;

    public Room() {
    }

    public Room(String name, double dienTichSuDung, double giaPhong,
                int soNguoiSuDungToiDa, String kieuThue, String dichVuFree) {
        super(name, dienTichSuDung, giaPhong, soNguoiSuDungToiDa, kieuThue);
        this.dichVuFree = dichVuFree;
    }

    public String getDichVuFree() {
        return dichVuFree;
    }

    public void setDichVuFree(String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }
}
