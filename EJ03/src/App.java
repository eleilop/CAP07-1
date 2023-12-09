public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        for (int i=0;i<10;i++) {
            System.out.printf("%d. Introduce un número: ", i+1);
            num[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i=9;i>=0;i--)
            System.out.printf("%d ", num[i]);
    }
}