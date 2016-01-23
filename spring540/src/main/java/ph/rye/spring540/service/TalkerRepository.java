package ph.rye.spring540.service;

import ph.rye.spring540.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
