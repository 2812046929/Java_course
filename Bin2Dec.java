package exercise07;
import java.util.Scanner;
public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String binStr=sc.next();
		int result;
		try {
			result = bin2Dec(binStr);
			System.out.print(result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
		
		if(sc!=null)sc.close();
	}
	public static int bin2Dec(String binaryString) throws NumberFormatException{
		char[] bin=binaryString.toCharArray();
		int result=0;
		for(int i=0;i<bin.length;i++) {
			if(bin[i]!='0'&& bin[i]!='1') {
				throw new NumberFormatException();
			}
			result+=(Integer.parseInt(bin[i]+""))*Math.pow(2, bin.length-i-1);
			
		}
		return result;
	}

}
