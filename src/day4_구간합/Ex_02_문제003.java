package day4_구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 11659번
// 구간 합 구하기

/* 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 * (입력) 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 
 *        둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 
 *        셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 * (출력) 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 * */

public class Ex_02_문제003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 받는 데이터가 많을 경우 Scanner 말고 BufferedReader 사용
		StringTokenizer sToken = new StringTokenizer(br.readLine()); // 값이 큰 경우 토큰으로 분리하여 사용
		
		// 위에서 입력값을 첫번째 숫자 개수, 두번 째 질의 개수로 가짐
		int suNo = Integer.parseInt(sToken.nextToken()); // 숫자 개수
		int quizNo = Integer.parseInt(sToken.nextToken()); // 질의 개수
		long[] S = new long[suNo + 1]; // 합 배열
		
		// 입력 값을 받아 합 배열에 넣음 
		sToken = new StringTokenizer(br.readLine());
		for(int i = 1; i <= suNo; i++) {
			// 0번 인덱스는 0 
			S[i] = S[i - 1] + Integer.parseInt(sToken.nextToken());  // 합 배열 생성
		}
		
		// 입력 값을 받아 첫번 째 구간 i 값, 두번 째 구간 j 값으로 받음
		for(int q = 0; q < quizNo; q++) {
			sToken = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(sToken.nextToken()); // 구간 합 i
			int j = Integer.parseInt(sToken.nextToken()); // 구간 합 j
			
			System.out.println(S[j] - S[i - 1]);
		}
		

	}

}
