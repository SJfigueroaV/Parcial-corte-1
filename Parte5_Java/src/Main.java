/**
 * PARTE 5 - Clase de prueba del sistema de liquidacion de envios.
 * Demuestra polimorfismo: el arreglo es de tipo Paquete (abstracto)
 * y la JVM resuelve calcularCostoTotal() por ligadura tardia,
 * sin necesidad de condicionales if para verificar el tipo.
 */
public class Main {

    public static void main(String[] args) {

        // Arreglo polimorfico: referencias de tipo Paquete, instancias concretas
        Paquete[] envios = new Paquete[2];
        envios[0] = new PaqueteExpress("GUIA-001", 2.5, 15000, 8000);
        envios[1] = new PaqueteExpress("GUIA-002", 0.8, 10000, 5000);

        // Recorrido con for-each, sin if ni instanceof: puro polimorfismo
        for (Paquete envio : envios) {
            System.out.println("Guia: " + envio.getGuia()
                    + " | Costo total: $" + envio.calcularCostoTotal());
        }
    }
}
