package arr;

import java.util.ArrayList;

public class Arr {

	public static void main(String[] args) {
		// 배열 객체 생성
		int[] arr = new int[5];

		// 배열 주소에 값 삽입
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		// 배열 주소값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\s");
		}
		System.out.println();

		// 배열 주소에 들어있는 값과 비교연산 값이 같으면 조건에 맞춰서 실행
		if (arr[2] == 2) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
		
		// ArrayList배열 객체 생성, 참조 변수 al로 선언
		// ArrayList에 여러 값을 넣어주고 싶으면 클래스 타입을 넣어라.
		ArrayList<Integer> al = new ArrayList<>();
		
		// 반복문을 이용해서 al에 값을 5까지 입력 
		for(int i=0; i<=5; i++) {
			al.add(i);
		}

		// 값출력
		System.out.println(al);
		
		
		
	}

}
