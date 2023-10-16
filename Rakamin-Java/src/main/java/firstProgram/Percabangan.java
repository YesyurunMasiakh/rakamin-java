package firstProgram;
import java.util.Scanner;


public class Percabangan {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt ("Enter password: ");
        String validPassword = "password";

        if(password.equals(validPassword)){
            System.out.println("Selamat datang bos");
        }
        else{
            System.out.println("Password salah, coba lagi");
        }
        System.out.println("Terimakasih telah menggunakan");
    }

    public static String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
