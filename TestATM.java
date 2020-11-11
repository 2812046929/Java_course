package exercise05;

import java.util.Scanner;

public class TestATM {
	public static void main(String[] args) {

		Account[] acs = new Account[10];
		for(int i=0;i<10;i++) {
			acs[i]=new Account(100);
		}
		int[] ids = new int[10];
		for (int i = 0; i < 10; i++) {
			ids[i] = i;
		}
		boolean flag = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("Enter an id:");
		int id = sc.nextInt();
		for (int i : ids) {
			if (i == id) {
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.print("Enter a choice:");
				flag = true;
				break;
			} 
		}
		if (flag == true) {
			Account ac = acs[id];
			int num = sc.nextInt();
			while (num != 4) {
				if (num == 1) {
					System.out.print("The balance is "+ac.getbalance());
					System.out.println();
					System.out.println("Main menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.println("Main menu");
					System.out.print("Enter a choice:");
					
				} else if (num == 2) {
					System.out.println("Enter an amount to withdraw");
					int add = sc.nextInt();
					ac.withdraw(add);
					System.out.print("The balance is "+ac.getbalance());
					System.out.println();
					System.out.println("Main menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.println("Main menu");
					System.out.print("Enter a choice:");
				} else if (num == 3) {
					System.out.println("Enter an amount to deposit");
					int sub = sc.nextInt();
					ac.deposit(sub);
					System.out.print("The balance is "+ac.getbalance());
					System.out.println();
					System.out.println("Main menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.println("Main menu");
					System.out.print("Enter a choice:");
				}
				num=sc.nextInt();
			}
	
		}
		else {
			System.out.print("Please input a right id");
		}
	}
}}
