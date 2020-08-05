package sk.stuba.fei.uim.oop.skuska.skuska1.tanks;

import sk.stuba.fei.uim.oop.skuska.skuska1.components.TrackedChassis;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.LargeCaliberCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.enums.Enum;

public class Artillery extends TankBase{
    TrackedChassis trackedChassis;
    LargeCaliberCannon largeCaliberCannon;

    public Artillery(int id, String name, Enum.Nationality nationality, int price, TrackedChassis trackedChassis, LargeCaliberCannon largeCaliberCannon) {
        super(id, name, nationality, price);
        this.trackedChassis = trackedChassis;
        this.largeCaliberCannon = largeCaliberCannon;
    }

    public TrackedChassis getTrackedChassis() {
        return trackedChassis;
    }

    public void setTrackedChassis(TrackedChassis trackedChassis) {
        this.trackedChassis = trackedChassis;
    }

    public LargeCaliberCannon getLargeCaliberCannon() {
        return largeCaliberCannon;
    }

    public void setLargeCaliberCannon(LargeCaliberCannon largeCaliberCannon) {
        this.largeCaliberCannon = largeCaliberCannon;
    }
}
