package exercise07;

import java.util.*;

public class MyStack {
	private Stack<Integer> data = new Stack<Integer>();// 原始数据
	private Stack<Integer> min = new Stack<Integer>();// 最小的元素永远位于栈顶

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		Random r = new Random();
//		for(int i=1;i<=10;i++) {
//			ms.push(r.nextInt(20));
//		}
//		System.out.
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getMin()); // 返回 -3
		ms.pop();
		System.out.println(ms.peak()); // 返回 0
		System.out.println(ms.getMin()); // 返回 -2
	}

	public void push(int a) {
		data.push(a);
		if (min.empty()) {
			min.push(a);
		} else {// min is not empty
			int num = 0;
			while (!min.empty()&&min.peek() < a) {
				data.push(min.peek());
				min.pop();
				num++;
			}
			min.push(a);
			for (int i = 1; i <= num; i++) {
				min.push(data.peek());
				data.pop();
			}
		}
	}

	public void pop() {
		if (data.empty())
			System.out.println("Stack is empty");
		else {
			int result = data.peek();
			data.pop();
			int num = 0;
			while (!min.empty()&&min.peek() != result) {
				data.push(min.peek());
				min.pop();
				num++;
			}
			min.pop();
			for (int i = 0; i < num; i++) {
				min.push(data.peek());
				data.pop();
			}
		}

	}

	public int peak() {
		return data.peek();
	}

	public int getMin() {
		return min.peek();
	}
}
