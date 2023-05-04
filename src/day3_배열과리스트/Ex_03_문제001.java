package day3_배열과리스트;

import java.util.Scanner;

// 백준 11720번
// 숫자의 합 구하기

/* N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
 * (입력) 1번째 줄에 숫자의 개수 N(1 <= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
 * (출력) 입력으로 주어진 숫자 N개의 합을 출력한다.
 * */

public class Ex_03_문제001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 숫자의 개수
		String sNum = sc.next(); // 공백 없이 N개의 숫자
		
		// 입력값을 String형에서 char[]형 변수로 변환
		char[] cNum = sNum.toCharArray();
		
		int sum = 0; // sum을 담을 변수 초기화
		
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0'; // 문자를 숫자형으로 변경하기 위한 아스키코드 --> -48 또는 -'0'
		}
		
		System.out.println(sum);

	}

}
