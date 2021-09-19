package chap09.sec02.generic.correct;


public class Cup <T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}
