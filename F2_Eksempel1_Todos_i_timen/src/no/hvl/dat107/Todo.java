package no.hvl.dat107;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "forelesning2")
public class Todo {
	
	@Id 
	private int id;
	private String tekst;
	
    public Todo() {}
    
	public Todo(int id, String tekst) {
		this.id = id;
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", tekst=" + tekst + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	
}
