package Petrol;

import java.util.Scanner;

public class Refueling {

    double petrolPrice;
    double petrolAmount;
    double money;
    String tipCarburant;

    public Refueling() {
    }

    public Refueling(double petrolPrice, double petrolAmount, double money, String tipCarburant) {
        this.petrolPrice = petrolPrice;
        this.petrolAmount = petrolAmount;
        this.money = money;
        this.tipCarburant = tipCarburant;
    }

    public double getPetrolPrice() {
        return petrolPrice;
    }

    public void setPetrolPrice(double petrolPrice) {
        this.petrolPrice = petrolPrice;
    }

    public double getPetrolAmount() {
        return petrolAmount;
    }

    public void setPetrolAmount(double petrolAmount) {
        this.petrolAmount = petrolAmount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getTipCarburant() {
        return tipCarburant;
    }

    public void setTipCarburant(String tipCarburant) {
        this.tipCarburant = tipCarburant;
    }
}


