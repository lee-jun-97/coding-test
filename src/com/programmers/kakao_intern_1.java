package com.programmers;

import java.util.HashMap;
import java.util.Map;

public class kakao_intern_1 {

    public static void main(String[] args) {

//    	String[] survey = {"AN","CF","MF","RT","NA"};
//    	int[] choices = {5,3,2,7,5};
    	
    	String[] survey = {"TR", "RT", "TR"};
    	int[] choices = {7,1,3};
    	
    	String result = solution(survey, choices);
    	
    	System.out.println(result);
    	
    }
    
    public static String solution(String[] survey, int[] choices) {
    	
    	String answer = "";
    	
    	Map<Character, Integer> scoreMap = saveScore(survey, choices);

    	StringBuilder result = new StringBuilder();
    	
    	result.append(isValid('T', 'R', scoreMap));
    	result.append(isValid('C', 'F', scoreMap));
    	result.append(isValid('J', 'M', scoreMap));
    	result.append(isValid('A', 'N', scoreMap));
    	
    	answer = result.toString();
    	
    	
    	return answer;
    }
    
    public static String isValid(char a, char b, Map<Character, Integer> scoreMap) {
    	
    	String mbti = "";
    	
    	if(scoreMap.get(a) == null && scoreMap.get(b) == null) {
    		mbti = Character.toString(a < b ? a : b);
    	} else if(scoreMap.get(a) == null) {
    		mbti = Character.toString(b);
    	} else if(scoreMap.get(b) == null) {
    		mbti = Character.toString(a);
    	} else if(scoreMap.get(a) == scoreMap.get(b)) {
    		mbti = Character.toString(a < b ? a : b);
    	} else {
    		mbti = scoreMap.get(a) < scoreMap.get(b) ? Character.toString(b) : Character.toString(a) ;
    	}
    	
    	return mbti;
    }
    
    public static Map<Character, Integer> saveScore(String[] survey, int[] choices) {
    	
    	Map<Character, Integer> scoreMap = new HashMap<>();
    	
    	for(int i=0; i<choices.length; i++) {
    		if(choices[i] < 4) {
    			if(scoreMap.get(survey[i].charAt(0)) != null) {
    				scoreMap.put(survey[i].charAt(0), scoreMap.get(survey[i].charAt(0)) + Math.abs(4-choices[i]));
    			} else {
    				scoreMap.put(survey[i].charAt(0), Math.abs(4-choices[i]));
    			}
    		}
    		
    		if(choices[i] == 4 ) {
    			if(scoreMap.get(survey[i].charAt(0)) == null) {
    				scoreMap.put(survey[i].charAt(0), 0);
    			}
    			
    			if(scoreMap.get(survey[i].charAt(1)) == null) {
    				scoreMap.put(survey[i].charAt(1), 0);
    			}
    		}
    		
    		if(choices[i] > 4) {
    			if(scoreMap.get(survey[i].charAt(1)) != null) {
    				scoreMap.put(survey[i].charAt(1), scoreMap.get(survey[i].charAt(1)) + Math.abs(4-choices[i]));
    			} else {
    				scoreMap.put(survey[i].charAt(1), Math.abs(4-choices[i]));
    			}
    		}
    	}
    	
    	return scoreMap;
    	
    }
    
}
