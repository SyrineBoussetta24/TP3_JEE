package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Instrument> getInstrumentsParMotCle(String mc);

	public void addInstrument(Instrument i);
}
