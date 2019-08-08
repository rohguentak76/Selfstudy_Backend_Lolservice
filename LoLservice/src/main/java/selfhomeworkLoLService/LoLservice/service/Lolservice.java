package selfhomeworkLoLService.LoLservice.service;

import org.springframework.stereotype.Service;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;

@Service
public class Lolservice {

    public static Summonerdomain getSummonerdomain(String summonerName) {
        return LolserviceapiClient.requestSummonerdomain(summonerName);
    }
}
