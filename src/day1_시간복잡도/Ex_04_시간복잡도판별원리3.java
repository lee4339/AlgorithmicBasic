package day1_시간복잡도;

public class Ex_04_시간복잡도판별원리3 {

	public static void main(String[] args) {
		// 연산 횟수가 N**2인 경우
		int N = 100000;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.println("연산 횟수:" + cnt++);				
			}
		}
		
		// 시간 복잡도는 가장 많이 중첩된 반복문을 기준으로 도출
		// 일반 for 문이 10개 더 있다 하더라도 이중 포문에 따라 시간 복잡도의 변함없이 N**2 유지
		// O(N**2)
	}
	// 올바른 시간 복잡도
	// -알맞은 알고리즘(선택기준)
	// -비효율적인 로직 찾아서 효율적으로 바꾸기

}
