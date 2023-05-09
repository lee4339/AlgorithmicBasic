package day4_구간합;

import java.util.Scanner;

// 백준 11986번
// 나머지 합 구하기

/* 수 N개 A1, A2, ..., AN이 주어진다. 
 * 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
 * 즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.
 * (입력) 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
 *        둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)
 * (출력) 첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
 * */

public class Ex_04_문제005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 수열의 개수
		int M = sc.nextInt(); // 나누어떨어져야 하는 수
		
		long[] S = new long[N]; // 합 배열
		long[] C = new long[M]; // 같은 나머지의 인덱스를 카운트하는 배열
		
		long answer = 0; // 결과값 초기화
		
		S[0] = sc.nextInt(); // 합배열 첫번째 입력
		
		for(int i = 1; i < N; i++) {
			S[i] = S[i - 1] + sc.nextInt(); // 합배열 만들기
		}
		
		for(int i = 0; i < N; i++) { // 합 배열의 모든 값에 % 연산 수행
			int remainder = (int)(S[i] % M);
			// 0 ~ i 까지의 구간 합 자체가 0일 때 정답에 더하기
			if(remainder == 0) {
				// 나머지가 같은 인덱스의 개수 카운팅
				answer++;
			}
			C[remainder]++;
		}
		for(int i = 0; i < M; i++) {
			if(C[i] > 1) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
				answer = answer + (C[i] * (C[i] - 1) / 2);
			}
		}
		
		System.out.println(answer);
	}

}
