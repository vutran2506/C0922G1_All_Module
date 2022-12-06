package Case_study_module2.view.furama_view;

import Case_study_module2.controller.PromotionController;

import java.util.Scanner;

public class PromotionView {
    private final PromotionController promotionController = new PromotionController();

    public  void displayPromotion() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========Promotion Management=======");
            System.out.println("""
                    1.	Display list customers use service
                    2.	Display list customers get voucher
                    3.	Return main menu                                                                     
                    """);
            System.out.println("Input your choice");
            int choice5;
            try {
                choice5 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (choice5) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                 return;
                default:
                    System.out.println("Input choice 1 to 3");
            }
        } while (true);
    }
}

