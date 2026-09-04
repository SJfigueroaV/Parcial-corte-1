/**
 * PARTE 5 - Clase abstracta que modela un paquete postal generico.
 * Evaluacion Fundamentos de Diseno de Software - Corte 1
 */
public abstract class Paquete {

    // Atributos privados: encapsulamiento del estado interno
    private String guia;
    private double pesoKg;
    private double precioBase;

    /**
     * Constructor parametrizado con validacion.
     * @param guia       codigo de guia del envio.
     * @param pesoKg     peso en kilogramos (debe ser > 0).
     * @param precioBase precio base de la liquidacion.
     */
    public Paquete(String guia, double pesoKg, double precioBase) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException(
                    "El peso del paquete debe ser mayor que 0 kg. Recibido: " + pesoKg);
        }
        this.guia = guia;
        this.pesoKg = pesoKg;
        this.precioBase = precioBase;
    }

    public String getGuia() {
        return guia;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Cada tipo de paquete define su propia formula de liquidacion.
     * @return costo total del envio.
     */
    public abstract double calcularCostoTotal();
}
