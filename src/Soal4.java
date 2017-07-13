import java.util.Scanner;

/**
 * Created by yudhaputrama on 12/07/17.
 */
public class Soal4 {
    static int data[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Input jumlah nilai dalam array (maks 10) : ");
        int n = in.nextInt();
        if (n>10){
            System.out.println("melebihi batas");
            return;
        }
        data = new int[n];
        for (int i=0; i<n; i++){
            data[i] = in.nextInt();
        }

        int count = 0;
        int baru[] = new int[n];
        for (int i=0; i<n; i++){
            boolean duplicated = false;
            for (int j=i+1; j<n;j++){
                if(data[i]==data[j]){
                    duplicated = true;
                    break;
                }
            }
            if(!duplicated){
                baru[count] = data[i];
                count++;
            }
        }
        for (int i=0; i<count; i++){
            System.out.print(baru[i]+" ");
        }
        System.out.println();
    }


}
