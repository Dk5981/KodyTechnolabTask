package com.kodytechnolab;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j =0;
		
		for(int i = 1; i <= 100; i++)
		{
			for(j = 2; j <= i; j++)
			{
				if(i % j == 0)
				{
					break;
				}
			}
			if(i == j)
			{
				System.out.print(i + " ");
			}
		}
	}

}
