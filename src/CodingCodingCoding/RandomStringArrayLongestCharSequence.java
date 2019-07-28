package CodingCodingCoding;
import java.util.Random;
public class RandomStringArrayLongestCharSequence {
    public static void main(String[] args) {
        //Write an application that will find the longest char sequence within an array of type String.
        // Test it in the same way as you have done in the previous exercise.
        // How will you generate random char sequences?
        String[] arr= new String[5];
        Random alandala= new Random();
        int max=Integer.MIN_VALUE;

        for(int i=0; i<5; i++){
            int lungimeAleatoare=alandala.nextInt(10);
            arr[i]= cuvantAleator(lungimeAleatoare);
            System.out.print(arr[i]+" <|> ");
            if(arr[i].length()>max){
                max=arr[i].length();
            }
        }

        System.out.println("Max length: "+ max);
    }
    public static String cuvantAleator(int v){
        Random alandala2= new Random();
        char[] c=new char[v];
        for(int i=0;i<c.length;i++){
            c[i]=(char) (alandala2.nextInt(25)+65);
        }
        String concluzie= new String(c);
        return concluzie;
    }
}
