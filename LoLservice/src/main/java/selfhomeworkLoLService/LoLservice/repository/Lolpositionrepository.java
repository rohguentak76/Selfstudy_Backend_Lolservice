package selfhomeworkLoLService.LoLservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import selfhomeworkLoLService.LoLservice.domain.Encrypedinfo;

import java.util.List;

@Repository
public class Lolpositionrepository {
    @Autowired

    private MongoTemplate mongoTemplate;

    public void insertLolposition(List<Encrypedinfo> encrypedinfos){
        mongoTemplate.insert(encrypedinfos,Encrypedinfo.class);
    }

}
