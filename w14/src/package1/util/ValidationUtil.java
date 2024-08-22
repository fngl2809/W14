package package1.util;

import package1.data.LoginRequest;
import package1.error.BlankException;

public class ValidationUtil {
    public static void validateRuntime( LoginRequest loginrequest){
        if (loginrequest.username () == null){
            throw new NullPointerException("username is null");
        }else if (loginrequest.username().isBlank()){
            throw new BlankException("username is blank");
        }else if (loginrequest.password() == null){
            throw new NullPointerException("password is null");
        }else if (loginrequest.password().isBlank()){
            throw new BlankException("password is blank");
        }
    }

}
