import java.util.Scanner;

public class MeToCaesar {
    //Caesar-Decyrption
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesaji daxil edin -> ");
        String str = sc.nextLine();
        System.out.print("Shift daxil edin -> ");
        int shift = sc.nextInt();
        String str2 = "";

        if (str.isEmpty()) {
            System.out.println("Bos daxil etdiniz!");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char chr = 0;
            if (ch >= 'A' && ch <= 'Z') {
                chr = (char) ((ch-'A'-shift + 26)%26+'A');
            } else if (ch >= 'a' && ch <= 'z') {
                chr = (char) ((ch-'a'-shift+26 )%26+'a');
            }else {
                chr = ch;
            }
            str2 += chr;
        }
        System.out.println("Original-> " + str);
        System.out.println("Encyrption-> " + str2);
    }
}
