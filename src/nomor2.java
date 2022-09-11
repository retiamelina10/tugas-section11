import java.util.Scanner;

class Nomor2{
    public static void main(String[] args) {
        // input
        Scanner nilai = new Scanner(System.in);
        System.out.println("Konversi Nilai Ke Huruf Mahasiswa");
        System.out.println("Masukkan Sebuah Nilai = ");
        int a = nilai.nextInt();
        if (a>=80&&a<=100){
            System.out.println("Nilai Anda A");
        }
        else if (a>=65&&a<=79){
            System.out.println("Nilai Anda B+");
        }
        else if (a>=50&&a<=64){
            System.out.println("Nilai Anda B");
        }
        else if (a>=35&&a<=49){
            System.out.println("Nilai Anda C");
        }
        else if (a>=0&&a<=34){
            System.out.println("Nilai Anda D");
        }
        else if (a<0&&a>100){
            System.out.println("Nilai Anda Invalid");
        }
    }
}



