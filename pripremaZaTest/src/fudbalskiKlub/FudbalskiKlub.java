package fudbalskiKlub;

import java.util.LinkedList;

public class FudbalskiKlub implements IFudbalskiKlub{

	private String naziv;
	private Trener trener;
	private LinkedList<Fudbaler> kolekcijaFudbalera;
	private int brojZaposlenih;
	private int brojTrofeja;
	private double godisnjiIzdaci;
	
	public FudbalskiKlub(String naziv, Trener trener, LinkedList<Fudbaler> kolekcijaFudbalera, int brojZaposlenih,
			int brojTrofeja, double godisnjiIzdaci) {
		super();
		this.naziv = naziv;
		this.trener = trener;
		this.kolekcijaFudbalera = kolekcijaFudbalera;
		this.brojZaposlenih = brojZaposlenih;
		this.brojTrofeja = brojTrofeja;
		this.godisnjiIzdaci = godisnjiIzdaci;
	}

	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
		
	public Trener getTrener() {
		return trener;
	}
	
	public void setTrener(Trener trener) {
		this.trener = trener;
	}
	
	public LinkedList<Fudbaler> getKolekcijaFudbalera() {
		return kolekcijaFudbalera;
	}
	
	public void setKolekcijaFudbalera(LinkedList<Fudbaler> kolekcijaFudbalera) {
		this.kolekcijaFudbalera = kolekcijaFudbalera;
	}
	
	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}
	
	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}
	
	public int getBrojTrofeja() {
		return brojTrofeja;
	}
	
	public void setBrojTrofeja(int brojTrofeja) {
		this.brojTrofeja = brojTrofeja;
	}
	
	public double getGodisnjiIzdaci() {
		return godisnjiIzdaci;
	}
	
	public void setGodisnjiIzdaci(double godisnjiIzdaci) {
		this.godisnjiIzdaci = godisnjiIzdaci;
	}

	@Override
	public String toString() {
		return "FudbalskiKlub [naziv=" + naziv + ", trener=" + trener + ", kolekcijaFudbalera=" + kolekcijaFudbalera
				+ ", brojZaposlenih=" + brojZaposlenih + ", brojTrofeja=" + brojTrofeja + ", godisnjiIzdaci="
				+ godisnjiIzdaci + "]";
	}
	
	public Fudbaler najskupljiFudbaler() {
		Fudbaler maks = kolekcijaFudbalera.getFirst();
		for(int i = 0; i < kolekcijaFudbalera.size(); i++) {
			if(maks.getGodisnjaZarada() < kolekcijaFudbalera.get(i).getGodisnjaZarada()) maks = kolekcijaFudbalera.get(i);
		}
		return maks;
	}
	
	public Fudbaler najNeEfikasnijiFudbaler() {
		Fudbaler maks = kolekcijaFudbalera.getFirst();
		for(int i = 0; i < kolekcijaFudbalera.size(); i++) {
			if(maks.getBrojGolovaIAsistencija() > kolekcijaFudbalera.get(i).getBrojGolovaIAsistencija()) maks = kolekcijaFudbalera.get(i);
		}
		return maks;
	}
	
	public int brojFudbaleraNaPoziciji(String pozicija) {
		int brojac = 0;
		for(int i = 0; i < kolekcijaFudbalera.size(); i++) {
			if(kolekcijaFudbalera.get(i).getPozicija().equals(pozicija)) brojac++;
		}
		return brojac;
	}
	
	public Fudbaler najJeftinijiFudbalerRezerva() {
		Fudbaler min = najskupljiFudbaler(); 
		for(int i = 0; i < kolekcijaFudbalera.size(); i++) {
			if(kolekcijaFudbalera.get(i).isRezerva()) {
				if(kolekcijaFudbalera.get(i).getGodisnjaZarada() < min.getGodisnjaZarada()) min = kolekcijaFudbalera.get(i);
			}
		}
		return min;
	}
	
}
