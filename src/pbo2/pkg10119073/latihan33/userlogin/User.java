
package pbo2.pkg10119073.latihan33.userlogin;

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

public class User {
    private final String username = "AghniaD", password = "eak123";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return (parUserName.equals(username)) && (parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName){
        parUserName = parUserName.toUpperCase();
        if(status){ 
            System.out.println("\n*****HALLO " + parUserName + ("******\nSelamat Datang di Aplikasi ini"));
        }
        else {
            System.out.println("\nOops, Username atau Password Anda Salah");
        }
    }
    public void pengecekkanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}