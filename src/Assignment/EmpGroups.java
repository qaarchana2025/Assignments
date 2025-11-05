package Assignment;

public class EmpGroups {

	public static void main(String[] args) {
		
		Employees e1=new Employees();
		
		String[] empnames=new String[3];
		int[] empids=new int[3];
		
		empnames[0]= e1.emp1name;
		empnames[1]=e1.emp2name;
		empnames[2]=e1.emp3name;
		
		empids[0]= e1.e1id;
		empids[1]= e1.e2id;
		empids[2]=e1.e3id;
		
				
		System.out.println("Employee Name: "+ e1.emp1name +", " +"Employee ID: "+e1.e1id);
		System.out.println("Employee Name: "+ e1.emp2name +", " +"Employee ID: "+e1.e2id);
		System.out.println("Employee Name: "+ e1.emp3name +", " +"Employee ID: "+e1.e3id);
		
		
		
		
	}

}
