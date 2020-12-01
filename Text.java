package exercise08;

import java.util.Scanner;
public class Text {	
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	int num=input.nextInt(),ori=num,i=2;
    	StackOfInteger stack=new StackOfInteger();
    	if(num<=0)	System.out.println("Wrong!");
		else if(num==1)	
			stack.push(1);
		else {
			while(i<ori&&num>0){
				if(num%i==0){
					stack.push(i);
					num=num/i;
				}
				else	i++;
			}
			if(ori==num) {
				stack.push(1);
				stack.push(i);
			}
		}
    	int size=stack.getSize();//!!!!!!attention:cannot directly put it into the loop!
    	for(int k=0;k<size;k++)
    		System.out.print(stack.pop()+" ");
    }
}
 