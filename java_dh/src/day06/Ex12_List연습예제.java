package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_List연습예제 { //중복 가능 <-> 14

	public static void main(String[] args) {
		// ArrayList를 이용하여 정수를 저장하는 list를 생성
		ArrayList<Integer>list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		//list에 숫자를 3개를 입력하여 저장
		for(; list.size() < 3 ;) {
			System.out.println("정수입력 : ");
			int num =scan.nextInt();
			list.add(num);
		}
//  	list.add(10);
//		list.add(20);
//		list.add(30); // -> 이건 고정된 값이고 위 코드는 콘솔에서 직접 입력가능
		
		//list에 잇는 값을 콘솔에 출력
		System.out.println(list);
	}

}
