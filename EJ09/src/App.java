public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[8];
        for (int i=0;i<8;i++) {
            System.out.printf("%d. Introduce un número: ", i+1);
            num[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i=0;i<8;i++) {
            if (num[i]%2==0)
                System.out.printf("%d par%n", num[i]);
            else
                System.out.printf("%d impar%n", num[i]);
        }
    }
}