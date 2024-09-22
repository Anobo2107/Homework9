//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] expenses = {1000, 2000, 1500, 3000, 2500};
        int totalExpenses = 0;
        for (int expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");

        // Задача 2
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        for (int expense : expenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        // Задача 3
        double averageExpenses = (double) totalExpenses / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей.");

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}