package Petrol;

public class Payment {

double sumaDePlata;
double rest;
double restanta;


    public Payment(){}

    public Payment(double sumaDePlata, double rest, double restanta) {
        this.sumaDePlata = sumaDePlata;
        this.rest = rest;
        this.restanta= restanta;

    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }

    public void setSumaDePlata(double sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    public double getRestanta() {
        return restanta;
    }

    public void setRestanta(double restanta) {
        this.restanta = restanta;
    }
}
