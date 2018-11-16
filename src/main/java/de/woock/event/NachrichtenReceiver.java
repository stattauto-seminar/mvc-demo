package de.woock.event;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import de.woock.entity.Kunde;

@Component
public class NachrichtenReceiver {
	
	@JmsListener(destination = "neuenKundenAufgenommen", containerFactory = "myFactory")
	public void receiveMessageNeueStation(Kunde kunde) {
		System.out.println(String.format("Event: Neuen Kunden aufgenommen: %s", kunde.getKundenNummer()));
	}
}
