package ss16_doc_ghi_file.thuc_hanh.Demo_doc_ghi_file_object;

public class Student {
    private int id;
    private String name;
    private String module;

    public Student() {
    }
    public  String writeInfor(){
        return this.id +","+this.name+","+this.module;
    }
    public Student(int id, String name, String module) {
        this.id = id;
        this.name = name;
        this.module = module;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
