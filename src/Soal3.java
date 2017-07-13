import java.util.Scanner;

/**
 * Created by yudhaputrama on 12/07/17.
 */
public class Soal3 {
    static int data[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input jumlah data : ");
        int n = in.nextInt();
        data = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("Input nilai ke-%d : ", i+1);
            data[i] = in.nextInt();
        }
        quicksort(0, data.length-1);
        System.out.println("Hasil terurut dengan quicksort");
        for (int i=0; i<n; i++){
            System.out.printf("%d ", data[i]);
        }
    }

    static void quicksort(int low, int high){
        int i = low, j = high;
        int pivot = data[low+(high-low)/2];

        while (i<=j){
            while (data[i]<pivot) i++;
            while (data[j]>pivot) j--;
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }
        if (low<j){
            quicksort(low, j);
        }
        if (i<high){
            quicksort(i, high);
        }
    }

    static void swap(int left, int right){
        int tmp = data[left];
        data[left] = data[right];
        data[right] = tmp;
    }
}
