package TeamProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingMallMain {

    static Scanner sc = new Scanner(System.in);

    static List<Cloth> clothList = new ArrayList<>();
    static List<Drink> drinkList = new ArrayList<>();
    static List<Cosmetic> cosmeticList = new ArrayList<>();

    public static void main(String[] args) {
        SampleData(); // 샘플 상품 추가

        while (true) {
            int choice = showMenu();

            switch (choice) {
                case 1 -> showProductsCategory();
                case 2 -> addProduct();
                case 3 -> deleteProduct();
                case 0 -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 샘플 데이터 초기화
    static void SampleData() {
        clothList.add(new Cloth(30000, 10, 101, "티셔츠"));
        clothList.add(new Cloth(45000, 5, 102, "청바지"));
        clothList.add(new Cloth(60000, 3, 103, "재킷"));

        drinkList.add(new Drink(3000, 10, 201, "콜라"));
        drinkList.add(new Drink(4500, 5, 202, "사이다"));
        drinkList.add(new Drink(7000, 3, 203, "환타"));

        cosmeticList.add(new Cosmetic(10000, 10, 301, "스킨"));
        cosmeticList.add(new Cosmetic(12000, 5, 302, "로션"));
        cosmeticList.add(new Cosmetic(9000, 3, 303, "립밤"));
    }

    // 메인 메뉴 출력
    static int showMenu() {
        System.out.println("\n=== 상품 판매자용 프로그램 ===");
        System.out.println("1. 상품 조회 (카테고리 선택)");
        System.out.println("2. 상품 등록 (추가)");
        System.out.println("3. 상품 삭제");
        System.out.println("0. 종료");
        System.out.print("번호를 선택하세요: ");
        return sc.nextInt();
    }

    // 카테고리별 상품 조회
    static void showProductsCategory() {
        int type = selectCategory("조회할 (0 입력 시 이전 메뉴)");
        if (type == 0) return;

        switch (type) {
            case 1 -> {
                System.out.println("=== [의류] 상품 목록 ===");
                for (Cloth c : clothList) c.showInfo();
            }
            case 2 -> {
                System.out.println("=== [음료] 상품 목록 ===");
                for (Drink d : drinkList) d.showInfo();
            }
            case 3 -> {
                System.out.println("=== [화장품] 상품 목록 ===");
                for (Cosmetic c : cosmeticList) c.showInfo();
            }
            default -> System.out.println("잘못된 카테고리입니다.");
        }
    }

    // 상품 추가
    static void addProduct() {
        int type = selectCategory("등록할 (0 입력 시 이전 메뉴)");
        if (type == 0) return;

        System.out.print("상품번호: ");
        int pid = sc.nextInt();
        System.out.print("상품명: ");
        String name = sc.next();
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("재고: ");
        int stock = sc.nextInt();

        switch (type) {
            case 1 -> {
                for (Cloth c : clothList) {
                    if (c.getProductId() == pid) {
                        c.setStock(c.getStock() + stock);
                        System.out.println("기존 상품 재고 증가 완료.");
                        return;
                    }
                }
                clothList.add(new Cloth(price, stock, pid, name));
            }
            case 2 -> {
                for (Drink d : drinkList) {
                    if (d.getProductId() == pid) {
                        d.setStock(d.getStock() + stock);
                        System.out.println("기존 상품 재고 증가 완료.");
                        return;
                    }
                }
                drinkList.add(new Drink(price, stock, pid, name));
            }
            case 3 -> {
                for (Cosmetic c : cosmeticList) {
                    if (c.getProductId() == pid) {
                        c.setStock(c.getStock() + stock);
                        System.out.println("기존 상품 재고 증가 완료.");
                        return;
                    }
                }
                cosmeticList.add(new Cosmetic(price, stock, pid, name));
            }
            default -> System.out.println("잘못된 카테고리입니다.");
        }
    }

    // 상품 삭제
    static void deleteProduct() {
        int type = selectCategory("재고를 줄일 (0 입력 시 이전 메뉴)");
        if (type == 0) return;

        System.out.print("상품번호: ");
        int pid = sc.nextInt();

        System.out.print("줄일 수량: ");
        int amount = sc.nextInt();

        switch (type) {
            case 1 -> {
                for (Cloth c : clothList) {
                    if (c.getProductId() == pid) {
                        if (c.getStock() < amount) {
                            System.out.println("재고가 부족합니다.");
                        } else {
                            c.setStock(c.getStock() - amount);
                            System.out.println("재고가 정상적으로 감소되었습니다.");
                        }
                        return;
                    }
                }
                System.out.println("해당 상품이 존재하지 않습니다.");
            }

            case 2 -> {
                for (Drink d : drinkList) {
                    if (d.getProductId() == pid) {
                        if (d.getStock() < amount) {
                            System.out.println("재고가 부족합니다.");
                        } else {
                            d.setStock(d.getStock() - amount);
                            System.out.println("재고가 정상적으로 감소되었습니다.");
                        }
                        return;
                    }
                }
                System.out.println("해당 상품이 존재하지 않습니다.");
            }

            case 3 -> {
                for (Cosmetic c : cosmeticList) {
                    if (c.getProductId() == pid) {
                        if (c.getStock() < amount) {
                            System.out.println("재고가 부족합니다.");
                        } else {
                            c.setStock(c.getStock() - amount);
                            System.out.println("재고가 정상적으로 감소되었습니다.");
                        }
                        return;
                    }
                }
                System.out.println("해당 상품이 존재하지 않습니다.");
            }

            default -> System.out.println("잘못된 카테고리입니다.");
        }
    }


    // 카테고리 선택 공통 메서드
    static int selectCategory(String actionText) {
        System.out.println(actionText + " 카테고리를 선택하세요:");
        System.out.println("1. 의류");
        System.out.println("2. 음료");
        System.out.println("3. 화장품");
        System.out.println("0. 이전 메뉴");
        System.out.print("선택: ");
        return sc.nextInt();
    }
}
