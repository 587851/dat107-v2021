package no.hvl.dat107.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "forelesning5a")
public class Ansatt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String fornavn;
    private String etternavn;
    
    @ManyToMany(mappedBy="ansatte")
    private List<Prosjekt> prosjekter;
    
	public void skrivUt(String innrykk) {
        System.out.printf("%sAnsatt nr %d: %s %s", innrykk, id, fornavn, etternavn);
    }
    
    public void skrivUtMedProsjekter() {
        System.out.println();
        skrivUt("");
        prosjekter.forEach(p -> p.skrivUt("\n   "));
    }

    public void leggTilProsjekt(Prosjekt p) {
        prosjekter.add(p);
    }

    public void fjernProsjekt(Prosjekt p) {
        prosjekter.remove(p);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public List<Prosjekt> getProsjekter() {
		return prosjekter;
	}

	public void setProsjekter(List<Prosjekt> prosjekter) {
		this.prosjekter = prosjekter;
	}
    
    

}
