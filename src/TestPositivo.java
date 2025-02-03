public class TestPositivo {
    public static void main(String[] args) {
        try {
            NumeroPositivo np = new NumeroPositivo(-5);
        } catch (NegativeException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        }

        try {
            NumeroPositivo np = new NumeroPositivo(10);
            System.out.println("Numero memorizzato: " + np.getNumero());
        } catch (NegativeException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        }
    }
}