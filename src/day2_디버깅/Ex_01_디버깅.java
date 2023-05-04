package day2_디버깅;

import java.util.Scanner;

/* <디버깅 방법>
 * 1. 코드에서 디버깅하고자 하는 줄에 중단점을 설정.(여러개 설정 가능)
 * 2. 디버깅 기능을 실행, 코드를 1줄씩 실행하거나 다음 중단점까지 실행 할 수 있으며,
 *    이 과정에서 추적할 변숫값도 지정할 수 있다.(이 과정에서 변숫값이 자신이 의도한 대로 바뀌는지 파악)
 * 3. 변숫값 이외에도 원하는 수식을 입력해 논리 오류를 파악할 수도 있음.
 * */

public class Ex_01_디버깅 {
	// 이클립스 - Expressions 기능 / Variables 탭
	public static void main(String[] args) {
		// 예제 코드
		// TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		int answer = 0;
		int A[] = new int[100001]; // 자료형 범위 오류 ---> long
		int S[] = new int[100001]; // 자료형 범위 오류 ---> long
		
		for(int i = 0; i < 10000; i++) { // 인덱스 범위 지정 오류 - 반복 범위를 잘못 지정
			A[i] = (int)(Math.random() * Integer.MAX_VALUE);
			S[i] = S[i - 1] + A[i];
		}
		
		for(int t = 1; t < testcase; t++) {
			int query = sc.nextInt(); // 변수 초기화 오류
			
			for(int i = 0; i < query; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(testcase + " " + answer); // testcase 잘못된 변수 사용 오류 ---> t
			}
		}

	}

}
