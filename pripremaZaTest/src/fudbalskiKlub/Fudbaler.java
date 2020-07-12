package fudbalskiKlub;

public class Fudbaler extends Osoba{

	private double nedeljnaPlata;
	private int brojOdigranihSezona;
	private String sponzor;
	private boolean rezerva;
	private double godisnjaZarada;
	private int brojGolovaIAsistencija;
	private String pozicija;
	
	public Fudbaler(String ime, String prezime, String jmbg, String adresa, int brojOdigranihSezona, String sponzor,
			boolean rezerva, double nedeljnaPlata, int brojGolovaIAsistencija, String pozicija) {
		super(ime, prezime, jmbg, adresa);
		if(brojOdigranihSezona > 0) {
			this.brojOdigranihSezona = brojOdigranihSezona;
		} else {
			System.out.println("Pogresna unos za sezone, automatski je stavljeno na 1");
			this.brojOdigranihSezona = 1;
		}
		
		this.sponzor = sponzor;
		this.rezerva = rezerva;
		this.nedeljnaPlata = nedeljnaPlata; 
		this.godisnjaZarada = nedeljnaPlata * 52;
		this.brojGolovaIAsistencija = brojGolovaIAsistencija;
		this.pozicija = pozicija;
	}
	
	public int getBrojOdigranihSezona() {
		return brojOdigranihSezona;
	}

	public void setBrojOdigranihSezona(int brojOdigranihSezona) {
		this.brojOdigranihSezona = brojOdigranihSezona;
	}

	public String getSponzor() {
		return sponzor;
	}

	public void setSponzor(String sponzor) {
		this.sponzor = sponzor;
	}

	public boolean isRezerva() {
		return rezerva;
	}

	public void setRezerva(boolean rezerva) {
		this.rezerva = rezerva;
	}

	public double getNedeljnaPlata() {
		return nedeljnaPlata;
	}

	public void setNedeljnaPlata(double nedeljnaPlata) {
		this.nedeljnaPlata = nedeljnaPlata;
	}
	
	public double getGodisnjaZarada() {
		return godisnjaZarada;
	}

	public void setGodisnjaZarada(double nedeljnaPlata) {
		this.godisnjaZarada = nedeljnaPlata * 52;
	}

	public int getBrojGolovaIAsistencija() {
		return brojGolovaIAsistencija;
	}

	public void setBrojGolovaIAsistencija(int brojGolovaIAsistencija) {
		this.brojGolovaIAsistencija = brojGolovaIAsistencija;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	@Override
	public String toString() {
		return "Fudbaler [brojOdigranihSezona=" + brojOdigranihSezona + ", sponzor=" + sponzor + ", rezerva=" + rezerva
				+ ", godisnjaZarada=" + godisnjaZarada + ", brojGolovaIAsistencija=" + brojGolovaIAsistencija
				+ ", pozicija=" + pozicija + "]";
	}
	
	
	
}
