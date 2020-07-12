package fudbalskiKlub;

public class Osoba implements IOsoba {
	
	private String ime;
	private String prezime;
	private String jmbg;
	private String adresa;
	
	public Osoba(String ime, String prezime, String jmbg, String adresa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.adresa = adresa;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + ", adresa=" + adresa + "]";
	}

	@Override
	public boolean validacijaJmbg() {
		if(jmbg.length()==13) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean validacijaAdrese() {
		String[] nizReci = adresa.split(" ");
		try {
			Integer.parseInt(nizReci[nizReci.length - 1]);
			return true;
		} catch (Exception e){
			return false;
		}
	}
	

}
