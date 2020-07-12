package fudbalskiKlub;

import java.util.LinkedList;

public class PremierLiga implements IPremierLigaKonf {
	
	private String sponzor;
	private LinkedList<FudbalskiKlub> kolekcijaKlubova;
	private int brojKlubova;
	private int brojIgraca;
	private int brojTrenera;
	
	public PremierLiga(String sponzor, LinkedList<FudbalskiKlub> kolekcijaKlubova, int brojKlubova, int brojIgraca,
			int brojTrenera) {
		super();
		this.sponzor = sponzor;
		this.kolekcijaKlubova = kolekcijaKlubova;
		this.brojKlubova = brojKlubova;
		this.brojIgraca = brojIgraca;
		this.brojTrenera = brojTrenera;
	}

	public String getSponzor() {
		return sponzor;
	}

	public void setSponzor(String sponzor) {
		this.sponzor = sponzor;
	}

	public LinkedList<FudbalskiKlub> getKolekcijaKlubova() {
		return kolekcijaKlubova;
	}

	public void setKolekcijaKlubova(LinkedList<FudbalskiKlub> kolekcijaKlubova) {
		this.kolekcijaKlubova = kolekcijaKlubova;
	}

	public int getBrojKlubova() {
		return brojKlubova;
	}

	public void setBrojKlubova(int brojKlubova) {
		this.brojKlubova = brojKlubova;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public int getBrojTrenera() {
		return brojTrenera;
	}

	public void setBrojTrenera(int brojTrenera) {
		this.brojTrenera = brojTrenera;
	}

	@Override
	public String toString() {
		return "PremierLiga [sponzor=" + sponzor + ", kolekcijaKlubova=" + kolekcijaKlubova + ", brojKlubova="
				+ brojKlubova + ", brojIgraca=" + brojIgraca + ", brojTrenera=" + brojTrenera + "]";
	}
	
	@Override
	public FudbalskiKlub klubSaNajviseZaposlenih() {
		FudbalskiKlub maks = kolekcijaKlubova.getFirst();
		for(int i = 1; i < kolekcijaKlubova.size(); i++) {
			if(maks.getBrojZaposlenih() < kolekcijaKlubova.get(i).getBrojZaposlenih()) maks = kolekcijaKlubova.get(i); 
		}
		return maks;
	}
	
	@Override
	public double prosecniIzdaciKluba() {
		double suma = 0;
		for(int i = 0; i < kolekcijaKlubova.size(); i++) {
			suma += kolekcijaKlubova.get(i).getGodisnjiIzdaci();
		}
		return suma/kolekcijaKlubova.size();
	}
	
	@Override
	public Fudbaler najskupljiFudbalerLige() {
		Fudbaler maks = kolekcijaKlubova.getFirst().getKolekcijaFudbalera().getFirst();
		String klub = null;
		for(int i = 1; i < kolekcijaKlubova.size(); i++) {
			for(int j = 1; j < kolekcijaKlubova.get(i).getKolekcijaFudbalera().size(); j++) {
				if(maks.getGodisnjaZarada() < kolekcijaKlubova.get(i).getKolekcijaFudbalera().get(j).getGodisnjaZarada()) {
					maks = kolekcijaKlubova.get(i).getKolekcijaFudbalera().get(j);
					klub = kolekcijaKlubova.get(i).getNaziv();
				}
			}
		}
		System.out.println("Najplaceniji fudbaler je iz kluba " + klub);
		return maks;
	}
	
	@Override
	public int brojIgracaSponzoraLige() {
		int brojac = 0;
		for(int i = 0; i < kolekcijaKlubova.size(); i++) {
			for(int j = 0; j < kolekcijaKlubova.get(i).getKolekcijaFudbalera().size(); j++) {
				if(kolekcijaKlubova.get(i).getKolekcijaFudbalera().get(j).getSponzor().equals(sponzor)) brojac++; 
			}
		}
		return brojac;
	}		

	

}
