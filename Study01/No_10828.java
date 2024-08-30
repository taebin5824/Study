package Study01;

import java.io.*;
import java.util.Stack;

public class No_10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] str;
        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");

            switch (str[0]) {
                case "push":
                    stack.push(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case "size" :
                    bw.write(stack.size() + "\n");
                    break;
                case "empty" :
                    if(stack.isEmpty()){
                        bw.write("1" + "\n");
                    }else{
                        bw.write("0" + "\n");
                    }
                    break;
                case "top" :
                    if(stack.isEmpty()){
                        bw.write("-1" + "\n");
                    }else{
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}


