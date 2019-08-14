package selfhomeworkLoLService.LoLservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import selfhomeworkLoLService.LoLservice.domain.Encrypedinfo;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class Lolpositionrepository {
    @Autowired

    private MongoTemplate mongoTemplate;

    public void updateLolposition(List<Encrypedinfo> encrypedinfos) {
        for (Encrypedinfo encrypedinfo : encrypedinfos) {
            mongoTemplate.save(encrypedinfo);
        }
    }
    public void setnamefordb(List<Encrypedinfo> encrypedinfos) {
        for (int i = 0; i < encrypedinfos.size(); i++) {
            encrypedinfos.get(i).setId(encrypedinfos.get(i).getQueueType() + encrypedinfos.get(i).getSummonerName());
        }
    }
}
