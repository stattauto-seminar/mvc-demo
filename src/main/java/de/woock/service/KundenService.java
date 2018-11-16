package de.woock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import de.woock.dao.UVDao;
import de.woock.entity.Kunde;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor
@Service
public class KundenService {

	private UVDao uvDao;
	
	public List<Kunde> getAllKunden() {
		return uvDao.alleKunden();
	}
	
	public Kunde kundenAufnehmen(Kunde kunde) {
		log.info("HUHU");
		return uvDao.neuenKundenAnmelden(kunde);
	}
}
