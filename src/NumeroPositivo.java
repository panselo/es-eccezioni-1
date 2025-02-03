class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException {
        setNumero(numero);
    }

    public void setNumero(int numero) throws NegativeException {
        if (numero < 0) {
            throw new NegativeException("Numero negativo non consentito: " + numero);
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}