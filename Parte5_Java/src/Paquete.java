public abstract class Paquete {

    private String guia;
    private double pesoKg;
    private double precioBase;

    public Paquete(String guia, double pesoKg, double precioBase) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0 kg");
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

    public abstract double calcularCostoTotal();
}
