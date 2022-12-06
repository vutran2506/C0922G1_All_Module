package Case_study_module2.model;

public class Menu {
private  String infor;

    public Menu(String infor) {
        this.infor = infor;
    }
    public Menu(){

    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    @Override
    public String toString() {
        return infor ;

    }
}
