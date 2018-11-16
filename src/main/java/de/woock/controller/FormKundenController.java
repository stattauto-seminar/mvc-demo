package de.woock.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.woock.dto.KundenDto;
import de.woock.entity.Kunde;
import de.woock.service.KundenService;

@Controller
@RefreshScope
public class FormKundenController {

	@Value("${welcome.message}")
    private String message;
    
    @Value("${error.message}")     
    private String errorMessage;
    
    private KundenService kundenService;
    
    public FormKundenController(KundenService kundenService) {
		this.kundenService = kundenService;
	}

    @RequestMapping("/ip")
    public String ipadress() throws UnknownHostException {
    	return InetAddress.getLocalHost().getHostAddress();
    }
    
	@GetMapping({ "/", "/index" })
    public String index(Model model) {
        model.addAttribute("message", message);
        return "index";
    }
 
    @GetMapping("/kunde")
    public String kunde(Model model) {
        return "kunde";
    }
 
    @GetMapping("/kundeList")
    public String kundenList(Model model) {
    	model.addAttribute("kunden", kundenService.getAllKunden());
        return "kundeList";
    }
 
    @GetMapping("/addKunde" )
    public String addKundeForm(Model model) {
        KundenDto kundeForm = new KundenDto();
        model.addAttribute("kundeForm", kundeForm);
        return "addKunde";
    }
 
    @PostMapping("/addKunde")
    public String addKundeSave(Model model, @ModelAttribute("kundeForm") KundenDto kundeForm) {
    	String kundenNummer = kundeForm.getKundenNummer();
        String vorname      = kundeForm.getVorname();
        String nachname     = kundeForm.getNachname();
        if (vorname      != null && vorname     .length() > 0 
         && nachname     != null && nachname    .length() > 0
         && kundenNummer != null && kundenNummer.length() > 0) {
            Kunde newKunde = new Kunde(null, kundenNummer, vorname, nachname);
            kundenService.kundenAufnehmen(newKunde);
            return "redirect:/kundeList";
        }
        String error = "Vorname & Nachname sind erforderlich!";
        model.addAttribute("errorMessage", error);
        return "addKunde";
    }
 
}