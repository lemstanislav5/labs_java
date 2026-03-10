import java.util.Arrays;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/*
 * Напишите метод, увеличивающий четные по модулю элементы
 * массива вещественных чисел на 20%.
 * под "четными по модулю элементами" в массиве вещественных чисел 
 * я подразумеваю элементы, у которых целая часть (после взятия модуля) 
 * является четным числом.
 */
public class LabOne{
    static double [] arr = {3.14, -2, 1.1, 4.2, 7.18, 7, 6.101, -17.2};
    static String str1 = Arrays.toString(arr);

	public static double[] addPercentEvenElements(double[] arr){
    	double [] newArr = new double [arr.length];
        System.out.println("\nЧетные по модулю числа: ");
        // Приводим к long каждый элемент массива, чтобы отсечь дробную часть
        // затем берем модуль (Math.abs), чтобы проверка корректно работала для отрицательных числел 
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs((long)arr[i]) % 2 ==0){
            	newArr[i] = arr[i] * 1.2;
                System.out.print(arr[i] + " (элемент № " + i + "); ");
            } else {
            	newArr[i] = arr[i];
            }
        }
        return newArr;

    }
    public static void main(String arg[]) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Изначальное значение массива:");
        System.out.println(str1);
        String str2 = Arrays.toString(addPercentEvenElements(arr));
        System.out.println("\n\nРезультат добавления 20 процентов к соответствующему элементу:");
        System.out.println(str2);
    }
}