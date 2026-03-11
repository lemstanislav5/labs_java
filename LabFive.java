import java.util.Random;
    /**
    * Напишите метод который:
    * - принимает параметром массив целых чисел;
    * - выбирает случайным образом одно число из массива;
    * - находит крайнее правое и крайнее левое вхождение этого числа в массив;
    * - возвращает «размах» , т.е. количество элементов между крайними
    * вхождениями (включая сами вхождения);
    * - если вхождение единственное, то вернуть 1. 3232
    */

public class LabFive {
    public static int calculationMethod(int[] arg) {
        int test;
        Random rand = new Random();

        // Находим случайный элемент массива
        int randomElement = arg[rand.nextInt(arg.length)];

        // Находим правое вхождение
        int rightEntry = -1;
        int leftEntry = -1;

        // Находим правое вхождение (самое правое)
        for (int i = arg.length - 1; i >= 0; i--) {
            if (arg[i] == randomElement) {
                rightEntry = i;
                break;
            }
        }

        // Находим левое вхождение (самое левое)
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] == randomElement) {
                leftEntry = i;
                break;
            }
        }

        System.out.println(randomElement + " " + rightEntry + " " + leftEntry);
        return 0;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 11, 3, 2, 7, 5, 4, 8, 19, 72};
        int result = calculationMethod(numbers);
        System.out.println(result);
    }
}