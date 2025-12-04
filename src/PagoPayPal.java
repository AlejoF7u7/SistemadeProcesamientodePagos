public class PagoPayPal implements MetodoPago, Reembolsable {
    private String email;

    public PagoPayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean validar() {
        return email.contains("@"); // Validación simple [cite: 204]
    }

    @Override
    public boolean procesarPago(double monto, String referencia) {
        System.out.println("💰 Pago procesado: $" + monto + " - Ref: " + referencia);
        return true;
    }

    @Override
    public String generarComprobante() {
        return "PAYPAL-" + email;
    }

    @Override
    public boolean procesarDevolucion(double monto, String motivo) {
        return true;
    }

    @Override
    public int diasParaDevolucion() {
        return 180; // [cite: 205]
    }
}