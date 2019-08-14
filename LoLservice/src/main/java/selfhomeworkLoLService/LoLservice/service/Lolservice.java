package selfhomeworkLoLService.LoLservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import selfhomeworkLoLService.LoLservice.api.LolserviceapiClient;
import selfhomeworkLoLService.LoLservice.domain.Encrypedinfo;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;
import selfhomeworkLoLService.LoLservice.repository.Lolpositionrepository;

import java.util.List;

@Service
public class Lolservice {
    @Autowired
    LolserviceapiClient lolserviceapiClient;
    @Autowired
    private Lolpositionrepository lolpositionrepository;

    public Summonerdomain getSummonerdomain(String summonerName) {
        return lolserviceapiClient.requestSummonerdomain(summonerName);
    }
    public List<Encrypedinfo> getLeaguepositionByencrypedsummonerName(String summonerName){
        String encrypedId = getSummonerdomain(summonerName).getId();
        List<Encrypedinfo> encrypedinfoList = lolserviceapiClient.requestleagueposition(encrypedId);
        lolpositionrepository.setnamefordb(encrypedinfoList);
        lolpositionrepository.updateLolposition(encrypedinfoList);
        return encrypedinfoList;
    }

}
