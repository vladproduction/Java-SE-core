package vladproduction.com.app01;

public final class ClassA {
    private String fieldA;
    private String fieldB;

    public ClassA(String fieldA, String fieldB) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB='" + fieldB + '\'' +
                '}';
    }
}
