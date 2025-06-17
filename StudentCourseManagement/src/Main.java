import java.util.ArrayList;

public class Main {

    final static int student_num = 3; // 상수
    final static int student_info_num = 5;

    // 0 : id, 1 : name, 2 : status, 3 : birthDate, 4 : contact
    static String[][] student = new String[student_num][student_info_num];
    static ArrayList<String>[] courseLists = new ArrayList[student_num];

    public static void setStudent(int index, String id, String name, String status, String birthDate, String contact) {

        if (index >= student_num) {
            if (index == 3)
                System.out.println(index);

            System.out.println("Error-001: Index out of bounds!: " + index);
            return;
        }

        student[index][0] = id;
        student[index][1] = name;
        student[index][2] = status;
        student[index][3] = birthDate;
        student[index][4] = contact;
    }

    public static void addCourse(int index, String courseName) {
        courseLists[index].add(courseName);
    }

    public static void printStudentInfo(int index) {
        System.out.println("=== 학생 " + (index + 1) + " 정보 ===");
        System.out.println("ID: " + student[index][0]);
        System.out.println("이름: " + student[index][1]);
        System.out.println("상태: " + student[index][2]);
        System.out.println("생년월일: " + student[index][3]);
        System.out.println("연락처: " + student[index][4]);
    }

    public static void printCourse(int index) {
        if(courseLists[index].isEmpty())
            System.out.println("없음");
        else
            for(String course : courseLists[index])
                System.out.println("- " + course);
    }

    public static void printAllStudent() {
        for (int i = 0; i < student_num; i++) {
            printStudentInfo(i);
            printCourse(i);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < student_num; i++) {
            courseLists[i] = new ArrayList<>();
        }

        setStudent(0, "2023001", "홍길동", "재학", "2001-05-10", "010-1234-5678");
        setStudent(1, "2023002", "김영희", "휴학", "2000-03-22", "010-9012-3456");
        setStudent(2, "2023003", "이철수", "재학", "2002-11-15", "010-7890-1234");

        addCourse(0, "자료구조");
        addCourse(0, "운영체제");

        addCourse(1, "데이터베이스");

        addCourse(2, "자료구조");
        addCourse(2, "운영체제");
        addCourse(2, "데이터베이스");

        printAllStudent();
    }
}