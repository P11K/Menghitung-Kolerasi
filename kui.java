
// import java.sql.Time;
import java.util.Scanner;
// import java.util.Timer;

public class kui {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Mengitung Korelasi");
        Scanner input = new Scanner(System.in);
        // Mencari X
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        int[] data = new int[jumlahData]; // Membuat array untuk menyimpan data
        System.out.println("Masukkan Data X");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("Data yang telah diinputkan:");
        int totaldat = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + data[i]);
            totaldat += data[i];
        }
        // int rotox = (int) totaldat / jumlahData;
        System.out.println("");
        int kasil = 0;
        int hasil;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Akar Pangkat Dari data ke-" + (i + 1) + ": " + (hasil = data[i] * data[i]));
            kasil += hasil;
        }
        // int rotoxx = (int) kasil / jumlahData;

        System.out.println("");
        // Mencari Y
        System.out.println("Masukkan Data Y");
        int[] datay = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan Data ke-" + (i + 1) + ": ");
            datay[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("Data Yang Telah Di Inputkan");
        int totaly = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + datay[i]);
            totaly += datay[i];
        }
        // int rotoy = (int) totaly / jumlahData;

        System.out.println("");
        int kasily = 0;
        int hasily;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Akar Pangkat Dari data ke-" + (i + 1) + ": " + (hasily = datay[i] * datay[i]));
            kasily += hasily;
        }
        // int rotoyy = (int) kasily / jumlahData;

        System.out.println("");
        int kon = 0;
        int hasi;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Total XY ke-" + (i + 1) + ": " + (hasi = data[i] * datay[i]));
            kon += hasi;
        }
        // int rotoxy = (int) kon / jumlahData;

        // System.out.println(kon);
        Thread.sleep(1500);
        System.out.println("");
        System.out.println("Total X : " + totaldat + " ||" + " Total Y : " + totaly + " ||" + " Total X Kuadrat : "
                + kasil + " ||" + " Total Y Kuadrat : " + kasily + " ||" + " Total XY : " + kon);
        System.out.println("");
        Thread.sleep(1500);
        //                                      PROSES PERHITUNGAN
        System.out.println("Proses Penghitungan");
        // MENGHITUNG A
        // int toty,totxk,xy;
        double hitung_a = totaly * kasil - totaldat * kon;
        // System.out.println(hitung_a);
        double bagi = jumlahData * kasil - totaldat * totaldat;
        // System.out.println(bagi);
        double wes = hitung_a / bagi;
        // System.out.println(bagi);
        System.out.println("TOTAL A : " + wes);
        Thread.sleep(1500);
        // MENGHITUNG B
        double hitung_b = jumlahData * kon - totaldat * totaly;
        double bagib = jumlahData * kasil - totaldat * totaldat;
        double blg = hitung_b / bagib;
        System.out.println("TOTAL B : " + blg);
        System.out.println("");
        Thread.sleep(1500);
        int r = jumlahData * kon - totaldat * totaly;
        float rr = ((jumlahData * kasil - totaldat * totaldat)) * ((jumlahData * kasily - totaly * totaly));
        double f = Math.sqrt(rr);
        double rrr = r / f;
        // Perintah Untuk Format Agar 3 Digit 
        String pormat = String.format("%.3f",rrr);
        System.out.println("Uji Korelasi : " + pormat);
    }
}
