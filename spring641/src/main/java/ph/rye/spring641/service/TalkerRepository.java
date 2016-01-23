package ph.rye.spring641.service;

import ph.rye.spring641.model.Talker;

public interface TalkerRepository {

    Talker save(Talker talker);

    Talker findByUsername(String username);

}
