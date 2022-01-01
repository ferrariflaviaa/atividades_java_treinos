package entities_vetor;

public class vetor {
	
	private String name;
	private String email;
	private double row;
	
	public vetor(String name, String email, double row) {
		this.name = name;
		this.email = email;
		this.row = row;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getRow() {
		return row;
	}
	public void setRow(double row) {
		this.row = row;
	}
	public String toString() {
		return row + ": " + name + " "+ email;
		
	}
	
	
}
