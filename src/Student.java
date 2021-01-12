public class Student extends User{
    private int stuId;
    private String zhuanye;
    public Student(int stuID ,String zhuanye){
        this.stuId=stuID;
        this.zhuanye=zhuanye;
    }
    public int getName() {
        return stuId;
    }

    public void setName(int name) {
        this.stuId = name;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

}
