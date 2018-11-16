package de.woock.dao;

import java.util.ArrayList;
import java.util.List;

import de.woock.entity.Kunde;

public class UVFallback implements UVDao {
	
	@Override
	public Kunde neuenKundenAnmelden(Kunde kunde) {
		return new Kunde(0L, "Nobody", "Nobody", "Nobody");
	}

	@Override
	public List<Kunde> alleKunden() {
		ArrayList<Kunde> kunden = new ArrayList<Kunde>();
		kunden.add(new Kunde(8L, "fallback", "fallback", "fallback"));
		return kunden;
	}

	@Override
	public String adresse() {
		return "Fallback Adresse";
	}

}
