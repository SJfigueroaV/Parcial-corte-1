/**
 * PARTE 5 - Paquete con entrega urgente.
 * Hereda de Paquete e implementa el contrato IRastreable.
 */
public class PaqueteExpress extends Paquete implements IRastreable {

    private double recargoUrgencia;

    /**
     * @param guia             codigo de guia del envio.
     * @param pesoKg           peso en kilogramos (> 0).
     * @param precioBase       precio base de la liquidacion.
     * @param recargoUrgencia  recargo adicional por entrega urgente.
     */
    public PaqueteExpress(String guia, double pesoKg, double precioBase, double recargoUrgencia) {
        super(guia, pesoKg, precioBase); // delega la validacion del peso a la superclase
        this.recargoUrgencia = recargoUrgencia;
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    @Override
    public double calcularCostoTotal() {
        // precioBase + (pesoKg x 5000) + recargoUrgencia
        return getPrecioBase() + (getPesoKg() * 5000) + recargoUrgencia;
    }

    @Override
    public String consultarUbicacion() {
        return "En centro de distribucion principal";
    }
}
