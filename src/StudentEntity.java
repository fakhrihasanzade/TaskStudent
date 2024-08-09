public class StudentEntity {

    private int id;
    private String fulname;
    private int gpa;

    public StudentEntity(int id,String fulname,int gpa){
        this.id=id;
        this.fulname=fulname;
        this.gpa=gpa;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getFulname() {
        return fulname;
    }

    public void setFulname(String fulname) {
        this.fulname = fulname;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", fulname='" + fulname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
