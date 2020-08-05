package sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LargeCaliberCannon extends CannonBase {
    private int explosionRadius;

    public LargeCaliberCannon(int id, String name, int caliber, int cadence, int dispersionAt100m, int explosionRadius) {
        super(id, name, caliber, cadence, dispersionAt100m);
        this.explosionRadius = explosionRadius;
    }

    public int getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(int explosionRadius) {
        this.explosionRadius = explosionRadius;
    }
}
