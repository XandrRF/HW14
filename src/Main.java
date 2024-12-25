import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));


    }

    public static double avg(int num) {
        //todo Дописать логику работы метода сюда. Метод main не трогаем!!!

        String stringNum = String.valueOf(num);
        double sum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            int tempNum = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            sum = sum + tempNum;

        }
        return sum / stringNum.length(); //todo заменить 0 на корректный результат.
    }
}
