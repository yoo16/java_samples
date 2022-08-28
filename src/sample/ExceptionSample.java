package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {

	public static void main(String[] args) {
		float average = 0;
		average = calculateAverage(100, 5);
		System.out.println(average);

		average = calculateAverage(100, 0);
		System.out.println(average);

		average = calculateAverage(100, -1);
		System.out.println(average);

		loadFile("./data/sample1.txt");

		try {
			loadFile2("./data/sample.txt");
		} catch (IOException e) {
			System.out.println("ファイルエラー");
		}
	}

	public static float calculateAverage(int score, int count) {
		//throw
		try {
			if (count < 0) {
				throw new IllegalArgumentException("個数がマイナスです。");
//				throw new NullPointerException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		float answer = 0;
		if (count > 0) {
			answer = score / count;
		} else {
			System.out.println("個数が間違っています。");
		}
		return answer;
	}

	public static void loadFile(String path) {
		try {
			FileReader reader = new FileReader(path);
			System.out.println("ファイルを読み込みました");

			BufferedReader buffer = new BufferedReader(reader);
			String line;
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			buffer.close();
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが存在しませんでした");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("ファイル読み込み処理を終了します");
		}
	}

	public static void loadFile2(String path) throws IOException {
		FileReader reader = new FileReader(path);
		System.out.println("ファイルを読み込みました");

		BufferedReader buffer = new BufferedReader(reader);
		String line;
		while ((line = buffer.readLine()) != null) {
			System.out.println(line);
		}
		buffer.close();
		reader.close();
	}

}
