package sk.stuba.fei.uim.oop.skuska.skuska1.api;

import sk.stuba.fei.uim.oop.skuska.skuska1.components.ComponentBase;
import sk.stuba.fei.uim.oop.skuska.skuska1.tanks.TankBase;

import java.util.ArrayList;
import java.util.List;

public class TankComponentAPI implements ITankComponentAPI{
    List<TankBase> tanks;
    List<ComponentBase> components;

    public TankComponentAPI() {
        this.tanks = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    @Override
    public void addTank(TankBase tank) {
        //id add
        this.tanks.add(tank);
    }

    @Override
    public void addComponent(ComponentBase component) {
        // is add
        this.components.add(component);
    }

    @Override
    public List<TankBase> getAllTanks() {
        return this.tanks;
    }

    @Override
    public List<ComponentBase> getAllComponents() {
        return this.components;
    }

    @Override
    public TankBase getTank(long id) {
        for(TankBase t: tanks){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    @Override
    public ComponentBase getComponent(long id) {
        for(ComponentBase c: components){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
