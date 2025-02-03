public class NegativeException extends Exception{
    public NegativeException(){
        super("ERRORE!!!");
    }
    public NegativeException(String msg){
        super(msg);
    }
}