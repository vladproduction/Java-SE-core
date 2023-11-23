package Reflection.app04_annotation;

public class Main_PhoneF {
    public static void main(String[] args) {
        PhoneF phoneF = new PhoneF();
        phoneF.setWeight(-200);
        ValidatorEngine validatorEngine = new ValidatorEngine();
        validatorEngine.validate(phoneF);
    }
}
