package generic;

public class Student<T> {
    T rollNo;
    String name;

    public Student(T rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void setRollNo(T rollNo){
        this.rollNo = rollNo;
    }
    public T getRollNo(){
        return rollNo;
    }

    public static void main(String[] args) {
        Student<Integer> student = new Student<>(12,"vaibhav");
        Student<String> stringStudent = new Student<>("BCA12", "ramesh");
        Integer rollNo1 = student.getRollNo();
        String rollNo2 = stringStudent.getRollNo();


    }

}
