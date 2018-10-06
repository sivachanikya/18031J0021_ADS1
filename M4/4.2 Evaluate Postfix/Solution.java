import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		String exp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		exp=br.readLine();
		Solution p=new Solution();
		System.out.println(p.evaluate(exp));

	}
	int  evaluate(String exp) {
		String str[] = exp.split(" ");
		int n = 0, l = str.length;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < l; i++) {
			try {
				n = Integer.parseInt(str[i]);
				stack.push(n);
			} catch (NumberFormatException e) {
				int v1 = stack.pop();
				int v2 = stack.pop();
				switch (str[i].charAt(0)) {
				case '+':
					n = v1 + v2;
					break;
				case '-':
					n = v2 - v1;
					break;
				case '*':
					n = v1 * v2;
					break;
				case '/':
					n = v2 / v1;
					break;

				}
				stack.push(n);
			}

		}
		return (stack.pop());
	}
}



	


