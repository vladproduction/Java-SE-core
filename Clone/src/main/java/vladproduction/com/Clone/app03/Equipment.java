package vladproduction.com.Clone.app03;

public class Equipment {

    private String typeEngine;
    private double engineCapacity;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "typeEngine='" + typeEngine + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
