import java.util.Scanner;
public class nomor6 {
    public static void main(String[] args){
        new Palindrom().palindrome("katak");
        new Palindrom().palindrome("kupu-kupu");
    }

    private static class Palindrom {
        private void palindrome(String teks){
            String temp = "";

            for(int i=teks.length();i>0;i--){
                String test1 = teks.substring(i-1, i);
                temp += test1;
            }

            if(teks.equals(temp)){
                System.out.println("= "+teks+" adalah Palindrome");
            }else{
                System.out.println("= "+teks+" bukan Palindrome");
            }
        }
    }
}


