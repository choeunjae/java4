import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses;

    public Student() {
        super();
        this.courses = new ArrayList<>();
    }

    public Student(String id, String name,String birthDate, String status, String contact){
        super(id, name, status, birthDate, contact);
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course){
        this.courses.add(course);
    }

    public void printInfo(){
        super.printInfo();
        printCourses();
    }

    public void printCourses(){
        System.out.println("수강 과목 목록");
        if(courses.isEmpty())
            System.out.println("없음");
        else
            for(String course: courses)
                System.out.println(course);
    }
}