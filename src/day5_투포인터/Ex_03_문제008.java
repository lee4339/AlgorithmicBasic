package day5_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1253
// '좋은 수' 구하기

/* N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
 * N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
 * 수의 위치가 다르면 값이 같아도 다른 수이다.
 * 
 * (입력) 첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 
 * 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| ≤ 1,000,000,000, Ai는 정수)
 * 
 * (출력) 좋은 수의 개수를 첫 번째 줄에 출력한다.
 * */

/*(이동 원칙)
 * A[i] + A[j] > K : j--; 
 * A[i] + A[j] < K : i++;
 * A[i] + A[j} == k : i++; j--; count++;
 * */

public class Ex_03_문제008 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine()); //수의 개수
		int Result = 0;
		
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(bf.readLine()); // 수 데이터 저장 배열
		
		for(int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A); // 정렬
		
		for(int k = 0; k < N; k++) {
			long find = A[k]; // 찾고자 하는 값
			int i = 0; // 포인터
			int j = N - 1; // 포인터
			// 투 포인터 알고리즘
			while(i < j) {
				if(A[i] + A[j] == find) {
					// find는 서로 다른 두 수의 합이어야 함을 체크
					if(i != k && j != k) {
						Result++;
						break;
					} else if(i == k) {
						i++;
					} else if(j == k){
						j--;
					}
				} else if(A[i] + A[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(Result);
		bf.close();
		

	}

}
