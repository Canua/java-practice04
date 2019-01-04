package prob01;

public class Printer {
	// 오버로드

//	public void println(int i) {
//		System.out.println(i);
//	}
//
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//
//	public void println(double d) {
//		System.out.println(d);
//	}
//
//	public void println(String string) {
//		System.out.println(string);
//	}

	// 제네릭 메소드 : 파라미터 타입을 결정하지 않는 것, 메소드 오버로드를 타입에 관해서 대체할 수 있다.
//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	// 타입을 결정하지 않는 오버로드 방식
	@SuppressWarnings("unchecked")
	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.println(t);
		}
	}

	// 가변 변수
	// sum ( 1, 2, 3, 4, 5, 6); 을 하고 싶을 때 가변 변수 사용
	public Integer sum(Integer... nums) {
		Integer sum = 0;
		for (Integer i : nums) {
			sum += i;
		}
		return sum;
	}
}