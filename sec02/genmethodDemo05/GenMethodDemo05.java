package chap09.sec02.genmethodDemo05;

class Ticket implements Comparable<Ticket>{
	int no;
	
	public Ticket(int no) {
		this.no=no;
	}
	
	@Override
	public int compareTo(Ticket obj) {
		return this.no - obj.no;
	}
}

public class GenMethodDemo05 {
	public static void main(String[] args) {
		Ticket[] arr= {new Ticket(5), new Ticket(3), new Ticket(10), new Ticket(7), new Ticket(4)};
		System.out.printf("배열 4번째 원소의 값보다 큰 배열의 수 = %d개\n", countGT(arr, arr[4]));
	}
		//Comparable 인터페이스 타입의 자식 객체로 제한함
		private static <T extends Comparable<Ticket>> int countGT(T[] arr, T elem) {
			int count=0;
			for (T e:arr)
				if (e.compareTo((Ticket)elem)>0) ++count;
			return count;
		}
	}
