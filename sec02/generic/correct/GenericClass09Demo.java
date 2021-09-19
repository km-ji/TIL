package chap09.sec02.generic.correct;
//package chap09.sec02.generic.object;
//
//public class Beverage{
//	
//}
//public class Beer extends Beverage{
//	
//}
//public class Boricha extends Beverage{
//	
//}
//
//public class Cup{
//	private Object beverage;
//	
//	public Object getBeverage() {
//		return beverage;	
//	}
//	public void setBeverage(Object beverage) {
//		this.beverage=beverage;
//	}
//}
//
//public class GenericClass09Demo {	
//	public static void main(String[] args) {
//		Cup c=new Cup();
//		c.setBeverage(new Beer());
//		Beer b1=(Beer) c.getBeverage();
//		c.setBeverage(new Boricha());
//		b1=(Beer) c.getBeverage();
//	}
//}
