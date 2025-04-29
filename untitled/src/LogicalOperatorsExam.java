public class LogicalOperatorsExam {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        //AND 연산자
        if (x > 0 && y > 0)
            System.out.println("둘 다 양수");

        //OR 연산자
        if (x > 10 || y > 5)
            System.out.println("하나 이상 조건 만족");

        //NOT 연산자
        if (!(x == y))
            System.out.println("다르다");

        //복합 조건문
        if ((x < 10 && y > 5) || (x == 5 && y == 10))
            System.out.println("복합 조건 OK");
    }
}