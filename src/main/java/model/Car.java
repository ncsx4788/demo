package model;


public class Car {
    public Car(String model, int kilometers) {
        Model = model;
        this.kilometers = kilometers;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    String Model;

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    int kilometers ;
}
