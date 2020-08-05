package sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class SmallCaliberCannon extends CannonBase {
    private int numberOfBulletsInTheMagazine;

    public SmallCaliberCannon(int id, String name, int caliber, int cadence, int dispersionAt100m, int numberOfBulletsInTheMagazine) {
        super(id, name, caliber, cadence, dispersionAt100m);
        this.numberOfBulletsInTheMagazine = numberOfBulletsInTheMagazine;
    }

    public int getNumberOfBulletsInTheMagazine() {
        return numberOfBulletsInTheMagazine;
    }

    public void setNumberOfBulletsInTheMagazine(int numberOfBulletsInTheMagazine) {
        this.numberOfBulletsInTheMagazine = numberOfBulletsInTheMagazine;
    }
}
