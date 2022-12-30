package com.ds.array;

public class Array {
	int[] array = new int[30];

	void insertAt(int index, int element) {
		int temp = 0;
		int temp2 = 0;
		for (int i = 0; i < this.array.length; i++) {
			int localTemp = 0;
			if (i == index) {
				temp = array[i];
				array[i] = element;
				array[i + 1] = temp;
			}
			if (i > index) {
				temp2 = array[index + 1];
				array[index] = temp;
				array[index + 1] = temp2;
			}

		}
	}

	void deleteFrom(int index, int element) {

	}

	int search(int key) {
		return 0;
	}
	void insertTOArray(int index,int element) {
		
		if(index<30) {
			array[index]=element;
		}
	}
	void displayArray() {
		String arrayElements="Array:";
		for (int i = 0; i <this. array.length; i++) {
			arrayElements=arrayElements+" "+this.array[i];
			
			
		}
		System.out.println(arrayElements);
	}

	public static void main(String[] args) {
		Array array=new Array();
		array.insertTOArray(0,10);
		array.insertTOArray(1,11);
		array.insertTOArray(2,23);
		array.displayArray();
		System.out.println("Hello");
	}

}
