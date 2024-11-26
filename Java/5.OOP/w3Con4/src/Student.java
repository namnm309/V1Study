public class Student {
    private int studentId;
    private String studentName;
    private String grade;

     public Student(){
        this(0,"Unknown","None");
    }

    public Student (int studentId,String studentName,String grade){
        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGrade() {
        return grade;
    }

    



}
