package Leet_Code;

import java.math.*;
class plus_one {
    public int[] plusOne(int[] digits) {
        String result = "";
        if(digits[digits.length-1]!=9) 
            digits[digits.length-1]+=1;
        else {
            for(int i: digits) 
                result+=String.valueOf(i);
            
            result = new BigInteger(result).add(new BigInteger("1")).toString();
            int[] answer = new int[result.length()];

            for(int i=0; i<result.length(); i++) 
                answer[i] = Integer.parseInt(String.valueOf(result.charAt(i)));

            return answer;
        }
        return digits;
    }
}
