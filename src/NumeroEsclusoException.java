public class NumeroEsclusoException extends Exception{

    public NumeroEsclusoException(){
        super("Il numero è escluso!");
    }
    public NumeroEsclusoException(String msg){
        super(msg);
    }

}
