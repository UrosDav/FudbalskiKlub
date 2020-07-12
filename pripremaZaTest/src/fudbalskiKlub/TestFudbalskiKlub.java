package fudbalskiKlub;

import java.util.LinkedList;

public class TestFudbalskiKlub {

	public static void main(String[] args) {


		Fudbaler o1 = new Fudbaler("Uros", "Davidovic", "1111111111111", "Ulica a57", 3, "Soko Stark", false, 10000, 12, "desno krilo");
		Fudbaler o2 = new Fudbaler("Milos", "Milovanovic", "2222222222222", "Ulica 67", 5, "Soko Stark", true, 20000, 3, "desno krilo");
		Fudbaler o3 = new Fudbaler("Vojin", "Muncan", "3333333333333", "Ulica 77", 2, "Soko Stark", true, 15000, 1, "desno krilo");
		Fudbaler o4 = new Fudbaler("Dusan", "Sarac", "4444444444444", "Ulica 87", 9, "Soko Stark", false, 7000, 14, "desno krilo");
		Fudbaler o5 = new Fudbaler("Srdjan", "Milosevic", "23", "Ulica 27", 6, "Soko Stark", false, 8000, 5, "levo krilo");
		
		LinkedList<Fudbaler> tim = new LinkedList<Fudbaler>(); 
		tim.add(0, o1);
		tim.add(1, o2);
		tim.add(2, o3);
		tim.add(3, o4);
		tim.add(4, o5);
		
		System.out.println("Pocetak validacije:");
		for(int i = 0 ; i < tim.size(); i++) {
			if(!tim.get(i).validacijaJmbg()) System.out.println("	Doslo je do greske prilikom unosa jmbg-a za igraca " + tim.get(i).getIme() + " " + tim.get(i).getPrezime() + ". Sistem ce nastaviti da procesira podatke");
			if(!tim.get(i).validacijaAdrese()) System.out.println("	Doslo je do greske prilikom unosa broja adrese za igraca " + tim.get(i).getIme() + " " + tim.get(i).getPrezime() + ". Sistem ce nastaviti da procesira podatke");
		}
		System.out.println("Kraj validacije.");
		System.out.println();
		
		Trener tr = new Trener("Bogan", "Mitrovic", "5555555555555", "Ulica 97", 120000, "Soko Stark", 21, 16);

		FudbalskiKlub fk = new FudbalskiKlub("Crvena Zvezda", tr, tim, 25, 18, 500000);
		
		System.out.println("Najjeftinija rezerva je " + fk.najJeftinijiFudbalerRezerva().getIme()  + " " + fk.najJeftinijiFudbalerRezerva().getPrezime() + " sa godisnjom platom od EUR " + fk.najJeftinijiFudbalerRezerva().getGodisnjaZarada());
		System.out.println("Najnefikasniji fudbaler je " + fk.najNeEfikasnijiFudbaler().getIme()  + " " + fk.najNeEfikasnijiFudbaler().getPrezime() + " sa brojem golova i asistencija " + fk.najNeEfikasnijiFudbaler().getBrojGolovaIAsistencija());
		System.out.println("Najskuplji fudbaler je " + fk.najskupljiFudbaler().getIme()  + " " + fk.najskupljiFudbaler().getPrezime() + " sa godisnjom platom od EUR " + fk.najskupljiFudbaler().getGodisnjaZarada());
		System.out.println("Broj fudbalera na poziciji levo krilo je " + fk.brojFudbaleraNaPoziciji("levo krilo"));
		System.out.println("Broj fudbalera na poziciji desno krilo je " + fk.brojFudbaleraNaPoziciji("desno krilo"));

		
		
		Fudbaler d1 = new Fudbaler("Uros2", "Davidovic", "1111111111111", "Ulica a57", 3, "Soko Btark", false, 5000, 12, "desno krilo");
		Fudbaler d2 = new Fudbaler("Milos2", "Milovanovic", "2222222222222", "Ulica 67", 5, "Soko Stark", true, 80000, 3, "desno krilo");
		Fudbaler d3 = new Fudbaler("Vojin2", "Muncan", "3333333333333", "Ulica 77", 2, "Soko Btark", true, 15300, 1, "desno krilo");
		Fudbaler d4 = new Fudbaler("Dusan2", "Sarac", "4444444444444", "Ulica 87", 9, "Soko Stark", false, 70400, 14, "desno krilo");
		Fudbaler d5 = new Fudbaler("Srdjan2", "Milosevic", "23", "Ulica 27", 6, "Soko Stark", false, 18000, 5, "levo krilo");

		LinkedList<Fudbaler> tim2 = new LinkedList<Fudbaler>(); 
		tim2.add(0, d1);
		tim2.add(1, d2);
		tim2.add(2, d3);
		tim2.add(3, d4);
		tim2.add(4, d5);
		
		Trener tr2 = new Trener("Bogan2", "Mitrovic", "5555555555555", "Ulica 97", 120000, "Soko Stark", 21, 16);

		FudbalskiKlub fk2 = new FudbalskiKlub("Partizan", tr2, tim2, 15, 11, 1500000);
		
		LinkedList<FudbalskiKlub> liga = new LinkedList<FudbalskiKlub>();
		liga.add(0,fk);
		liga.add(1,fk2);
		
		PremierLiga pl = new PremierLiga("Soko Stark", liga, 2, 10, 2);
		System.out.println("Broj igraca sa istim sponyorom kao i liga: " + pl.brojIgracaSponzoraLige());
		System.out.println("Najskuplji fudbaler lige je " + pl.najskupljiFudbalerLige().getIme() + " " + pl.najskupljiFudbalerLige().getPrezime());
		System.out.println("Prosecni izdaci kluba su EUR " + pl.prosecniIzdaciKluba());
		System.out.println("Klub sa najvise zaposlenih je " + pl.klubSaNajviseZaposlenih().getNaziv());
		
	}

}
