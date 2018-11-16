package de.woock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KundenDto {
	
	private String kundenNummer;
    private String vorname;
    private String nachname;
}