package exercise05;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;

public class NewSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewSplit ns = new NewSplit();
		String[] result = ns.newSplit("aa?#aadd?c#", "a{1,2}");
		System.out.print("[ ");
		for (int i = 0; i < result.length - 1; i++) {
			System.out.print(result[i] + ", ");
		}

		System.out.print(result[result.length - 1] + " ]");
	}

	public String[] newSplit(String source, String target) {

		Pattern p = Pattern.compile(target);
		Matcher m = p.matcher(source);
		int matchers_len = 0;
		while (m.find()) {
			matchers_len++;
		}
		String[] result = new String[1];
		result[0] = source;
		if (matchers_len != 0) {
			int i = 0;
			String[][] matchers = new String[matchers_len][2];
			Pattern pp = Pattern.compile(target);
			Matcher mm = pp.matcher(source);
			while (mm.find()) {
				matchers[i][0] = mm.group();
				matchers[i][1] = mm.start() + "";
				i++;

			}
//		System.out.print("[ ");
//		for( i=0;i<matchers_len-1;i++) {
//			System.out.print(matchers[i][0]+", ");
//		}
//		
//		System.out.print(matchers[matchers.length-1][0]+" ]");
			String[] remain = source.split(target);
			int re1_len = remain.length;
			// 去掉remain中的空格
			List<String> remainList = new ArrayList<>(remain.length);
			for (String str : remain) {
				remainList.add(str);
			}
			while(remainList.remove(""));
			String[] remain2 = remainList.toArray(new String[remainList.size()]);
			re1_len = remain2.length;
			result = new String[matchers_len + re1_len];
			int matcher_index = 0;
			int remain_index = 0;
			if (matchers[0][1].equals("0")) {
				result[0] = matchers[0][0];
				matcher_index++;
			} else {
				result[0] = remain2[0];
				remain_index++;
			}
			for (int j = 1; j < result.length; j++) {
				int len = 0;
				for (int h = 0; h <= j - 1; h++) {
					len += result[h].length();
				}
				if (matcher_index < matchers_len && (len + "").equals(matchers[matcher_index][1])) {
					result[j] = matchers[matcher_index][0];
					matcher_index++;
				} else {
					result[j] = remain2[remain_index];
					remain_index++;
				}
			}
		}
		return result;
	}

}
