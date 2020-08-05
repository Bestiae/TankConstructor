package sk.stuba.fei.uim.oop.skuska.skuska1.tanks;

import sk.stuba.fei.uim.oop.skuska.skuska1.components.WheelChassis;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.LargeCaliberCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.towers.TowerSmallCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.enums.Enum;

public class LightTank extends TankBase{
    WheelChassis wheelChassis;
    TowerSmallCannon towerSmallCannon;

    public LightTank(int id, String name, Enum.Nationality nationality, int price, WheelChassis wheelChassis, TowerSmallCannon towerSmallCannon) {
        super(id, name, nationality, price);
        this.wheelChassis = wheelChassis;
        this.towerSmallCannon = towerSmallCannon;
    }

    public WheelChassis getWheelChassis() {
        return wheelChassis;
    }

    public void setWheelChassis(WheelChassis wheelChassis) {
        this.wheelChassis = wheelChassis;
    }

    public TowerSmallCannon getTowerSmallCannon() {
        return towerSmallCannon;
    }

    public void setTowerSmallCannon(TowerSmallCannon towerSmallCannon) {
        this.towerSmallCannon = towerSmallCannon;
    }
}
