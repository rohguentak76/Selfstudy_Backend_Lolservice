package selfhomeworkLoLService.LoLservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import selfhomeworkLoLService.LoLservice.domain.Encrypedinfo;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;

import java.util.List;

@Service
public class LolserviceapiClient {
    private final String appid = "RGAPI-be9832ab-fe9e-4a5c-8176-ce175ff6a07d";
    private final String summonerUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={appid}";
    private final String encrypedUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{encrypedId}?api_key={appid}";
    @Autowired
    private RestTemplate restTemplate;

    public Summonerdomain requestSummonerdomain(String summonerName) {
        return restTemplate.exchange(summonerUrl, HttpMethod.GET,null,Summonerdomain.class,summonerName,appid).getBody();
    }

    public List<Encrypedinfo> requestleagueposition(String encrypedId) {
        return restTemplate.exchange(encrypedUrl,HttpMethod.GET,null,new ParameterizedTypeReference<List<Encrypedinfo>>(){},encrypedId,appid).getBody();
    }
}
