package sk.stuba.fei.uim.oop.skuska.skuska1.conrollers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.TrackedChassis;

//@Controller
//@RequestMapping("/")
public class MainController {

    TrackedChassis tc;

    @GetMapping
    public String showAllUsers(Model model)
    {
        tc = new TrackedChassis(2, "TankTC", 200,
                50, 90, 30);
        model.addAttribute("Tank", tc);
        return "tanks";
    }
}
