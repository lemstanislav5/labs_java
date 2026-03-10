import java.util.Scanner;
    /*
    * Напишите метод, считывающий строку со стандартного ввода, который
    * возвращает три символа из середины полученной строки. Обязательно
    * проведите проверку на корректность введенной строки (в строке
    * должно быть нечетное количество символов, но не меньше трех), так,
    * чтобы в случае некорректных данных можно было на выбор либо
    * завершить программу, либо повторить попытку (указав на ошибку).
     */
public class LabThree {
    public static void readReturnCharacter() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Введите строку с нечетным количеством символов: ");
            String str = sc.nextLine();
            int count = str.length();
            
            if (count < 3) {
                System.out.println("Ошибка: длина строки должна быть не меньше 3 символов!");
                System.out.println("Для повтора введите 1, для завершения любую клавишу: ");
            } else if (count % 2 == 0) {
                System.out.println("Ошибка: строка имеет четное количество символов!");
                System.out.println("Для повтора введите 1, для завершения любую клавишу: ");
            } else {
                // Успешный ввод
                System.out.println("Вы ввели строку из " + count + " символов");
                int start = count / 2 - 1;
                int finish = start + 3;
                String middleThree = str.substring(start, finish);
                System.out.println("Три символа из середины: " + middleThree);
                break; // Выход из цикла при успехе
            }
            
            // Запрос на повтор/завершение
            String action = sc.nextLine();
            if (!action.equals("1")) {
                System.out.println("Программа завершена!");
                break;
            }
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        readReturnCharacter();
    }
}