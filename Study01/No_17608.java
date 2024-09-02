package Study01;

import java.io.*;
import java.util.Stack;

public class No_17608 {
    public static void main(String[] args) throws IOException {
        // 오른쪽에서 막대기가 몇개 보이냐 ? , 오른쪽은 무조건 보이므로 count = 1 부터 시작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }
        int firststick = stack.pop();
        int cnt = 1;
        while(!stack.isEmpty()){
            int secondstick = stack.pop();
            if(secondstick>firststick){
                firststick = secondstick;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
