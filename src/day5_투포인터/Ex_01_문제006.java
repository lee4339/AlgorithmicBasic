package day5_투포인터;

import java.util.Scanner;

// 투 포인터 : 2개의 포인터로 알고리즘의 시간 복잡도를 최적화

// 백준 2018번
// 연속된 자연수의 합 구하기
/*
 * 어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 
 * 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 
 * 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 
 * 이때, 사용하는 자연수는 N이하여야 한다.
 * 예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 
 * 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.
 * N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.
 * (입력) 첫 줄에 정수 N이 주어진다.
 * (출력) 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오
 * */


/*<이동 원칙>
 * sum > N : sum = sum - start_indext; start_index++;
 * sum < N : end_index++; sum = sum + end_index;
 * sum == N : end_index++' sum = sum + end_index; count++;
 * */
public class Ex_01_문제006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 변수 저장
		int count = 1; // 1인 이유는 자기 자신 포함
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != N) { // 마지막 인덱스가 증가하여 N과 같아지면 나감
			if(sum == N) { // 현재 연속 합이 N과 같은 경우 
				count++; // 연속 수 찾음
				end_index++;
				sum = sum + end_index;
			} else if(sum > N) { // 현재 연속 합이 N보다 더 큰 경우
				sum = sum - start_index;
				start_index++;
			} else { // 현재 연속 합이 N보다 작은 경우
				end_index++;
				sum = sum + end_index;
			}
		}
		
		System.out.println(count);

	}

}
