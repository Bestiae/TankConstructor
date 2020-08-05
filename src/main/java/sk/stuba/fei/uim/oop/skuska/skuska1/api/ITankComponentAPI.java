package sk.stuba.fei.uim.oop.skuska.skuska1.api;

import org.springframework.stereotype.Service;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.ComponentBase;
import sk.stuba.fei.uim.oop.skuska.skuska1.tanks.TankBase;

import java.util.List;

@Service
public interface ITankComponentAPI {
    void addTank(TankBase tank);
    void addComponent(ComponentBase component);
    List<TankBase> getAllTanks();
    List<ComponentBase> getAllComponents();
    TankBase getTank(long id);
    ComponentBase getComponent(long id);

}
