public class Main {
    public static void main(String[] args) {

        StudentService s=new StudentService();

        System.out.println(s.getStudentById(1));

        //System.out.println("Silinme edildimi? "+s.deleteById(3));

        s.updateOfGpa(2,100);

        System.out.println(s.getAllStudents());

        System.out.println(s.gpaMethod(70));

    }
}