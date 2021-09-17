/**
 * @date:2021-4-12, 19:13
 * @author:ShiShc
 */

public class countArrangement {
    int count = 0;
    public int f(int N) {
        boolean[] visited = new boolean[N+1];
        help(N, 1, visited);
        return count;
    }

    public void help(int N, int pos, boolean[] visited) {
        if(pos > N) {
            count ++;
        }
        for(int i = 1;i <= N;i ++) {
            if(!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                help(N, pos+1, visited);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        countArrangement obj = new countArrangement();
        System.out.println(obj.f(3));

    }
}
