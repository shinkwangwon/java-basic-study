package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class TimeMain {

	public static void main(String[] args) {
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);	// 2019-12-14T17:28:41.074
		LocalDateTime plusDateTime = localDateTime.plus(Period.ofDays(1));	// Period
		System.out.println(plusDateTime);	// 2019-12-15T17:28:41.074

		LocalDateTime ofLocalDateTime = LocalDateTime.of(2019, 12, 14, 17, 28, 33);	// 이렇게 만드는 방법도 있다
		System.out.println(ofLocalDateTime);	// 2019-12-14T17:28:33

		// Date로 바꾸는 작업 -> DB에 저장할 객체가 Date타입이면 결국엔 Date타입으로 변경해줘야 한다.
		Date entityDate = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);	// 2019-12-14
		LocalDate plusDate1 = localDate.plusDays(1);
		System.out.println(plusDate1);	// 2019-12-15
		LocalDate plusDate2 = localDate.plus(Period.ofDays(1));	// plusDays(1) 과 같은 결과다
		System.out.println(plusDate2);	// 2019-12-15

		// LocalTime
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);	// 17:29:27.954
		LocalTime plusTime = localTime.plusHours(1);
		System.out.println(plusTime);	// 18:29:27.954

	}
}
