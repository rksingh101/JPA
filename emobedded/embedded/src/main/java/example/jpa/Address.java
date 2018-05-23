package example.jpa;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class Address {
	private String line;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address( String line) {
		this.line = line;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	
}
