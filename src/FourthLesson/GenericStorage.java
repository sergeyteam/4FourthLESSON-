package FourthLesson;

import java.util.Arrays;
import java.util.Scanner;

public class GenericStorage<T> {

	// C������� �������
	private Object[] myArray;
	private int n = 0;
	private int size = 0;

	// �������� ������������ ��� ����������. ��� ������ ������������
	// ���������������� ������ ������� 10.
	public GenericStorage() {
		myArray = new Object[10];
	}

	// �������� ������������ � ���������� (int size). ��� ������ ������������
	// ���������������� ������ ������� siz�.
	public GenericStorage(int size) {
		myArray = new Object[size];
		Scanner myScan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myArray[i] = myScan.nextInt();
		}
		myScan.close();
		this.size = size;
	}

	// ����� add(T obj), ������� ��������� ����� �������� � ���������.
	public void add(T obj) {
		if (n <= 10) {
			myArray[n] = obj;
			n++;
		} else {
			System.out.println("myArray has been overloaded");
		}
	}

	// ����� T get(int index), ������� ��������� ������� �� ������� � ������.
	public T get(int n) {
		T obj = (T) myArray[n];
		return obj;
	}

	// ����� T[] getAll(), ������� ������ ������ ���������
	public T[] getAll() {
		return (T[]) myArray;
	}

	// ����� update(int index, T obj), ������� �������� ������ �� ��������
	// ������� ������, ���� �� ���� ������� ��� ���� �������.
	public T update(int n, T obj) {
		if (n <= myArray.length) {
			if (!(myArray[n] == null)) {
				myArray[n] = obj;
			} else {
				System.out.print("The slot is empty.  ");
				obj = null;
			}
		}
		return obj;
	}

	// Me��� delete(int index), ������� ������ ������� �� ������� � ���������
	// ������ ������ � �������.
		public T[] delete(int index) {
		if (myArray[index] != null) {
			myArray[index] = null;
		} else {
			System.out.println("The slot has already null");
		}
		return (T[]) myArray[index];		
	}

	// ����� delete(T obj), ������� ������ �������� ������ �� �������
	public T delete(T obj) {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == obj) {
				obj = null;
			}
		}
		return obj;
	}

	// ����� ������� ��������� ������ ������� ��������H���
	public int sizeOfCrowded() {
		int count = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]!=null) {
				myArray[i] = count;
				count++;
			}
		}
		return count;
	}
		
}
