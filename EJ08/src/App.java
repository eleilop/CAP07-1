public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa pide la temperatura media que ha hecho en cada mes de un determinado año y muestra a un diagrama de barras con esos datos.");
        int[] temp = new int[12];
        for (int i=0;i<12;i++) {
            System.out.printf("Introduce la temperatura media de %s: ", i==0?"Enero":i==1?"Febrero":i==2?"Marzo":i==3?"Abril":i==4?"Mayo":i==5?"Junio":i==6?"Julio":i==7?"Agosto":i==8?"Septiembre":i==9?"Octubre":i==10?"Noviembre":"Diciembre");
            temp[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i=0;i<12;i++) {
            System.out.printf("%10s ", i==0?"Enero":i==1?"Febrero":i==2?"Marzo":i==3?"Abril":i==4?"Mayo":i==5?"Junio":i==6?"Julio":i==7?"Agosto":i==8?"Septiembre":i==9?"Octubre":i==10?"Noviembre":"Diciembre");
            for (int j=1;j<=temp[i];j++)
                System.out.print("*");
            System.out.println();
        }
    }
}