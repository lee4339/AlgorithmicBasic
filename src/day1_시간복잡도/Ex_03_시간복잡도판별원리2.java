package day1_시간복잡도;

public class Ex_03_시간복잡도판별원리2 {

	public static void main(String[] args) {
		// 연산 횟수가 3N인 경우
		int N = 100000;
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수:" + cnt++);
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수:" + cnt++);
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수:" + cnt++);
		}

	}
	
	// 코딩 테스트에서는 일반적으로 상수를 무시
	// Ex_02와 Ex_03 모두 시간 복잡도 = O(n)

}
