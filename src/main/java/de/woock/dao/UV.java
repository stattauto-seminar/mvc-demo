package de.woock.dao;

import java.util.List;

import de.woock.entity.Kunde;

public interface UV {
	
    Kunde neuenKundenAnmelden(Kunde kunde);
	List<Kunde> alleKunden();
	String adresse();
}
