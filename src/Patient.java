
public class Patient {
	
	private String pname;
	private int age;
	private String disease;
	private int bill;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public Patient(String pname, int age, String disease, int bill) {
		super();
		this.pname = pname;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
	}
	public Patient() {
		 
	}
	@Override
	public String toString() {
		return "Patient [pname=" + pname + ", age=" + age + ", disease=" + disease + ", bill=" + bill + "]";
	}
	
	
	

}
