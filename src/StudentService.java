import java.util.ArrayList;
import java.util.List;

public class StudentService {

    static List<StudentEntity> students = new ArrayList<>();


    static {
        students.add(new StudentEntity(1, "Hesenzade Fexri", 95));
        students.add(new StudentEntity(2, "Hesenzade Cesaret", 95));
        students.add(new StudentEntity(3, "Yusubov Elvin", 65));
        students.add(new StudentEntity(4, "Atakisiyev Seymur", 95));
    }


    //Read
    public List<StudentEntity> getAllStudents() {
        return students;
    }

    public StudentEntity getStudentById(int id) {
        for (StudentEntity st : students) {
            if (st.getId() == id) {
                return st;
            }
        }
        return null;
    }

    //Create
    public void add(StudentEntity object) {
        students.add(object);
    }

    //Delete
    public boolean deleteById(int id) {
        boolean f = false;
        for (StudentEntity st : students) {
            if (st.getId() == id) {
                students.remove(st);
                f = true;
            }
        }
        return f;
    }

    //Update
    public void updateOfGpa(int id, int gpa){
        for(StudentEntity st:students){
            if(st.getId()==id){
                st.setGpa(gpa);
            }
        }
    }

    //Ortalama
    public List<StudentEntity> gpaMethod(int gpa){
        List<StudentEntity> studentGpa=new ArrayList<>();

        for(StudentEntity st:students){
            if(st.getGpa()>=gpa){
               studentGpa.add(st);
            }
        }

        return studentGpa;
    }

}
