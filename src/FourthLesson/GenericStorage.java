package FourthLesson;

import java.util.Arrays;
import java.util.Scanner;

public class GenericStorage<T> {

	// Cоздание массива
	private Object[] myArray;
	private int n = 0;
	private int size = 0;

	// Создание конструктора без параметров. При вызове конструктора
	// инициализируется массив длинной 10.
	public GenericStorage() {
		myArray = new Object[10];
	}

	// Создание конструктора с параметром (int size). При вызове конструктора
	// инициализируется массив длинной sizе.
	public GenericStorage(int size) {
		myArray = new Object[size];
		Scanner myScan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myArray[i] = myScan.nextInt();
		}
		myScan.close();
		this.size = size;
	}

	// Метод add(T obj), который добавляет новые элементы в хранилище.
	public void add(T obj) {
		if (n <= 10) {
			myArray[n] = obj;
			n++;
		} else {
			System.out.println("myArray has been overloaded");
		}
	}

	// Метод T get(int index), который возвратит элемент по индексу в масиве.
	public T get(int n) {
		T obj = (T) myArray[n];
		return obj;
	}

	// Метод T[] getAll(), который вернет массив элементов
	public T[] getAll() {
		return (T[]) myArray;
	}

	// Метод update(int index, T obj), который подменит объект по заданной
	// позиции только, если на этой позиции уже есть элемент.
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

	// Meтод delete(int index), который удалит элемент по индексу и захлопнет
	// пустую ячейку в массиве.
		public T[] delete(int index) {
		if (myArray[index] != null) {
			myArray[index] = null;
		} else {
			System.out.println("The slot has already null");
		}
		return (T[]) myArray[index];		
	}

	// Метод delete(T obj), который удалит заданный объект из массива
	public T delete(T obj) {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == obj) {
				obj = null;
			}
		}
		return obj;
	}

	// Метод который возвратит размер массива ЗАПОЛНЕНHОГО
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
