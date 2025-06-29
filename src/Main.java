//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] wastes = {5496, 3984, 4068, 8046, 9582};
        int sum = 0;

        for (int i = 0; i < wastes.length; i++) {
            sum = sum + wastes[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println(" ");

        //Задача 2
        int maxWastes = wastes[0];
        int minWastes = wastes[0];

        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maxWastes) {
                maxWastes = wastes[i];

            }
            if (wastes[i] < minWastes) {
                minWastes = wastes[i];

            }

        }

        System.out.println("Минимальная сумма трат за неделю составила " + minWastes + " рублей. Максимальная сумма трат за неделю составила " + maxWastes + " рублей");

        System.out.println(" ");

        //Задача 3
        int total = 0;

        for (int element : wastes) {
            total += element;
        }
        float avg = total / (float) wastes.length;

        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей.");

        System.out.println(" ");

        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int l = 0;
        int r = reverseFullName.length - 1;

        while (l < r) {
            char revers = reverseFullName[l];
            reverseFullName[l] = reverseFullName[r];
            reverseFullName[r] = revers;
            l++;
            r--;
        }

        for (char revers : reverseFullName) {
            System.out.print(revers);
        }

    }
}