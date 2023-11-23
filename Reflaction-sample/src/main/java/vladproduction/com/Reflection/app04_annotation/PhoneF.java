package Reflection.app04_annotation;

public class PhoneF {

    @MyValidator(errorMessage = "phone must weight not more 1 kg",errorMessage2 = "phone")
    //@MyValidator
    //@MyValidator(errorMessage = "not valid data",errorMessage2 = "not valid data2")
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
