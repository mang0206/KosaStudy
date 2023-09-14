package day14_study01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLab {
	public static void main(String[] args) {
		try (FileReader reader = new FileReader("c:/kosastudy/eclipse-workspace/javaedu/yesterday.txt");
				BufferedReader br = new BufferedReader(reader);) {
			String data;
			int cnt = 0;

//			while (true) {
//				data = br.readLine();
//				if (data == null)
//					break;
//				if(data.toLowerCase().contains("yesterday"))
//					cnt++;
//			}
			
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				String[] sprintData = data.split(" ");
				for(String s:sprintData)
					if (s.toLowerCase().contains("yesterday"))
						cnt++;
			}
			System.out.printf("yesterday라는 단어는 %d개 있습니다.",cnt);
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}

	}

}
