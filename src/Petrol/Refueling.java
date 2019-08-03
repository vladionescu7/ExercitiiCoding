package Petrol;

import java.util.Scanner;

public class Refueling {

    double petrolPrice;
    double petrolAmount;
    double money;
    double sumaTotala;
    double sumaFinala;
    String tipCarburant;

    public Refueling() {
    }

    public Refueling(double petrolPrice, double petrolAmount, double money, double sumaTotala, String tipCarburant, double sumaFinala) {
        this.petrolPrice = petrolPrice;
        this.petrolAmount = petrolAmount;
        this.money = money;
        this.sumaTotala= sumaTotala;
        this.tipCarburant = tipCarburant;
        this.sumaFinala=sumaFinala;
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

    public double getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public double getSumaFinala() {
        return sumaFinala;
    }

    public void setSumaFinala(double sumaFinala) {
        this.sumaFinala = sumaFinala;
    }
}


