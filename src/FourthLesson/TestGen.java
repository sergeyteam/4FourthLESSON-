package FourthLesson;

import java.util.Arrays;

public class TestGen {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("----First task----");
		System.out
				.println("Создание конструктора без параметров. При вызове конструктора инициализируется массив длинной 10.");
		GenericStorage myGen = new GenericStorage();
		System.out.println();

		System.out.println("----Second task----");
		System.out
				.println("Создание конструктора с параметром (int size). При вызове конструктора инициализируется массив длинной size.");
		GenericStorage myGenSize = new GenericStorage(5);
		System.out.println();

		System.out.println("----Third task----");
		System.out.println("Добавление новых элементов в хранилище.");
		myGen.add(1);
		myGen.add(2);
		myGen.add(3);
		myGen.add(4);
		myGen.add(5);
		myGen.add(6);
		myGen.add(7);
		System.out.println();

		System.out.println("----Fourth task----");
		System.out
				.println("Метод T get(int index), который возвратит элемент по индексу в масиве.");
		System.out.println(myGen.get(5));
		System.out.println((myGenSize.get(2)));
		System.out.println();

		System.out.println("----Fifth task----");
		System.out
				.println("Метод T[] getAll(), который вернет массив элементов.");
		System.out.println(Arrays.toString(myGen.getAll()));
		System.out.println(Arrays.toString(myGenSize.getAll()));
		System.out.println();

		System.out.println("----Sixth task----");
		System.out
				.println("Метод update(int index, T obj), который подменит объект по заданной позиции только, если на этой позиции уже есть элемент.");
		System.out.println(myGen.update(1, 155));
		System.out.println(myGen.update(9, 8));
		System.out.println(myGenSize.update(0, 128));
		System.out.println();

		System.out.println("----Seventh task----");
		System.out
				.println("Meтод delete(int index), который удалит элемент по индексу и захлопнет пустую ячейку в массиве.");
		System.out.println(myGen.delete(2));
		System.out.println(myGenSize.delete(2));
		System.out.println("ПРОВЕРКА МЕТОДА delete(int index): ");
		System.out.println(Arrays.toString(myGen.getAll()));
		System.out.println(Arrays.toString(myGenSize.getAll()));
		System.out.println();

		System.out.println("----Eighth task----");
		System.out
				.println("Метод delete(T obj), который удалит заданный объект из массива");
		System.out.println(myGen.delete(3));
		System.out.println(myGenSize.delete(4));
		System.out.println("ПРОВЕРКА МЕТОДА delete(T obj): ");
		System.out.println(Arrays.toString(myGen.getAll()));
		System.out.println(Arrays.toString(myGenSize.getAll()));
		System.out.println();
		
		System.out.println("----Ninth task----");
		System.out.println("Метод который возвратит размер массива ЗАПОЛНЕНОГО");
		System.out.println(myGen.sizeOfCrowded());
		System.out.println(myGenSize.sizeOfCrowded());
	}

}
