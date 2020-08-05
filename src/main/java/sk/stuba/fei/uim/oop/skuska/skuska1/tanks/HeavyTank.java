package sk.stuba.fei.uim.oop.skuska.skuska1.tanks;

import sk.stuba.fei.uim.oop.skuska.skuska1.components.TrackedChassis;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.LargeCaliberCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.towers.TowerLargeCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.enums.Enum;

public class HeavyTank extends TankBase{
    TrackedChassis trackedChassis;
    TowerLargeCannon towerLargeCannon;

    public HeavyTank(int id, String name, Enum.Nationality nationality, int price, TrackedChassis trackedChassis, TowerLargeCannon towerLargeCannon) {
        super(id, name, nationality, price);
        this.trackedChassis = trackedChassis;
        this.towerLargeCannon = towerLargeCannon;
    }

    public TrackedChassis getTrackedChassis() {
        return trackedChassis;
    }

    public void setTrackedChassis(TrackedChassis trackedChassis) {
        this.trackedChassis = trackedChassis;
    }

    public TowerLargeCannon getTowerLargeCannon() {
        return towerLargeCannon;
    }

    public void setTowerLargeCannon(TowerLargeCannon towerLargeCannon) {
        this.towerLargeCannon = towerLargeCannon;
    }

}
