package Reflection.app04_annotation;

public class Main01 {
    public static void main(String[] args) {
        CarF car = new CarF();
        car.setPrice(-10);
        System.out.println(car);

        ValidatorEngine validatorEngine = new ValidatorEngine();
        validatorEngine.validate(car);
    }
}
