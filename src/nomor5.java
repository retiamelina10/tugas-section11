import java.util.Scanner;
class nomor5 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;

        System.out.println("menentukan bilangan prima");
        System.out.print("Masukan Angka : ");
        bil=input.nextInt();
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bil+" adalah bilangan prima");
        }else {
            System.out.println(bil+" bukan bilangan prima");
        }
    }
}
