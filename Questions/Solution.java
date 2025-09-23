package Questions;

import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();

        if (ch.equals(ch.toUpperCase())) {
            System.out.println(1);
        }
        else if (ch.equals(ch.toLowerCase())){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }

		
        
	}
}
