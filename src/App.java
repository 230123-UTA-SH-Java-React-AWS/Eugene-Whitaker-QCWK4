@FunctionalInterface
interface Solution {
    public abstract int solution(int b, int s, int t);
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = (int b, int s, int t) -> {
            int quotient = b / (s + t);
            int remainder = b % (s + t);
            if (remainder > s) {
                return t * quotient + (remainder - s);
            } else {
                return s * quotient + remainder;
            }
        };
        System.out.println(solution.solution(9, 2, 3));
    }
}
