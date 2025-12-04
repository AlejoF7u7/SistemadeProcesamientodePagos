public class PagoTransferencia implements MetodoPago, Verificable {
    private String cuenta;



    public PagoTransferencia(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public boolean validar() {
        return cuenta.length() == 10; // 10 dígitos [cite: 209]
    }

    @Override
    public boolean verificarIdentidad(String doc) {
        System.out.println("✓ Identidad verificada: CI " + doc);
        return true;
    }

    @Override
    public boolean esSeguro() { return true; }

    @Override
    public boolean procesarPago(double monto, String referencia) {
        System.out.println("🏦 Pago procesado: $" + monto + " - Ref: " + referencia);
        return true;
    }

    @Override
    public String generarComprobante() {
        return "TRANSFER-" + cuenta;
    }

}