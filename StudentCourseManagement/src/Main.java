import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final int student_num = 3; // 상수
        final int student_info_num = 5;


        String[][] student = new String[student_num][student_info_num];
        // 0 : id, 1 : name, 2 : status, 3 : birthData, 4 : contact

        ArrayList<String>[] courselists = new ArrayList[student_num];
        for (int i = 0; i < student_num; i++)
            courselists[i] = new ArrayList<>();


        student[0][0] = "2023001"; student[0][1] = "홍길동"; student[0][2] = "재학"; student[0][3] = "2001-05-10"; student[0][4] = "010-1234-5678";
        student[1][0] = "2023002"; student[1][1] = "김영희"; student[1][2] = "휴학"; student[1][3] = "2000-03-22"; student[1][4] = "010-9012-3456";
        student[2][0] = "2023003"; student[2][1] = "이철수"; student[2][2] = "재학"; student[2][3] = "2002-11-15"; student[2][4] = "010-7890-1234";

        courselists[0].add("자료구조");
        courselists[0].add("운영체제");

        courselists[1].add("데이터베이스");

        courselists[2].add("자료구조");
        courselists[2].add("운영체제");
        courselists[2].add("데이터베이스");

        for (int i = 0; i < student_num; i++) {
            System.out.println("=== 학생 " + (i+1) + " 정보 " + "===");
            System.out.println("ID: " + student[i][0]);
            System.out.println("이름: " + student[i][1]);
            System.out.println("상태: " + student[i][2]);
            System.out.println("생년월일: " + student[i][3]);
            System.out.println("연락처: " + student[i][4]);

            System.out.println("수강 교과목 목록");
            if (courselists[i].isEmpty())
                System.out.println("없음");
            else
                for (int j = 0; j < courselists[i].size(); j++)
                    System.out.println(courselists[i].get(j));
        }
    }
}