package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domaine.Voyage;
import service.AgencesVoyagesServices;


public class AgencesVoyagesServicesTest {

	//variables globales
	private Voyage voyage;
	private AgencesVoyagesServices agence;

	@BeforeEach
	public void setUp() {
		voyage = new Voyage(0, null, null);
		agence = new AgencesVoyagesServices();
	}

	@Test
	public void testReserver() {

		assertTrue("vrai",agence.reserver(voyage));
	}
}