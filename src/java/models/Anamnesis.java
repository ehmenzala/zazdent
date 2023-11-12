package models;

public class Anamnesis {
	private final int id;
	private final int antecedentsId;
	private final String motivoConuslta;
	private final String enfermedadActual;
	private final String tiempoEnfermedad;
	private final String sintomasPrincipales;
	private final String ultimaVisitaDentista;

	public Anamnesis(int id, int antecedentsId, String motivoConuslta, String enfermedadActual, String tiempoEnfermedad,
			String sintomasPrincipales, String ultimaVisitaDentista) {
		super();
		this.id = id;
		this.antecedentsId = antecedentsId;
		this.motivoConuslta = motivoConuslta;
		this.enfermedadActual = enfermedadActual;
		this.tiempoEnfermedad = tiempoEnfermedad;
		this.sintomasPrincipales = sintomasPrincipales;
		this.ultimaVisitaDentista = ultimaVisitaDentista;
	}

	public int getId() {
		return id;
	}

	public int getAntecedentsId() {
		return antecedentsId;
	}

	public String getMotivoConuslta() {
		return motivoConuslta;
	}

	public String getEnfermedadActual() {
		return enfermedadActual;
	}

	public String getTiempoEnfermedad() {
		return tiempoEnfermedad;
	}

	public String getSintomasPrincipales() {
		return sintomasPrincipales;
	}

	public String getUltimaVisitaDentista() {
		return ultimaVisitaDentista;
	}

}
