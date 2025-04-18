import java.util.Scanner;

public class Project7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음료를 선택하세요");
        System.out.println("1. 아메리카노 (3,000원)");
        System.out.println("2. 카페라떼 (4,000원)");
        System.out.println("3. 카푸치노 (4,500원)");

        int choice = scanner.nextInt();
        int drink = 0;
        if (choice == 1) drink = 3000;
        else if (choice == 2) drink = 4000;
        else if (choice == 3) drink = 4500;
        else {
            System.out.println("지원하지 않는 메뉴입니다.");
            return;
        }

        System.out.println("크기를 선택하세요");
        System.out.println("1. Small");
        System.out.println("2. Medium (+500)");
        System.out.println("3. Large (+1,000)");

        int choice2 = scanner.nextInt();
        int size = 0;
        if (choice2 == 1) size = 0;
        else if (choice2 == 2) size = 500;
        else if (choice2 == 3) size = 1000;
        else {
            System.out.println("지원하지 않는 사이즈입니다.");
            return;
        }

        System.out.println("옵션을 선택하세요");
        System.out.println("1. 기본");
        System.out.println("2. 샷추가 (+500)");
        System.out.println("3. 시럽추가 (+300)");
        System.out.println("4. 샷+시럽추가 (+800)");

        int choice3 = scanner.nextInt();
        int option = 0;
        if (choice3 == 1) option = 0;
        else if (choice3 == 2) option = 500;
        else if (choice3 == 3) option = 300;
        else if (choice3 == 4) option = 800;
        else {
            System.out.println("지원하지 않는 메뉴입니다.");
            return;
        }

        int price = drink + size + option;
        System.out.println("총 금액은 " + price + "원 입니다.");
    }
}