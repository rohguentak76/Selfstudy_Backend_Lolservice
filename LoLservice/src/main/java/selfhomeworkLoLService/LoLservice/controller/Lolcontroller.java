package selfhomeworkLoLService.LoLservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;
import selfhomeworkLoLService.LoLservice.service.Lolservice;

@RestController
public class Lolcontroller {
    @Autowired
    Lolservice lolservice;

    @GetMapping("/selfhomeworkLoLService/LoLService/by-summoner-name/{summonerName}")
    public Summonerdomain getsummonerdomainbyname(@PathVariable String summonerName){
        return Lolservice.getSummonerdomain(summonerName);
    }
}
