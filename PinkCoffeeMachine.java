package Uchilishte_Galq;

import java.util.*;

public class PinkCoffeeMachine {
    private static final String[] drinks = {
            "Еспресо", "Капучино", "Лате", "Американо", "Мокачино",
            "Горещ шоколад", "Чай", "Мляко", "Фрапе", "Мачa"
    };

    private static final double[] prices = {
            1.50, 2.00, 2.20, 1.80, 2.50,
            2.30, 1.20, 1.00, 2.10, 2.40
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🌸 Добре дошли при вашата любима цветна кафемашина!🌸");
        System.out.println("🌺Изберете напитка от менюто:");

        for (int i = 0; i < drinks.length; i++) {
            System.out.printf("%d. %s - %.2f лв.%n", i + 1, drinks[i], prices[i]);
        }

        System.out.print("🌷Ваш избор (номер): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= drinks.length) {
            int index = choice - 1;
            double price = prices[index];
            System.out.printf("Цената на %s е %.2f лв.%n", drinks[index], price);
            System.out.print("Моля, въведете сума: ");
            double payment = scanner.nextDouble();

            if (payment >= price) {
                double change = payment - price;
                System.out.printf("Приготвям %s за вас... ☕%n", drinks[index]);
                System.out.println("Готово! Насладете се на вашата напитка 🌸");
                if (change > 0) {
                    System.out.printf("Вашето ресто е: %.2f лв.%n", change);
                }
            } else {
                System.out.println("Недостатъчна сума. Моля, опитайте отново.");
            }
        } else {
            System.out.println("Невалиден избор. Моля, опитайте отново.");
        }

        scanner.close();
    }
}