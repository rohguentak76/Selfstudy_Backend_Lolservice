package selfhomeworkLoLService.LoLservice.controller;

import ch.qos.logback.core.encoder.EchoEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import selfhomeworkLoLService.LoLservice.domain.Encrypedinfo;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;
import selfhomeworkLoLService.LoLservice.service.Lolservice;

import java.util.List;

@RestController
public class Lolcontroller {
    @Autowired
    Lolservice lolservice;


    @GetMapping("/selfhomeworkLoLService/LoLService/by-summoner-name/{summonerName}")
    public Summonerdomain getsummonerdomainbyname(@PathVariable String summonerName) {
        return lolservice.getSummonerdomain(summonerName);
    }
    @GetMapping("/selfhomeworkLoLService/LoLService/by-encryped-summonername/{summonerName}")
    public List<Encrypedinfo> getleaguepositionbyEncrypedname(@PathVariable String summonerName){
        return lolservice.getLeaguepositionByencrypedsummonerName(summonerName);
    }
}
