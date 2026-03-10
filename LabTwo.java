public class LabTwo {
	/*
	 * Напишите метод, заменяющий в строке все вхождения слова «ляп» на
	 * «-ой-» с последующим выводом количества произведенных замен.
	*/
	public static Object[] processString(String text, String lap, String oi) {
		int index = text.indexOf(lap);
		int count = 0;
		while (index != -1) {
		    // Ищем следующее вхождение, пропуская текущее
		    index = text.indexOf(lap, index + 1);
			count++;
		}
		text = text.replace(lap, oi);
		return new Object[] {text, count};
	}
	static String text = "Киноляпы ляпают и ляпают, все кому не лень лямнуть! Сплоные ляптинойды вокруг!";
	public static void main(String [] arg) {
		System.out.println("1) " + text);
		Object[] data = processString(text, "ляп", "-ой-");
		System.out.println("2) " + data[0]);
		System.out.println("Всего выполнено " + data[1] + " замены!");
	}
}