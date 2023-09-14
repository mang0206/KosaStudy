package day14_study01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageIOLab {

	public static void main(String[] args) {
		File f = new File("./list.txt");
		List<String> urlInfo = new ArrayList<>();
		try (Scanner scan = new Scanner(f);) { 
			while(scan.hasNext()) {
				urlInfo.add(scan.next());
			}
			ImageIOLab.saveImage(urlInfo);

		} catch (FileNotFoundException e) {
			System.out.println("yesterday.txt 파일을 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}

	}
	public static void saveImage(List<String> urlInfo) {
		String path = "C:/iotest/myimage";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}
		try {
			for(String urls : urlInfo) {
				String[] url = urls.split(",");
				URL req = new URL(url[1]);
				InputStream is = req.openStream();
				String fileName = "c:/iotest/myimage/" + url[0] + ".jpg";
				FileOutputStream fos = new FileOutputStream(fileName);
				int input = 0;
				while (true) {
					input = is.read();
					if (input == -1)
						break;
					fos.write(input);
				}
				fos.close();
			}
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
	}

}
