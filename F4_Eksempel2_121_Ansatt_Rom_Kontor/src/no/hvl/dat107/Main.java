package no.hvl.dat107;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        KontorDAO kontorDAO = new KontorDAO();
        
        Rom romE425 = kontorDAO.finnRomNr("E425");
        System.out.println(romE425);
        Rom romF118 = kontorDAO.finnRomNr("F118");
        System.out.println(romF118);
        
        Ansatt ansatt1 = kontorDAO.finnAnsattNr(1);
        System.out.println(ansatt1);
        Ansatt ansatt2 = kontorDAO.finnAnsattNr(2);
        System.out.println(ansatt2);
        
        
        System.out.println("\n");
        System.out.println("Alle romene");
        List<Rom> alleRommene = kontorDAO.finnAlleRom();
        alleRommene.forEach(t -> System.out.println("   " + t));
        
        
        System.out.println("\n");
        System.out.println("Alle ansattene");
        List<Ansatt> alleAnsattene= kontorDAO.finnAlleAnsatte();
        alleAnsattene.forEach(t -> System.out.println("   " + t));
        
    }
}
