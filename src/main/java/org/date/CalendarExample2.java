package date;

import java.text.SimpleDateFormat;
import java.time.Instant; // importação do instant parse
import java.util.Calendar;
import java.util.Date;

public class CalendarExample2 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // informado data desejada no padrão UTC
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int minutes = cal.get(Calendar.MINUTE); // ali no predicado voce consegue escolher o que deseja pegar seja minuto, dia
		int month = 1 + cal.get(Calendar.MONTH); // Na classe calendar os meses iniciam no 0 sendo apartir janeiro
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
