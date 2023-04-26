public class RecursiveFibonacci {
    static int fibonacci(int a) {
        if (a == 1 || a == 2){
            return 1;
        }
        return fibonacci(a-1)+fibonacci(a-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}