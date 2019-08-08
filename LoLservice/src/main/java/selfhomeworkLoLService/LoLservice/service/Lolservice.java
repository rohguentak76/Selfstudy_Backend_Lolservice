package selfhomeworkLoLService.LoLservice.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import selfhomeworkLoLService.LoLservice.api.LolserviceapiClient;
=======
import org.springframework.stereotype.Service;
>>>>>>> 8f911474029289f9545d3d6a1b4df2ac99f993f0
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;

@Service
public class Lolservice {
<<<<<<< HEAD
    @Autowired
    LolserviceapiClient lolserviceapiClient;

    public Summonerdomain getSummonerdomain(String summonerName) {
        return lolserviceapiClient.requestSummonerdomain(summonerName);
=======

    public static Summonerdomain getSummonerdomain(String summonerName) {
        return LolserviceapiClient.requestSummonerdomain(summonerName);
>>>>>>> 8f911474029289f9545d3d6a1b4df2ac99f993f0
    }
}
