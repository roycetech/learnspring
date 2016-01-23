package ph.rye.spring631.service;

import ph.rye.spring631.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
