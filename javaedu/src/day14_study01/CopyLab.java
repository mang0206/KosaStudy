package day14_study01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CopyLab {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File dir = new File(path);
		
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		LocalDate ld = LocalDate.now();
		int yearNum = ld.getYear();
		int monthNum = ld.getMonthValue();
		int dateNum = ld.getDayOfMonth();
		String pathAndFile = String.format("%s/sample_%d_%d_%d.txt",
				path, yearNum, monthNum, dateNum);
		
		try (FileReader reader = new FileReader("c:/kosastudy/eclipse-workspace/javaedu/sample.txt");
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(pathAndFile, true);) {
			String data;
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				writer.write(data + "\n");
			}
			System.out.println("저장 완료되었습니다.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다.");
		} catch (IOException ioe) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
	}
}
