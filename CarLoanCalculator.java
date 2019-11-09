package stia1113;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarLoanCalculator {

	public static void main(String[]args) {
		
		float A,B,D,MR,p,i;
		int C;

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
	
		do {
			System.out.println("Car Price (RM): ");
			A = input.nextFloat();
			if (A<30000) {
				System.out.println("Please enter Car Price above RM30,000.");				
			}
		}while(A<30000);
		
		
		do {
			System.out.println("Down Payment (RM): ");
			B = input.nextFloat();
			if (B<0) {
				System.out.println("Please enter Down Payment at least 0.");				
			}
		}while(B<0);
		
		
		do {
			System.out.println("Loan Period (Years): ");
			C = input.nextInt();
			if (C<5||C>9) {
				System.out.println("Please enter Loan Period between 5-9 years.");				
			}
		}while(C<5||C>9);
		
		
		do {
			System.out.println("Interest Rate (%): ");
			D = input.nextFloat();
			if (D<3||D>7) {
				System.out.println("Please enter Interest Rate  between 3-7%.");				
			}
		}while(D<3||D>7);

		
		MR = ((A-B)/C+((D/100)*(A-B)))/12;
		
		System.out.printf("%55s\n","Monthly Repayment: RM "+df.format(MR));
		System.out.printf("\n");
		System.out.printf("%19s%15s%17s%17s\n","YEARS", "PRINCIPAL", "INTEREST","BALANCE");
		
		p = MR*12;
			 
		String p1 = df.format(p*1);			
		String p2 = df.format(p*2);						
		String p3 = df.format(p*3);			
		String p4 = df.format(p*4);		
		String p5 = df.format(p*5);		
		String p6 = df.format(p*6);		
		String p7 = df.format(p*7);		
		String p8 = df.format(p*8);		
		String p9 = df.format(p*9);				 
				
		i = (D/100)*(A-B);
				 
		String i1 = df.format(i*1);			
		String i2 = df.format(i*2);				
		String i3 = df.format(i*3);			
		String i4 = df.format(i*4);			
		String i5 = df.format(i*5);		
		String i6 = df.format(i*6);		
		String i7 = df.format(i*7);		
		String i8 = df.format(i*8);		
		String i9 = df.format(i*9);			
			 
		String b1 = df.format(p*(C-1));			
		String b2 = df.format(p*(C-2));			
		String b3 = df.format(p*(C-3));			
		String b4 = df.format(p*(C-4));			
		String b5 = df.format(p*(C-5));		
		String b6 = df.format(p*(C-6));		
		String b7 = df.format(p*(C-7));		
		String b8 = df.format(p*(C-8));		
		String b9 = df.format(p*(C-9));

		String arr[][] = {
				{"1st",p1,i1,b1},
				{"2nd",p2,i2,b2},
				{"3rd",p3,i3,b3},
				{"4th",p4,i4,b4},
				{"5th",p5,i5,b5},
				{"6th",p6,i6,b6},
				{"7th",p7,i7,b7},
				{"8th",p8,i8,b8},
				{"9th",p9,i9,b9}
				};				
					
		
		for (int row=0;row<C;row++){		
			for (int col=0;col<arr[0].length;col++){
					System.out.printf("%17s",arr[row][col]);
					
			}System.out.printf("\n");
								
			}input.close();	
		}
}
