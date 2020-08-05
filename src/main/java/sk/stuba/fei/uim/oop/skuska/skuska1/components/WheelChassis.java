package sk.stuba.fei.uim.oop.skuska.skuska1.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class WheelChassis extends ComponentBase{
    private int carryingCapacity;
    private int rotationSpeed;
    private int maximumSpeed;
    private int numberOfWheels;

    public WheelChassis(int id, String name, int carryingCapacity, int rotationSpeed, int maximumSpeed, int numberOfWheels) {
        super(id, name);
        this.carryingCapacity = carryingCapacity;
        this.rotationSpeed = rotationSpeed;
        this.maximumSpeed = maximumSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
