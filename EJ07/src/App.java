public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[100];
        for (int i=0;i<100;i++) {
            num[i] = (int)(Math.random()*21);
            System.out.printf("%d ", num[i]);
        }
        System.out.println("\n");

        System.out.print("Introduce el valor a cambiar: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el valor que lo sustituirá: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println();
        for (int i=0;i<100;i++) {
            if (num[i]==a) {
                num[i] = b;
                System.out.printf("'%d' ", num[i]);
            } else
                System.out.printf("%d ", num[i]);
        }
    }
}