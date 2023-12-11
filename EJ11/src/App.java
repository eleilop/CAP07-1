public class App {
    /**
     * 
     * @param num Número a comprobar si es primo
     * @return TRUE si num ES PRIMO | FALSE si num NO ES PRIMO
     */
    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i=1;i<=num/2;i++) {
            if (num%i==0)
                contador++;
        }
        if (contador==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        int contadorPrimo = 0;
        int contadorResto = 0;
        System.out.print("1. Introduce un número: ");
        num[0] = Integer.parseInt(System.console().readLine());
        if (esPrimo(num[0]))
            contadorPrimo++;
        else
            contadorResto++;
        int max = num[0];
        /* GUARDA 10 NÚMEROS EN EL ARRAY (TAMBIÉN BUSCA EL NÚMERO MÁS GRANDE PARA PODER FORMATEAR BIEN LOS ESPACIOS) */
        for (int i=1;i<10;i++) {
            System.out.printf("%d. Introduce un número: ", i+1);
            num[i] = Integer.parseInt(System.console().readLine());
            if (num[i]>max)
                max = num[i];
            if (esPrimo(num[i]))
                contadorPrimo++;
            else
                contadorResto++;
        }

        String sNum = ""+max;
        int longitud = sNum.length();
        int[] primo = new int[contadorPrimo];
        int[] resto = new int[contadorResto];
        contadorPrimo = 0;
        contadorResto = 0;
        System.out.println("################### ARRAY INICIAL ###################");
        /* IMPRIME EL ÍNDICE */
        System.out.print("ÍNDICE | ");
        for (int i=0;i<10;i++)
            System.out.printf(" %"+longitud+"d |", i);
        System.out.println();
        /* IMPRIME EL CONTENIDO DEL ARRAY Y GUARDA LOS NÚMEROS EN ARRAYS SEGÚN SI ES PRIMO O NO*/
        System.out.print("VALOR  | ");
        for (int i=0;i<10;i++) {
            System.out.printf(" %"+longitud+"d |", num[i]);
            if (esPrimo(num[i])) {
                primo[contadorPrimo] = num[i];
                contadorPrimo++;
            } else {
                resto[contadorResto] = num[i];
                contadorResto++;
            }
        }
        System.out.println("\n");

        /* INTRODUCE EL ARRAY DE PRIMOS EN EL DE NÚMEROS */
        for (int i=0;i<contadorPrimo;i++)
            num[i] = primo[i];

        /* INTRODUCE EL ARRAY DE RESTO EN EL DE NÚMEROS */
        int j=0;
        for (int i=contadorPrimo;i<contadorResto+contadorPrimo;i++) {
            num[i] = resto[j];
            j++;
        }

        System.out.println("########## ARRAY ORDENADO (PRIMO-NO PRIMO) ##########");
        /* IMPRIME EL ÍNDICE */
        System.out.print("ÍNDICE | ");
        for (int i=0;i<10;i++)
            System.out.printf(" %"+longitud+"d |", i);
        System.out.println();
        /* IMPRIME EL CONTENIDO DEL ARRAY DE NÚMEROS*/
        System.out.print("VALOR  | ");
        for (int i=0;i<10;i++) 
            System.out.printf(" %"+longitud+"d |", num[i]);
    }
}