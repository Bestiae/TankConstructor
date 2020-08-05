package sk.stuba.fei.uim.oop.skuska.skuska1.components.towers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.ComponentBase;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.CannonBase;


public class TowerBase extends ComponentBase {
    private int rotationSpeed;
    private int range;
    private CannonBase cannon;


    public TowerBase(int id, String name, int rotationSpeed, int range, CannonBase cannon) {
        super(id, name);
        this.rotationSpeed = rotationSpeed;
        this.range = range;
        this.cannon = cannon;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public CannonBase getCannon() {
        return cannon;
    }

    public void setCannon(CannonBase cannon) {
        this.cannon = cannon;
    }
}
