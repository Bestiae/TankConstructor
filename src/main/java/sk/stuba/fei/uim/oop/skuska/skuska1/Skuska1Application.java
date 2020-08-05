package sk.stuba.fei.uim.oop.skuska.skuska1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stuba.fei.uim.oop.skuska.skuska1.api.TankComponentAPI;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.TrackedChassis;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.CannonBase;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons.LargeCaliberCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.towers.TowerBase;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.towers.TowerLargeCannon;
import sk.stuba.fei.uim.oop.skuska.skuska1.enums.Enum;
import sk.stuba.fei.uim.oop.skuska.skuska1.tanks.HeavyTank;

@Controller
@RequestMapping("/")
@SpringBootApplication
public class Skuska1Application {

    static TankComponentAPI tankComponentAPI;

    public static void main(String[] args) {
        tankComponentAPI = new TankComponentAPI();
        TrackedChassis tc = new TrackedChassis(2, "IS-3M", 200,
                50, 90, 30);
        LargeCaliberCannon largeCaliberCannon = new LargeCaliberCannon(1, "122mm BL-9",
                122, 100, 50, 100);
        TowerLargeCannon towerBase = new TowerLargeCannon(3, "IS-3", 30, 100, largeCaliberCannon);

        HeavyTank heavyTank = new HeavyTank(4, "IS-3", Enum.Nationality.USA, 200000, tc, towerBase);
        HeavyTank heavyTank2 = new HeavyTank(5, "IS-5", Enum.Nationality.USA, 200000, tc, towerBase);

        tankComponentAPI.addComponent(tc);
        tankComponentAPI.addComponent(largeCaliberCannon);
        tankComponentAPI.addComponent(towerBase);
        tankComponentAPI.addTank(heavyTank);
        tankComponentAPI.addTank(heavyTank2);

        SpringApplication.run(Skuska1Application.class, args);
        System.out.println("Open in http://localhost:8080");
    }

    @GetMapping
    public String showAllTanks(Model model)
    {
        model.addAttribute("Tanks", tankComponentAPI.getAllTanks());
        return "tanks";
    }

    @GetMapping("/tanks/{id}")
    public String tankDetails(@PathVariable int id, Model model)
    {
        model.addAttribute("tank", tankComponentAPI.getTank(id));
        return "tank";
    }

    @GetMapping("/components")
    public String componentsDetails(Model model)
    {
        model.addAttribute("component", tankComponentAPI.getAllComponents());
        return "components";
    }

    @GetMapping("/components/{id}")
    public String componentDetails(@PathVariable int id, Model model)
    {
        model.addAttribute("component", tankComponentAPI.getComponent(id));
        return "component";
    }
}
