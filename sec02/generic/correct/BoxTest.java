package chap09.sec02.generic.correct;

class Box<T>{
	private T b;
	
	public T get() {
		return b;
	}
	
	public void set(T b) {
		this.b=b;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box <Integer> intValue=new Box<>();
		intValue.set(new Integer(100));
		System.out.println(intValue.get());
		
		Box<String> strValue=new Box<>();
		strValue.set("만능이네!");
		System.out.println(strValue.get());
	}
}
