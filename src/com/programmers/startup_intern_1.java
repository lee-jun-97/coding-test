package com.programmers;

public class startup_intern_1 {
	
	public static void main(String[] args) {
		
//		int[][] atoms = {{80,35}, {70,38},{100,41}, {75,30}, {160,80}, {77, 29}, {181, 68}, {151,76}};
//		int[][] atoms = {{30,15},{80,35}};
		int[][] atoms = {{140,90}, {177,25}, {95,45},{71,31},{150,30},{80,35},{72,33},{166,81},{151,75}};
		
		int result = solution(atoms);
		
		System.out.println(result);
	}
	
	public static int solution(int[][] atoms) {
		
		int answer = 0;
		int use = 0;
		
		for(int[] i : atoms) {
			if(i[0] > 80 || i[1] > 35) {
				if( use == 0 ) {
					answer++;
				}
				use++;
			} else if(use != 0) {
				use++;
			}
			
			if(i[0] > 150 && i[1] > 75) {
				use = 0;
			}
			
			if(use == 3) {
				use = 0;
			}
			

		}
		
		return answer;
	}

}
