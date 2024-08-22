package package1.app;

import package1.data.LoginRequest;
import package1.error.BlankException;
import package1.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("user", null);

        try {
            ValidationUtil.validateRuntime(loginRequest);
            System.out.println("data valid");
        } catch (BlankException| NullPointerException exception){
            System.out.println("data tidak valid"+ exception.getMessage());
        }finally{
            System.out.println("selalu dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest("", "password");
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("sukses");
    }
    
}
