package ph.rye.spring622.service;

import ph.rye.spring622.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
