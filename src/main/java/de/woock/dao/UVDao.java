package de.woock.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import de.woock.entity.Kunde;

@FeignClient(name = "unfallversicherung")
public interface UVDao extends UV {
	
	@PostMapping(value = "/kundenAnmelden", consumes = "application/json")
    Kunde neuenKundenAnmelden(Kunde kunde);

	@GetMapping("/alleKunden")
	List<Kunde> alleKunden();
	
	@GetMapping("/adresse")
	String adresse();
}
