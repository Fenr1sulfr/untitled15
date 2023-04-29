import java.util.Stack;

public class MyNode {
    public static void main(String[] args) {

    }
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int j = stack.pop();
                answer[j] = prices[j] - prices[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = prices[j];
        }
        return answer;
    }
}
