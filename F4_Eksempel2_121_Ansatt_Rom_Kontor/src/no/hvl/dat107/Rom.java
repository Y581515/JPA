package no.hvl.dat107;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rom", schema = "forelesning4")
public class Rom {

	@Id
	private String romNr;
	private double kvm;

	@OneToOne(mappedBy = "kontor")
	private Ansatt ansatt;

	public Rom() {
	}

	public Rom(String romNr, double kvm) {
		this.romNr = romNr;
		this.kvm = kvm;
	}

	public void leggAnsattTilRom(Ansatt ansatt) {
		this.ansatt = ansatt;
		ansatt.setKontor(this);
	}

	public void fjernAnsattFraEtRom(Ansatt ansatt) {
		this.ansatt = null;;
		ansatt.setKontor(null);
	}
	
	@Override
	public String toString() {
		String ansattString = ansatt != null ? ", kontoret til " + ansatt.getFornavn() + " " + ansatt.getEtternavn()
				: ", Romet er ledig";

		return "Rom [romNr=" + romNr + ", kvm=" + kvm + ansattString + "]";
	}

	public String getRomNr() {
		return romNr;
	}

	public double getKvm() {
		return kvm;
	}



}
