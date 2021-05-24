package no.hvl.dat107;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class KontorDAO {

	private EntityManagerFactory emf;

	public KontorDAO() {
		emf = Persistence.createEntityManagerFactory("KontorPersistenceUnit");
	}

	public Rom finnRomNr(String romNr) {
		EntityManager em = emf.createEntityManager();
		Rom rom = null;
		try {
			rom = em.find(Rom.class, romNr);
		} finally {
			em.close();
		}
		return rom;
	}

	public Ansatt finnAnsattNr(int ansNr) {
		EntityManager em = emf.createEntityManager();
		Ansatt ansatt = null;
		try {
			ansatt = em.find(Ansatt.class, ansNr);
		} finally {
			em.close();
		}
		return ansatt;

	}

	public List<Rom> finnAlleRom() {
		String queryString = "SELECT r FROM Rom r ORDER BY r.romNr";

		EntityManager em = emf.createEntityManager();

		List<Rom> roms = null;
		try {

			TypedQuery<Rom> query = em.createQuery(queryString, Rom.class);
			roms = query.getResultList();
		} finally {
			em.close();
		}

		return roms;
	}

	public List<Ansatt> finnAlleAnsatte() {
		String queryString = "SELECT a FROM Ansatt a ORDER BY a.ansNr";

		EntityManager em = emf.createEntityManager();

		List<Ansatt> ansatt = null;
		try {

			TypedQuery<Ansatt> query = em.createQuery(queryString, Ansatt.class);
			ansatt = query.getResultList();
		} finally {
			em.close();
		}

		return ansatt;
	}

}
