package chap09.sec02.generic.correct;


public class Cup_generic_type {
	public static void main(String[] args) {
		Cup<Beer> cup01=new Cup<Beer>();
		cup01.set(new Beer());
		Beer beer=cup01.get();
		System.out.println(beer);
		
		Cup<Boricha> cup02=new Cup<Boricha>();
		cup02.set(new Boricha());
		Boricha boricha=cup02.get();
		System.out.println(boricha);
		
		Cup<String> cup03=new Cup<String>();
		cup03.set("김성진");
		String strValue=cup03.get();
		System.out.println(strValue);
		
		Cup<Integer> cup04=new Cup<Integer>();
		cup04.set(1000);
		Integer intValue=cup04.get();
		System.out.println(intValue);
	}
}
