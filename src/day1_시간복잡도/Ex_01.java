package day1_시간복잡도;

public class Ex_01 {

	public static void main(String[] args) {
		// 1 ~ 100 사이 값 랜덤 선택
		int findNumber =(int)(Math.random() * 100);
		
		for(int i = 0; i < 100; i++) {
			if(i == findNumber) {
				System.out.println(i);
				break;
			}
		}

	}
	// 빅-오메가: best case (1)
	// 빅-세타: average case (N/2)
	// 빅-오: worst case (N)
}
