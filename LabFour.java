import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LabFour {
    /**
     * Спроектируйте и разработайте метод, определяющий, сколько времени
     * прошло с заданной даты. С помощью этого методы выведите в
     * консоль, сколько времени прошло с вашего дня рождения в удобном
     * для восприятия виде, например: Вам исполнилось 20 лет, 3 месяца, 18
     * дней, 4 часа, 5 минут и 10 секунд.
     */
    public static void hasTimePassed() {
        // Считываем воод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате: дд.мм.гггг");
        String input = scanner.nextLine();
        
        try {
            // Получаем текущую дату и время
            LocalDateTime now = LocalDateTime.now();

            // Парсим введенную дату
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate inputDate = LocalDate.parse(input, formatter);

            // Превращаем полученную дату в LocalDateTime
            LocalDateTime startDateTime = inputDate.atStartOfDay();
            
            // Проверка на будущую дату
            if (startDateTime.isAfter(now)) {
                throw new IllegalArgumentException("Дата не может быть в будущем");
            }

            // Вычисляем разницу (период)
            Period period = Period.between(inputDate, now.toLocalDate());
            Duration totalDuration = Duration.between(startDateTime, now);
            long hoursPart = totalDuration.toHoursPart();
            long minutesPart = totalDuration.toMinutesPart();
            long secondsPart = totalDuration.toSecondsPart();
            
            System.out.printf("Вам исполнилось %d лет, %d месяца, %d дней, %d часа, %d минут и %d секунд \n", 
                            period.getYears(), period.getMonths(), period.getDays(), hoursPart, minutesPart, secondsPart);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неверный формат даты! Используйте формат дд.мм.гггг");
            System.out.println("Например: 15.05.2000");
        }
        scanner.close();
    }
    public static void main(String arg[]){
        hasTimePassed();
    }
}
