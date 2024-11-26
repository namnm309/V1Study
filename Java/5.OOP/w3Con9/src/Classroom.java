public class Classroom {
    private String className;
    private String students[];

    public Classroom (String className,String students[]){
        this.className=className;
        this.students=students;
    }

    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }

    public void display(){
        System.out.println("ClassName : "+getClassName());
        System.out.println("Students : ");
        for (String student :students){
            System.out.println(student+" ");
        }
        System.out.println("");
    }
}
