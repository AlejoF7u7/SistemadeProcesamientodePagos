interface MetodoPago {
    boolean validar();
    boolean procesarPago(double monto, String referencia);
    String generarComprobante();
}

interface Reembolsable {
    boolean procesarDevolucion(double monto, String motivo);
    int diasParaDevolucion();
}

interface Verificable {
    boolean verificarIdentidad(String documento);
    boolean esSeguro();
}