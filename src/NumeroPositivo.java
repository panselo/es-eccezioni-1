public class NumeroPositivo {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws NegativeException {

        if (numero < 0){
            throw new NegativeException("IL NUMERO NON PUO ESSERE NEGATIVO!!!!!");
        }
        this.numero = numero;
    }

}
