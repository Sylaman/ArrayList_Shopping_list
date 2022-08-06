import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<String> shoppingList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    while (true) {
      System.out.println("""
          Выберите операцию и введите её номер:\s
           1. Добавить товар в список покупок\s
           2. Показать список покупок\s
           3. Удалить товар из списка покупок""");
      int operation = scanner.nextInt();
      if (operation != 1 && operation != 2 && operation != 3) {
        System.out.println("Ошибка! Введите корректный номер операции!");
        continue;
      }
      switch (operation) {
        case 1:
          System.out.println("Какую покупку хотите добавить?");
          Scanner scanner1 = new Scanner(System.in);
          String input = scanner1.nextLine();
          shoppingList.add(input);
          System.out.println("Итого в списке покупок: " + shoppingList.size());
          break;
        case 2:
          System.out.println("Список покупок:");
          for(int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + " " + shoppingList.get(i));
          }
          break;
        case 3:
          System.out.println("Список покупок:");
          for(int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + " " + shoppingList.get(i));
      }
          System.out.println("Какой товар хотите удалить? Введите номер или название");
          Scanner scanner2 = new Scanner(System.in);
          String removeInput = scanner2.nextLine();
          try {
            int removeNumber = Integer.parseInt(removeInput) - 1;
            System.out.println("Покупка \"" + shoppingList.get(removeNumber) + "\" удалена, список покупок:");
            shoppingList.remove(removeNumber);
            for(int i = 0; i < shoppingList.size(); i++) {
              System.out.println((i + 1) + " " + shoppingList.get(i));
            }
    } catch (NumberFormatException e) {
            if (shoppingList.contains(removeInput)) {
            System.out.println("Покупка \"" + removeInput + "\" удалена, список покупок:");
            shoppingList.remove(removeInput);
            for(int i = 0; i < shoppingList.size(); i++) {
              System.out.println((i + 1) + " " + shoppingList.get(i));
            }
            }
            else {
                System.out.println("Такого товара нет в списке покупок!");
            }
            }
          break;
}
}
}
}