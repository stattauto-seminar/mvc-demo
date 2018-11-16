package de.woock.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kunde implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long   id;
	private String kundenNummer;
    private String vorname;
    private String nachname;
}