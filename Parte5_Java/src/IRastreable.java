/**
 * PARTE 5 - Contrato de rastreo para envios postales.
 * Evaluacion Fundamentos de Diseno de Software - Corte 1
 */
public interface IRastreable {

    /**
     * Consulta la ubicacion actual del envio.
     * @return descripcion de la ubicacion del paquete.
     */
    String consultarUbicacion();
}
