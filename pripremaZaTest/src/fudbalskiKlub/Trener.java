package fudbalskiKlub;

public class Trener extends Osoba{

	private double godisnjaZarada;
	private String sponzor;
	private boolean svetskiTopTrener;
	private int godinaRada;
	private int brojTrofeja;
	
	public Trener(String ime, String prezime, String jmbg, String adresa, double godisnjaZarada, String sponzor, int godinaRada, int brojTrofeja) {
		super(ime, prezime, jmbg, adresa);
		this.godisnjaZarada = godisnjaZarada;
		this.sponzor = sponzor;
		if(brojTrofeja > 15 && godinaRada > 20) {
			this.svetskiTopTrener = true;
		} else {
			this.svetskiTopTrener = false;
		}
		this.godinaRada = godinaRada;
		this.brojTrofeja = brojTrofeja;
	}

	public double getGodisnjaZarada() {
		return godisnjaZarada;
	}

	public void setGodisnjaZarada(double godisnjaZarada) {
		this.godisnjaZarada = godisnjaZarada;
	}

	public String getSponzor() {
		return sponzor;
	}

	public void setSponzor(String sponzor) {
		this.sponzor = sponzor;
	}

	public boolean isSvetskiTopTrener() {
		return svetskiTopTrener;
	}

	public int getGodinaRada() {
		return godinaRada;
	}

	public void setGodinaRada(int godinaRada) {
		this.godinaRada = godinaRada;
	}

	public int getBrojTrofeja() {
		return brojTrofeja;
	}

	public void setBrojTrofeja(int brojTrofeja) {
		this.brojTrofeja = brojTrofeja;
	}

	@Override
	public String toString() {
		return "Trener [godisnjaZarada=" + godisnjaZarada + ", sponzor=" + sponzor + ", svetskiTopTrener="
				+ svetskiTopTrener + ", godinaRada=" + godinaRada + ", brojTrofeja=" + brojTrofeja + "]";
	}
	
	
	
}
