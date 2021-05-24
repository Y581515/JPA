package no.hvl.dat107;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ansatt", schema = "forelesning4")
public class Ansatt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ansNr;
    private String fornavn;
    private String etternavn;
    
    @OneToOne
    @JoinColumn(name = "romNr", referencedColumnName = "romNr")
    private Rom kontor;

    @Override
    public String toString() {
        String romString = kontor != null ? ", kontor=" + kontor.getRomNr() + ", Kvm="+kontor.getKvm() : ", har ikke rom";
        
        return "Ansatt [ansNr=" + ansNr + ", fornavn=" + fornavn 
                + ", etternavn=" + etternavn + romString + "]";
    }

    public int getAnsNr() {
        return ansNr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

	public Rom getKontor() {
		return kontor;
	}

	public void setKontor(Rom kontor) {
		this.kontor = kontor;
	}
    
    
    
    
    
}


