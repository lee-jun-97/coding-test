package com.programmers;

public class startup_intern_3 {
	
	public static void main(String[] args) {
		
//		String line = "Q4OYPI";
		String line = "RYI76";
//		String line = "64E2";
		
		int[] result = solution(line);
		
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	public static int[] solution(String line) {
		int[] answer = new int[line.length()];
		
		int index = 0;
		
		int[] rloc = {1,9};
		int[] lloc = {1,0};
		char[][] keyboard = {{'1','2','3','4','5','6','7','8','9','0'}, {'Q','W','E','R','T','Y','U','I','O','P'}};
		
		char[] arr = line.toCharArray();
		
		for(char c : arr) {
			for(int i=0; i<keyboard.length; i++) {
				for(int j=0; j<keyboard[0].length; j++) {
					if(keyboard[i][j] == c) {
						int rdistance = Math.abs(rloc[0] - i) + Math.abs(rloc[1] - j);
						int ldistance = Math.abs(lloc[0] - i) + Math.abs(lloc[1] - j);
						
						if(rdistance < ldistance) {
							rloc[0] = i;
							rloc[1] = j;
							answer[index] = 1;
						} else if (ldistance < rdistance) {
							lloc[0] = i;
							lloc[1] = j;
							answer[index] = 0;
						} else if (rdistance == ldistance) {
							if(Math.abs(rloc[1] - j) > Math.abs(lloc[1] - j)) {
								lloc[0] = i;
								lloc[1] = j;
								answer[index] = 0;
							} else if(Math.abs(rloc[1] - j) == Math.abs(lloc[1] - j)) {
								if(j < 5) {
									lloc[0] = i;
									lloc[1] = j;
									answer[index] = 0;
								} else {
									rloc[0] = i;
									rloc[1] = j;
									answer[index] = 1;
								}
							} else {
								rloc[0] = i;
								rloc[1] = j;
								answer[index] = 1;
							}
						}
						
						index++;
					}
				}
			}
		}
		
		return answer;
	}

}
