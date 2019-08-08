package selfhomeworkLoLService.LoLservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import selfhomeworkLoLService.LoLservice.domain.Summonerdomain;

@Service
public class LolserviceapiClient {
<<<<<<< HEAD
    private final String appid = "RGAPI-782a0a2c-ce4d-44a9-9a8d-0cdebc38751b";
    private final String summonerUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={appid}";

    @Autowired
    private RestTemplate restTemplate;
    public Summonerdomain requestSummonerdomain(String summonerName) {
=======
    private String appid = "RGAPI-782a0a2c-ce4d-44a9-9a8d-0cdebc38751b";
    private String summonerUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={appid}";

    @Autowired
    RestTemplate restTemplate;
    public static Summonerdomain requestSummonerdomain(String summonerName) {
>>>>>>> 8f911474029289f9545d3d6a1b4df2ac99f993f0
        return restTemplate.exchange(summonerUrl, HttpMethod.GET,null,Summonerdomain.class,summonerName,appid).getBody();
    }
}
