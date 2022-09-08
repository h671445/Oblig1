package oblig1;

import java.util.Scanner;

public class oblig1oppg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hva er din brutto inntekt? ");
		int inntekt = sc.nextInt();
		double etterskatt;
		if (inntekt < 190349) {
			System.out.println("Du betaler ingen trinnskatt ettersom inntekten din er under grensen.");
		}
		if (inntekt > 190350 && inntekt < 267899) {
			System.out.println("Du betaler skatt på trinn 1, med en sats på 1,7%");
			etterskatt = inntekt*0.017;
			System.out.println("Du betaler kr " + etterskatt +  " i skatt");
		}
		if (inntekt > 267900 && inntekt < 643799) {
			System.out.println("Du betaler skatt på trinn 2, med sats på 4%");
			etterskatt = inntekt*0.04;
			System.out.println("Du betaler kr " + etterskatt +  " i skatt");
		}	
		if (inntekt > 643800 && inntekt < 969199) {
			System.out.println("Du betaler skatt på trinn 3, med en sats på 13,4%");
			etterskatt = inntekt*0.134;
			System.out.println("Du betaler kr " + etterskatt +  " i skatt");
		}
		if (inntekt > 969200 && inntekt < 1999999) {
			System.out.println("du betaler skatt på trinn 4, med en sats på 16,4%");
			etterskatt = inntekt*0.164;
			System.out.println("Du betaler kr " + etterskatt +  " i skatt");
		}
		if (inntekt > 1999999) {
			System.out.println("du betaler skatt på trinn 5, med en sats på 17,4%");
			etterskatt = inntekt*0.174;
			System.out.println("Du betaler kr " + etterskatt +  " i skatt");
		}

	}

}
