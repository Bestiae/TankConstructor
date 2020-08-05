package sk.stuba.fei.uim.oop.skuska.skuska1.tanks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.stuba.fei.uim.oop.skuska.skuska1.enums.Enum;


public class TankBase {
    private int id;
    private String name;
    private Enum.Nationality nationality;
    private int price;

    public TankBase(int id, String name, Enum.Nationality nationality, int price) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum.Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Enum.Nationality nationality) {
        this.nationality = nationality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo(){
        return getName() + " " + getNationality() + " " + getPrice();
    }
}
