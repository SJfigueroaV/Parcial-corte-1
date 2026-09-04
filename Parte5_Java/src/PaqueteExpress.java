public class PaqueteExpress extends Paquete implements IRastreable {

    private double recargoUrgencia;

    public PaqueteExpress(String guia, double pesoKg, double precioBase, double recargoUrgencia) {
        super(guia, pesoKg, precioBase);
        this.recargoUrgencia = recargoUrgencia;
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecioBase() + (getPesoKg() * 5000) + recargoUrgencia;
    }

    @Override
    public String consultarUbicacion() {
        return "En centro de distribucion principal";
    }
}
