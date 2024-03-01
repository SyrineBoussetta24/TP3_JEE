package test;

import java.util.List;

import metier.Instrument;
import metier.MetierImpl;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		List<Instrument> instrs = metier.getInstrumentsParMotCle("luth");
		for (Instrument i : instrs)
			System.out.println(i.getNomInstrument());
	}
}
