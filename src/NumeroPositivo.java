class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) {
        try {
            setNumero(numero);
        } catch (NegativeException e) {
            System.err.println(e.getMessage());
        } catch (NumeroEsclusoException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setNumero(int numero) throws NegativeException, NumeroEsclusoException {
        if (numero < 0) {
            throw new NegativeException("Numero negativo non consentito: " + numero);
        }if (numero == 20) {
            throw new NumeroEsclusoException();
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}