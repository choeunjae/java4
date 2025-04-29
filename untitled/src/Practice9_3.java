import java.util.Scanner;

public class Practice9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basePrice = 0;
        int sizePrice = 0;
        int optionPrice = 0;

        System.out.println("음료를 선택하세요");
        System.out.println("1. 아메리카노 (3,000원)");
        System.out.println("2. 카페라떼 (4,000원)");
        System.out.println("3. 카푸치노 (4,500원)");

        int drinkType = scanner.nextInt();

        // 음료 종류에 따른 기본 가격 설정 (switch문으로 변경)
        switch (drinkType) {
            case 1:
                basePrice = 3000; // 아메리카노
                break;
            case 2:
                basePrice = 4000; // 카페라떼
                break;
            case 3:
                basePrice = 4500; // 카푸치노
                break;
            default:
                System.out.println("잘못된 음료 선택입니다.");
                return;
        }

        System.out.println("크기를 선택하세요");
        System.out.println("1. Small");
        System.out.println("2. Medium (+500)");
        System.out.println("3. Large (+1,000)");

        int sizeChoice = scanner.nextInt();

        // 음료 사이즈에 따른 사이즈 가격 설정 (switch문으로 변경)
        switch (sizeChoice) {
            case 1:
                sizePrice = 0;      // small
                break;
            case 2:
                sizePrice = 500;    // Medium
                break;
            case 3:
                sizePrice = 1000;   // Large
                return;
            default:
                System.out.println("잘못된 사이즈 선택입니다.");
                return;
        }

        System.out.println("옵션을 선택하세요");
        System.out.println("1. 기본");
        System.out.println("2. 샷추가 (+500)");
        System.out.println("3. 시럽추가 (+300)");
        System.out.println("4. 샷+시럽추가 (+800)");

        int optionChoice = scanner.nextInt();

        // 음료 옵션에 따른 옵션 가격 설정 (switch문으로 변경)
        switch (optionChoice) {
            case 1:
                optionPrice = 0;    // 기본
                break;
            case 2:
                optionPrice = 500;  // 샷추가
                break;
            case 3:
                optionPrice = 300;  // 시럽추가
                break;
            case 4:
                optionPrice = 800;  // 샷+시럽 추가
                return;
            default:
                System.out.println("잘못된 옵션 선택입니다.");
                return;

        }

        // 선택한 음료의 최종 가격 출력
        int totalPrice = basePrice + sizePrice + optionPrice;

        System.out.println("최종 가격은 " + totalPrice + "원 입니다.");

        scanner.close();

    }
}