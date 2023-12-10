public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        System.out.print("1. Introduce un número: ");
        num[0] = Integer.parseInt(System.console().readLine());
        int max = num[0];
        int min = num[0];
        for (int i=1;i<10;i++) {
            System.out.printf("%d. Introduce un número: ", i+1);
            num[i] = Integer.parseInt(System.console().readLine());
            if (num[i]>max)
                max=num[i];
            if (num[i]<min)
                min=num[i];
        }
        for (int i=0;i<10;i++) {
            if (num[i]==max)
                System.out.printf("%d máximo%n", num[i]);
            else if (num[i]==min)
                System.out.printf("%d mínimo%n", num[i]);
            else
                System.out.println(num[i]);
        }
    }
}