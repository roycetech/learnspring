package ph.rye.spring542.service;

import ph.rye.spring542.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
