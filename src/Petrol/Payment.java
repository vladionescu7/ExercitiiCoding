package Petrol;

public class Payment {

double sumaDePlata;
double rest;

    public Payment(double sumaDePlata, double rest) {
        this.sumaDePlata = sumaDePlata;
        this.rest = rest;
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
}
