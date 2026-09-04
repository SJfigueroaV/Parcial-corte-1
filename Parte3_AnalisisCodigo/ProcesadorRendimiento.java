public class ProcesadorRendimiento {
    public static void main(String[] args) {
        int[] calificaciones = new int[4];
        calificaciones[0]= 80;
        calificaciones[1]= 90;
        calificaciones[2]= 75;
        calificaciones[3]= 85;

        //Bucle para acumular la suma
        int acumulador = 0;
        for (int i = 0; i <= calificaciones.length-1; i++) {
            acumulador += calificaciones[i];
        }

        double promedio = (double) acumulador/4;
        System.out.println("Promedio calculado: " + promedio);
    }
}