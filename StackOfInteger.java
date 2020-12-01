package exercise08;

class StackOfInteger{//��ջ��
	 private int[] elements;	 
	 private int size;
	 public static final int DEFAULT_CAPACITY=16;
	 StackOfInteger(){
		 this(DEFAULT_CAPACITY);
	 }
	 StackOfInteger(int capacity){
		 elements=new int[capacity];
	 }
	 public boolean isEmpty() {//��Ϊtrue
		 return size==0;
	 }
	 public int peek() {//����ջ��Ԫ��
		 return elements[size-1];
	 }
	 public void push(int value) {
		 //!!!attention:size may over the length of array!->reallocation
		 if(size>=elements.length) {
			 int[] temp=new int[elements.length*2];
			 System.arraycopy(elements, 0, temp, 0, elements.length);
			 elements=temp;
		 }
		 elements[size++]=value;
	 }
	 public int pop() {
		 return elements[--size];
	 }
	 public int getSize() {//����ջ��Ԫ��
		 return size;
	 }
	 
}