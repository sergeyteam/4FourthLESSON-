package FourthLesson;

public class GenTrainee<T> {
	
	T ob;
	public GenTrainee(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("ob: " + ob.getClass().getName());
	}
}
