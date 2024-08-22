package package1.error;

public class ValidationException{
    private String message;

    public ValidationException (String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
}
