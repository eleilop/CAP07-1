public class App {
    public static void main(String[] args) throws Exception {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i=0;i<20;i++) {
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
            System.out.printf("%-3d | %-4d | %d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}