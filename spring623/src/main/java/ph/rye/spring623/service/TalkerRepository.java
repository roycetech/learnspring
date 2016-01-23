package ph.rye.spring623.service;

import ph.rye.spring623.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
