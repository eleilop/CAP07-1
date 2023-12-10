public class App {
    public static void main(String[] args) throws Exception {
        /* GENERA 20 NÚMEROS ALEATORIOS (0-100) Y LOS GUARDA */
        int[] num = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;
        for (int i=0;i<20;i++) {
            num[i] = (int)(Math.random()*101);
            if (num[i]%2==0)
                contadorPar++;
            else
                contadorImpar++;
        }

        /* IMPRIME EL ARRAY DE NÚMEROS Y GUARDA LOS NÚMEROS EN ARRAYS SEGÚN SON PAR O IMPAR*/
        System.out.println("##################### ARRAY DE NÚMEROS #####################");
        int[] par = new int[contadorPar];
        int[] impar = new int[contadorImpar];
        contadorPar = 0;
        contadorImpar = 0;
        for (int i=0;i<20;i++) {
            if (num[i]%2==0) {
                par[contadorPar] = num[i];
                contadorPar++;
            } else {
                impar[contadorImpar] = num[i];
                contadorImpar++;
            }
            System.out.printf("%d ", num[i]);
        }
        System.out.println("\n");

        /* INTRODUCE EL ARRAY DE PARES EN EL DE NÚMEROS */
        for (int i=0;i<contadorPar;i++)
            num[i] = par[i];

        /* INTRODUCE EL ARRAY DE IMPARES EN EL DE NÚMEROS */
        int j=0;
        for (int i=contadorPar;i<contadorImpar+contadorPar;i++) {
            num[i] = impar[j];
            j++;
        }

        /* IMPRIME EL ARRAY DE NÚMEROS */
        System.out.println("############### ARRAY ORDENADO (PAR-IMPAR) ###############");
        for (int i=0;i<20;i++)
            System.out.printf("%d ", num[i]);
    }
}