package chap09.sec02.generic.correct;


class Ticket implements Comparable{
	int no;
	
	public Ticket(int no) {
		this.no=no;
	}
	
	@Override
	public int compareTo(Object obj) {
		Ticket t=(Ticket) obj;
		return this.no<t.no ? -1 : (this.no>t.no ? 1:0);
	}
}

public class GenMethodDemo04 {
	public static void main(String[] args) {
		Ticket[] arr= {new Ticket(5),new Ticket(3), new Ticket(10),new Ticket(7), new Ticket(4)};
		System.out.printf("배열 4번째 원소의 값보다 큰 배열의 수 = %d 개\n",countGT(arr,arr[4]));
	}
		//Comparable 인터페이스 타입의 자식 객체로 제한 함
		private static <T extends Comparable> int countGT(T[] arr, T elem) {
			int count=0;
			for (T e:arr)
				if (e.compareTo(elem)>0) ++count;
			return count;
		}
	}
