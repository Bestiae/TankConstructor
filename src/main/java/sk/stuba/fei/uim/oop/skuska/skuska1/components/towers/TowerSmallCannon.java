package sk.stuba.fei.uim.oop.skuska.skuska1.components.towers;

import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.LargeCaliberCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.SmallCaliberCannon;

public class TowerSmallCannon extends TowerBase{
    public TowerSmallCannon(int id, String name, int rotationSpeed, int range, SmallCaliberCannon cannon) {
        super(id, name, rotationSpeed, range, cannon);
    }
}
