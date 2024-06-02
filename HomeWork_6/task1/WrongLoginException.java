package task1;

public class WrongLoginException extends Exception {

    public WrongLoginException (){
        super();
    }

    public WrongLoginException (String msg){
        super(msg);
    }
}
