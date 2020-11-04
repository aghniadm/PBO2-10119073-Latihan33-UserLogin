package pbo2.pkg10119073.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk melakukan user login
 * dengan object oriented
 *
 */

public class Login {
    private static String usName; 
    private static String passWord;
    
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        user.pengecekkanLogin(usName, passWord);
    }
    
}
