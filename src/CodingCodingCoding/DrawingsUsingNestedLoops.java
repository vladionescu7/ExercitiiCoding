package CodingCodingCoding;

public class DrawingsUsingNestedLoops {
    public static void main(String[] args) {
        //triunghi
        for (int a = 0; a <= 5; a++) {

            System.out.println();
            for (int b = a; b <= 5; b++) {


                System.out.print(" * ");
            }
        }
        System.out.println();
        System.out.println("=====================");
        //patrat

        for (int a = 4; a > 0; a--) {
            System.out.println();
            for (int b = 4; b > 0; b--) {


                System.out.print(" * ");
            }
        }
        System.out.println();
        System.out.println("=====================");
        //rectangle with diagonals


        for (int linie = 8; linie >= 0; linie--) {
            System.out.println();
            for (int coloana = 8; coloana >= 0; coloana--) {
                if (linie == 0 || linie == 8 || coloana == 0 || coloana == 8 || linie == coloana || linie + coloana == 8) {
                    System.out.print("*");
                } else System.out.print(" ");

            }

        }
        System.out.println();
        System.out.println("=====================");

        //BRADET


        for (int linie = 0; linie <= 9; linie++) {
            System.out.println();
            for (int coloana = 0; coloana <= 9; coloana++) {
                if ((linie == 0 && coloana == 5)||
                        (linie==1&&coloana==(4))||(linie==1&&coloana==(6))||
                        (linie==2&&coloana==3)||(linie==2&&coloana==(7))||
                        (linie==3&&coloana==(2))||(linie==3&&coloana==(8))||
                        (linie==4&&coloana==(1))||(linie==4&&coloana==(9))||
                        (linie==5&&coloana==4)||(linie==5&&coloana==(6))||
                        (linie==6&&coloana==3)||(linie==6&&coloana==(7))||
                        (linie==7&&coloana==(2))||(linie==7&&coloana==(8))||
                        (linie==8&&coloana==1)||(linie==8&&coloana==(9))||
                        (linie==9&&coloana==5)) {
                    System.out.print("^");
                } else System.out.print(" ");



                System.out.println();
                System.out.println("=====================");








            }
        }
    }
}