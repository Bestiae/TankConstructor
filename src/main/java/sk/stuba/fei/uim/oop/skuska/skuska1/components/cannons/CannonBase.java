package sk.stuba.fei.uim.oop.skuska.skuska1.components.cannons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.stuba.fei.uim.oop.skuska.skuska1.components.ComponentBase;

public class CannonBase extends ComponentBase {
    private int caliber;
    private int cadence; //fire rate
    private int dispersionAt100m; //рассеевание

    public CannonBase(int id, String name, int caliber, int cadence, int dispersionAt100m) {
        super(id, name);
        this.caliber = caliber;
        this.cadence = cadence;
        this.dispersionAt100m = dispersionAt100m;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getDispersionAt100m() {
        return dispersionAt100m;
    }

    public void setDispersionAt100m(int dispersionAt100m) {
        this.dispersionAt100m = dispersionAt100m;
    }
}
