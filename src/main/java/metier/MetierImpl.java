package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Instrument> getInstrumentsParMotCle(String mc) {
		List<Instrument> instrs = new ArrayList<Instrument>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from INSTRUMENTS where NOM_INSTRUMENT LIKE ?");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Instrument i = new Instrument();
				i.setIdInstrument(rs.getLong("ID_INSTRUMENT"));
				i.setNomInstrument(rs.getString("NOM_INSTRUMENT"));
				i.setPrix(rs.getDouble("PRIX"));
				instrs.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return instrs;
	}

	@Override
	public void addInstrument(Instrument i) {
// TODO Auto-generated method stub
	}
}