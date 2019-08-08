package selfhomeworkLoLService.LoLservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Encrypedinfo {
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String leagueId;
    private String tier;
    private int leaguePoints;
    private MiniSeriesDTO miniSeries;
    @Id
    private String id;
    @Data
    private static class MiniSeriesDTO {
        private String progress;
        private int losses;
        private int target;
        private int wins;
    }
}
