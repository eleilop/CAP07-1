public class App {
    public static void main(String[] args) throws Exception {
        /* PIDE LOS NÚMEROS Y LOS GUARDA */
        int[] num = new int[15];
        for (int i=0;i<15;i++) {
            System.out.printf("%d. Introduce un número: ", i+1);
            num[i] = Integer.parseInt(System.console().readLine());
        }

        /* MUESTRA EL ARRAY */
        System.out.println("\nArray original:");
        for (int i = 0; i < 15; i++)
            System.out.printf("%d ", num[i]);

        /* MUEVE UNA POSICIÓN LOS VALORES */
        int aux = num[14];
        for (int i = 14; i > 0; i--)
            num[i] = num[i-1];
        num[0] = aux;

        /* MUESTRA EL ARRAY ROTADO*/
        System.out.println("\n\nArray rotado:");
        for (int i = 0; i < 15; i++)
            System.out.printf("%d ", num[i]);
    }
}