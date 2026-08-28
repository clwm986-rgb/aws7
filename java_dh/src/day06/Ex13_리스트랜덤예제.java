package day06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex13_리스트랜덤예제 {

	public static void main(String[] args) {
	//1~9사이의 랜덤한 수 3개를 생성하여 ArrayList에 저장하고 콘솔에 출력

		Random random = new Random();
		int min =1, max = 9;
		
		//ArrayList를 Integer(정수)를 생성
		ArrayList<Integer> list = new ArrayList<>();
		
		
		while(list.size() < 3){//리스트에 3개가 저장될때까지 반복
			int num = random.nextInt(min, max +1);//1~9사이의 랜덤한 수를 만듬
			list.add(num);//리스트에 추가
		}
		System.out.println(list);
		}
	}


