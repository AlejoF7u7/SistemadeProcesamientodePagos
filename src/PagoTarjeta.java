public class PagoTarjeta implements MetodoPago, Reembolsable, Verificable {
    private String numeroTarjeta;
    private String titular;

    public PagoTarjeta(String numero, String titular) {
        this.numeroTarjeta = numero;
        this.titular = titular;
    }

    @Override
    public boolean validar() {
        return true;
    }

    @Override
    public boolean verificarIdentidad(String documento) {
        System.out.println("✓ Identidad verificada: CI " + documento);
        return true;
    }

    @Override
    public boolean esSeguro() { return true; }

    @Override
    public boolean procesarPago(double monto, String referencia) {
        System.out.println("💳 Pago procesado: $" + monto + " - Ref: " + referencia);
        return true;
    }

    @Override
    public String generarComprobante() {
        return "TARJETA-xxxx-" + numeroTarjeta.substring(numeroTarjeta.length()-4);
    }

    @Override
    public boolean procesarDevolucion(double monto, String motivo) {
        System.out.println("✓ Devolución procesada: $" + monto + "\nMotivo: " + motivo);
        return true;
    }

    @Override
    public int diasParaDevolucion() {
        return 30;
    }
}