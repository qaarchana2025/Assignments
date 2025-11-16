package Assignment;

public class Assignment9_ArraysandLoop {

	public static void main(String[] args) {
		
		int[] number=new int[7];
		number[0]=12;
		number[1]=34;
		number[2]=11;
		number[3]=36;
		number[4]=87;
		number[5]=98;
		number[6]=93;
		
		for(int i=0; i<number.length; i++)
		{ 
			for(int j=i+1; j<number.length;j++)
			{
				if(number[i]< number[j])
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
			
		System.out.println("second largest number: "+ number[1]);
		System.out.println("Third largest number: "+ number[2]);
		}
		
		
	}


