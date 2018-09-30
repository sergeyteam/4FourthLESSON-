package FourthLesson;

public class GenTrainee2 {

	private Object ob;
	
	public <T> GenTrainee2(T obj) {
		this.ob = obj;
	}
	
	public <V> void showtype(V type) {
		System.out.println("V: " + type.getClass().getName());
	}
	
	public <Val, K> void twoTypes(Val v, K k){
		System.out.println("Val: " + v.getClass().getName());
		System.out.println("K: " + k.getClass().getName());
	}
	
	public <Key extends Number> void withExtends(Key key) {
		System.out.println("Key: " + key.getClass().getName());
	}
}
