public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROCESAMIENTO DE PAGOS ===");

        // Tarjeta
        System.out.println("--- Pago con Tarjeta de Crédito ---");
        PagoTarjeta tarjeta = new PagoTarjeta("1234567890", "Alejandro Fabara");
        tarjeta.verificarIdentidad("1234567890");
        tarjeta.procesarPago(250, "TXN-001");
        System.out.println("Comprobante: " + tarjeta.generarComprobante() + "-TXN-001");

        // PayPal
        System.out.println("--- Pago con PayPal ---");
        PagoPayPal paypal = new PagoPayPal("Alejo@gmail.com");
        paypal.procesarPago(180, "TXN-002");

        // Transferencia
        System.out.println("--- Pago con Transferencia ---");
        PagoTransferencia transf = new PagoTransferencia("1234567890");
        transf.verificarIdentidad("0987654321");
        transf.procesarPago(500, "TXN-003");

        System.out.println("\n=== PROCESAMIENTO DE DEVOLUCIONES ===");
        // Devolución Tarjeta
        System.out.println("--- Devolución Tarjeta ---");
        tarjeta.procesarDevolucion(50, "Producto defectuoso");
        System.out.println("Días permitidos: " + tarjeta.diasParaDevolucion() + " días");

        // Devolución PayPal
        System.out.println("--- Devolución PayPal ---");
        paypal.procesarDevolucion(30, "Cambio de opinión");
        System.out.println("Días permitidos: " + paypal.diasParaDevolucion() + " días");
        System.out.println("\n=== FIN DEL PROCESO ===");


    }
}