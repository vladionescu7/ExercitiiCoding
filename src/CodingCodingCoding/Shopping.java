package CodingCodingCoding;
import java.util.*;
public class Shopping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String produs;
        int pretLapte= 8;
        int pretVin= 28;

        System.out.println("Ce doriti sa cumparati de la noi astazi? (lapte saun vin)");
        produs= input.nextLine();

        switch (produs){
            case "lapte":
                System.out.println("Pretul laptelui este "+pretLapte+" lei.");
                break;
            case "vin":
                System.out.println("Aveti peste 18 ani? (Va rugam introduceti varsta dvs)");
                int varsta=input.nextInt();
                if(varsta>18) {
                    System.out.println("Pretul vinului este " + pretVin+" lei.");
                } else System.out.println("Nu vindem alcool minorilor!"); System.exit(0);
                break;
            default:
                System.out.println("N-avem, aduce maine");
        }
        System.out.print(" Va rugam introduceti suma ceruta.");
        int cash= input.nextInt();
        if ((cash==pretLapte)||(cash==pretVin)){
            System.out.println("Uitati si bonul, va mai asteptam!");
        } else System.out.println("Imi aduci tu data viitoare restul de bani");
    }
}
