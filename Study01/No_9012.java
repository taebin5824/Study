package Study01;

import java.io.*;
import java.util.Stack;

public class No_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            boolean VPS = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push('(');
                }else{
                    if(stack.isEmpty()){
                        VPS = false;
                        break;
                    }
                    stack.pop();
                    }
                }
            if(!stack.isEmpty()) VPS = false;
            if(VPS){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}


