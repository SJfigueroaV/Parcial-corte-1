public class Main {

    public static void main(String[] args) {
        Paquete[] envios = new Paquete[2];
        envios[0] = new PaqueteExpress("GUIA-001", 2.5, 15000, 8000);
        envios[1] = new PaqueteExpress("GUIA-002", 0.8, 10000, 5000);

        for (Paquete envio : envios) {
            System.out.println("Guia: " + envio.getGuia() + " - Costo total: $" + envio.calcularCostoTotal());
        }
    }
}
