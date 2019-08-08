package selfhomeworkLoLService.LoLservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import selfhomeworkLoLService.LoLservice.api.LolserviceapiClient;
import selfhomeworkLoLService.LoLservice.domain.Encrypedinfo;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;

import java.util.List;

@Service
public class Lolservice {
    @Autowired
    LolserviceapiClient lolserviceapiClient;

    public Summonerdomain getSummonerdomain(String summonerName) {
        return lolserviceapiClient.requestSummonerdomain(summonerName);
    }
    public List<Encrypedinfo> getLeaguepositionByencrypedsummonerName(String summonerName){
        String encrypedId = getSummonerdomain(summonerName).getId();
        List<Encrypedinfo> encrypedinfoList = lolserviceapiClient.requestleagueposition(encrypedId);
        return encrypedinfoList;
    }
}
