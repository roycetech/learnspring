package ph.rye.spring541.service;

import ph.rye.spring541.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
