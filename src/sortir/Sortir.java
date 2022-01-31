package sortir;

import java.util.Scanner;

public class Sortir {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int urut, baris, kolom, temp,data, masuk;
        int[] bil;
        System.out.println("           Bubble Sort Project           ");
        System.out.println("-----------------------------------------");
        
        do{
            System.out.print("Masukkan Jumlah Bilangan (Max 100) = ");
            masuk = sc.nextInt();
        }
        while(masuk <= 0 || masuk > 100);
        System.out.println("");
        
        
        bil = new int[masuk];
        for (data = 0; data < bil.length; data++)
        {
            System.out.print("Bilangan ke " + data + " = ");
            bil[data] = sc.nextInt();
        }
        
        for (baris = 0; baris < bil.length -1; baris++) 
        {
            for (kolom = 0; kolom < bil.length -1; kolom++)
            {
                if(bil[kolom] > bil[kolom + 1])
                {
                    temp = bil[kolom];
                    bil[kolom] = bil[kolom + 1];
                    bil[kolom + 1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("Bilangan Terurut = ");
        for (urut = 0; urut < bil.length; urut++) 
        {
            System.out.print(bil[urut] + " ");
        }
        System.out.println("");
        
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("           205314020__Program            ");
        System.out.println("-----------------------------------------");
    }
    
}