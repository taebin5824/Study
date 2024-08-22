package Study01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int size = str.length();
        int[] arr = new int[10];
        int num = 0;
        int max = 0;

        for (int i = 0; i < size; i++) {
            num = str.charAt(i) - '0';
            arr[num]++;
        }
        int k = (arr[6] + arr[9]);
        if (k % 2 == 0) {
            arr[6] = k / 2;
            arr[9] = k / 2;
        } else {
            arr[6] = k / 2 + 1;
            arr[9] = k / 2 + 1;
        }
        for (int i : arr) {
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}
