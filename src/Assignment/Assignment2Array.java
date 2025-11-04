package Assignment;

public class Assignment2Array {

	public static void main(String[] args) {
		
		
		String[][][] studentdetail= new String[5][6][6];
		
		studentdetail[1][3][3]= "Basic Electronics";
		studentdetail[1][4][4]="Engineering Physics";
		
		studentdetail[3][3][2]="Fail(19)";
		studentdetail[3][3][5]="Pass(87)";
		
		System.out.println("Semester2 subject4 name is: "+studentdetail[1][3][3]);
		System.out.println("Semester2 subject5 name is: "+studentdetail[1][4][4]);
		
		
		System.out.println("Status/Marks of semester4 subject3 is: "+studentdetail[3][3][2]);
		System.out.println("Status/Marks of semester4 subject6 is: "+studentdetail[3][3][5]);
		
	}

}
