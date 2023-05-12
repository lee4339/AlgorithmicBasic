package day6_슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 백준 11003
// 최솟값 찾기

/* N개의 수 A1, A2, ..., AN과 L이 주어진다.
 * Di = Ai-L+1 ~ Ai 중의 최솟값이라고 할 때, D에 저장된 수를 출력하는 프로그램을 작성하시오. 
 * 이때, i ≤ 0 인 Ai는 무시하고 D를 구해야 한다.
 * 
 * (입력) 첫째 줄에 N과 L이 주어진다. (1 ≤ L ≤ N ≤ 5,000,000)
 * 둘째 줄에는 N개의 수 Ai가 주어진다. (-109 ≤ Ai ≤ 109)
 * 
 * (출력) 첫째 줄에 Di를 공백으로 구분하여 순서대로 출력한다.
 * */

public class Ex_02_문제010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 데이터 개수
		int L = Integer.parseInt(st.nextToken()); // 최솟값을 구하는 범위
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>(); // 데이터를 담을 덱 자료구조
		
		for(int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken()); // 현재 데이터 값
			// 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
			
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast(); // 덱의 마지막 위치에서부터 now보다 큰 값은 덱에서 제거하기
			}
			mydeque.addLast(new Node(now, i)); // 덱의 마지막 위치에 now값 저장하기
			
			// 범위에서 벗어난 값은 덱에서 제거
			if(mydeque.getFirst().index <= i - L) { // 덱의 1번째 위치에서 부터 
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " "); // 출력
		}
		
		bw.flush();
		bw.close();
		
		

	}
	
	// 덱 자료구조
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}

}
