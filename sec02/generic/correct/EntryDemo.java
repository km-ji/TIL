package chap09.sec02.generic.correct;

class Entry<K,V>{
	private K key;
	private V value;
	
	public Entry(K key, V value) {
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

public class EntryDemo {
	public static void main(String[] args) {
		//타입 매개변수를 실제 클래스로 생성
		//타입 매개변수로 기본 데이터타입은 사용할 수 없음, wrapper 클래스 사용
		Entry<String, Integer> e1=new Entry("김성진",200);
		Entry<String, String> e2=new Entry("기타","등등");
		
		System.out.println(e1.getKey()+" "+e1.getValue());
		System.out.println(e2.getKey()+" "+e2.getValue());
	}
}
