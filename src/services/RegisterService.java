package services;

public class RegisterService {
    private static RegisterService instance;

    private RegisterService() {

    }

    public static RegisterService GetRegisterService() {
        if(instance == null) {
            instance = new RegisterService();
        }

        return instance;
    }
}
