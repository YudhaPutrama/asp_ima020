import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yudhaputrama on 12/07/17.
 */
public class Soal2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Nilai> daftar = new ArrayList<>();

        while (true){
            System.out.printf("Input nomer \t : ");
            int nomer = Integer.parseInt(in.nextLine());
            if (nomer==9999) break;

            System.out.printf("Input nama \t\t : ");
            String nama = in.nextLine();

            System.out.printf("Input nilai \t : ");
            int nilai = Integer.parseInt(in.nextLine());

            System.out.println();

            Nilai temp = new Nilai();
            temp.nomor = nomer;
            temp.nama = nama;
            temp.nilai = nilai;
            daftar.add(temp);
        }
        int tmaks = -1;
        int juara = 0;
        while (juara<3 && !daftar.isEmpty()){
            int maks = daftar.get(0).nilai;
            int index = 0;
            for (int i = 1; i<daftar.size(); i++){
                if (daftar.get(i).nilai>maks){
                    index = i;
                    maks = daftar.get(i).nilai;
                }
            }
            if (tmaks!=maks){
                juara++;
                System.out.println("Juara "+juara);
                tmaks = maks;
            }
            System.out.printf("%d - %s \n",
                    daftar.get(index).nomor,
                    daftar.get(index).nama);
            daftar.remove(index);
//            if (tmaks!=maks) {
//
//                System.out.println();
//            }
        }
    }
    static class Nilai {
        int nomor;
        String nama;
        int nilai;


    }
}
