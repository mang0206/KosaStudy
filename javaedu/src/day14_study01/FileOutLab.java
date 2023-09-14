package day14_study01;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class FileOutLab {
	public static void main(String[] args) {
		String path = "C:/Temp";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try (FileWriter writer = new FileWriter(path + "/event.txt");
			PrintWriter out = new PrintWriter(writer);) {
			
			LocalDate ld = LocalDate.of(2023, 10, 3);
			out.printf(FileOutLab.getDay(ld));

			ld = LocalDate.of(2023, 12, 25);
			out.printf(FileOutLab.getDay(ld));
			
			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}

	}
	public static String getDay(LocalDate ld) {
		int yearNum = ld.getYear();
		int monthNum = ld.getMonthValue();
		int dateNum = ld.getDayOfMonth();
		DayOfWeek day = ld.getDayOfWeek();
		String korday = day.getDisplayName(TextStyle.FULL, Locale.KOREAN);

		return String.format("%d년 %d월 %d일은 %s요일입니다.\n"
				,yearNum,monthNum,dateNum,korday);
	}

}
