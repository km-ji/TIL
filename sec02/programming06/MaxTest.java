package chap09.sec02.programming06;

public class MaxTest {
	public static void main(String[] args) {
		Max <Number> n=new Max<>();
		System.out.println(n.max(10.0,8.0));
		System.out.println(n.max(5,8.0));
		
		Max<String> s=new Max<>();
		System.out.println(s.max("Hello", "Hi"));
		System.out.println(s.max("Good", "morning"));
	}
}

class Max<T>{
	T max(T t1, T t2) {
		if (t1 instanceof Number) {
			double d1=((Number) t1).doubleValue();
			double d2=((Number) t2).doubleValue();
			return d1>d2?t1:t2;
		}else {
			String s1=t1.toString();
			String s2=t2.toString();
			return s1.length()>s2.length()?t1:t2;
		}
	}
}
