package desafios_Spread;
import java.util.Scanner;

public class DesafioTabuleiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int C = sc.nextInt();

        if ( L % 2 == 1  && C % 2 == 0){
            System.out.println("0");
        } else if ( L % 2 == 0  && C % 2 == 1){
            System.out.println("0");
        }else System.out.println("1");
        }
    }