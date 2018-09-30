package FourthLesson;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Gen<Integer> intGen = new Gen<Integer>(12);
		Gen<String> strGen = new Gen<String>("ddddd"); 
		@SuppressWarnings("rawtypes")
		Gen listGen = new Gen(new ArrayList());

//		intGen = strGen;

		Integer value = (Integer) intGen.getOb();
	}

}
