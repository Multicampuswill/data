package 배열응용;

import java.util.*;

public class 배열랜덤데이터넣어서배열비교 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] num1 = new int[1000]; 
		int[] num2 = new int[1000]; 
		
		for (int i = 0; i < num1.length; i++) {
			num1[i] = r.nextInt(1000); //0-999
			num2[i] = r.nextInt(1000); //0-999
		}
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		System.out.println(num1 + " " + num2);
		System.out.println(num1 == num2); //참조형변수를 ==(비교연산자)로 비교하면 주소!비교!
	
		int[] num3 = {1,2};
		int[] num4 = {1,2};
		System.out.println(num3 == num4); //주소 비교!
		System.out.println(Arrays.equals(num3, num4)); //배열의 값이 동일한지 비교! 
		
	}

}
