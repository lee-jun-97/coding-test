package com.programmers;

public class kakao_intern_5 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		String[] operations = {"ShiftRow", "Rotate", "ShiftRow"};
		
		int[][] result = solution(arr, operations);
		
		System.out.println(result.toString());
		
	}
	
	public static int[][] solution(int[][] rc, String[] operations) {
		int[][] answer = {};
		
		for(String i : operations) {
			switch(i) {
				case "Rotate" :
					answer = rotate(rc);
					break;
				case "ShiftRow" :
					answer = shiftRow(rc);
					break;
			}
			
		}
		
		return answer ;
	}
	
	public static int[][] rotate(int[][] rc) {
		
		int temp = 0;
		int temp_2 = rc[0][rc[0].length-1];

		for(int i=rc[0].length-1; i > 0 ; i--) {
			rc[0][i] = rc[0][i-1];
		}
		
		temp = rc[rc.length-1][rc[0].length-1];
		
		for(int i=rc.length-1; i > 0; i--) {
			rc[i][rc[0].length-1] = rc[i-1][rc[0].length-1];
		}
		
		rc[1][rc[0].length-1] = temp_2;
		
		temp_2 = rc[rc.length-1][0];
		
		for(int i=0; i<rc[0].length-1; i++) {
			rc[rc.length-1][i] = rc[rc.length-1][i+1];
		}
		
		rc[rc.length-1][rc[0].length-2] = temp;
		
		
		for(int i=0; i < rc[0].length-2 ; i++) {
			rc[i][0] = rc[i+1][0];
		}
		
		rc[1][0] = temp_2;
		
		return rc ;
	}
	
	public static int[][] shiftRow(int[][] rc) {
		
		int[] temp = rc[rc.length-1].clone();
		
		for(int i=rc.length-1; i > 0; i--) {
			rc[i] = rc[i-1].clone();
		}
		
		rc[0] = temp.clone();
		
		
		return rc;
	}

}
