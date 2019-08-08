package selfhomeworkLoLService.LoLservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import selfhomeworkLoLService.LoLservice.api.LolserviceapiClient;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;

@Service
public class Lolservice {
    @Autowired
    LolserviceapiClient lolserviceapiClient;

    public Summonerdomain getSummonerdomain(String summonerName) {
        return lolserviceapiClient.requestSummonerdomain(summonerName);
    }
}
