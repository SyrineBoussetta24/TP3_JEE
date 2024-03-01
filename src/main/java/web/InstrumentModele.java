package web;

import java.util.ArrayList;
import java.util.List;
import metier.Instrument;

public class InstrumentModele {
	private String motCle;
	List<Instrument> Instruments = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Instrument> getInstruments() {
		return Instruments;
	}

	public void setInstruments(List<Instrument> Instruments) {
		this.Instruments = Instruments;
	}
}