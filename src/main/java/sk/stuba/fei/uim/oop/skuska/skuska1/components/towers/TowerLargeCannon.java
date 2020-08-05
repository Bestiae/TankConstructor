package sk.stuba.fei.uim.oop.skuska.skuska1.components.towers;

import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.CannonBase;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.LargeCaliberCannon;

public class TowerLargeCannon extends TowerBase{
    public TowerLargeCannon(int id, String name, int rotationSpeed, int range, LargeCaliberCannon cannon) {
        super(id, name, rotationSpeed, range, cannon);
    }
}
