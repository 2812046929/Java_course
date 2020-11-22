package exercise07;

import java.util.Scanner;
import java.io.*;

public class ReplaceText {
	public static void main(String[] args) {
		try {
			ReplaceText.replace(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void replace(String filename) throws IOException {
		File f = new File(filename);
		Scanner sc = new Scanner(f);
			String source="";
			while (sc.hasNext()) {
				source+=sc.next()+"\n";
			}
			System.out.println(source);
			String des = source.replaceAll("John", "");
			sc.close();
			PrintWriter pw = new PrintWriter(f);
			pw.print(des);
			System.out.println(des);
			pw.close();
		

	}
}
