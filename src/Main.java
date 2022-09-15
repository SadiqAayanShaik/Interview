
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		Patient p1=new Patient("P1",24,"corona",12000);
		Patient p2=new Patient("P2",23,"corona",19000);
		Patient p3=new Patient("P3",34,"malariya",12000);
		Patient p4=new Patient("P4",24,"fever",12000);
		
		List<Patient> patients=Arrays.asList(p1,p2,p3,p4);
		
	//corona patients
     System.out.println("Corona Patients: ");		
	 patients.stream().filter(p->p.getDisease().equals("corona")).forEach(System.out::println);
	
	 //patient age<=24
	 System.out.print("Age");
	 patients.stream().filter(p->p.getAge()<=24).forEach(System.out::println);
	 
	 //average bill paid corona patient
	 
	 Double averageBillCorona =patients.stream().filter(p->p.getDisease().equals("corona"))
			 .collect(Collectors.averagingDouble(Patient::getBill));
	 
	 System.out.println("Average Bill paid by Corona Patients:"+averageBillCorona);
	}
	
	  
}
