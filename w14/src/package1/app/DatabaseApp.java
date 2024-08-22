package package1.app;

import package1.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase ("test", "rahasia");
        System.out.println("success connec to do db");

    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa kekonek ke database");
        }
    }
    
}
