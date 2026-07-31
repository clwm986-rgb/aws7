package day02;

public class Ex01_변수연습예제 {

	public static void main(String[] args) {
		// 1학년 1반 1번 성이 '김'인 학생의 정보를 저장하기 위한 모든 변수 선언
		int grade = 1;
		int ClassNum = 1;
		int num = 1;
		int grade2 = '1'; //아스키코드로 인식됨 (char) 를 붙이면 아스키 코드로 인식 ㄴㄴ
		char famliyName = '김';
		
		System.out.println(" " + grade + "학년 " + ClassNum + "반 " + num + "번 " + famliyName );
		System.out.println(" " + grade2 + "학년 " + ClassNum + "반 " + num + "번 " + famliyName );
		System.out.println(" " + (char)grade2 + "학년 " + ClassNum + "반 " + num + "번 " + famliyName );
	}

}
