package vladproduction.com;

import java.util.Objects;

public class CarDTO {
    private String model;
    private Integer year;

    public CarDTO(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public CarDTO() {
        carInfo();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CarDTO carDTO = (CarDTO) object;
        return Objects.equals(model, carDTO.model) && Objects.equals(year, carDTO.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    private void carInfo(){
        CarDTO carObject = getInstance();
        String s = carObject.toString();
        System.out.println(s);
    }

    private CarDTO getInstance() {
        return new CarDTO(getModel(), getYear());
    }
}
