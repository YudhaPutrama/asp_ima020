import java.util.Scanner;

/**
 * Created by yudhaputrama on 12/07/17.
 */
public class Soal1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Cek kata palindrom : ");
        while (true){
            char text[] = in.nextLine().toCharArray();
            boolean palindrom = true;
            for (int i=0; i < text.length/2; i++){
                if (text[i]!=text[text.length-i-1]){
                    palindrom = false;
                    break;
                }
            }
            if (palindrom)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
