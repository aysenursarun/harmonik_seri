package harmonik_seri;

import java.util.Scanner;

public class harmonik_seri {

	public static void main(String[] args) {

		int n;
        double toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("n sayisini giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            toplam += (1.0/i);

        }
        System.out.print(toplam);
	}

}
