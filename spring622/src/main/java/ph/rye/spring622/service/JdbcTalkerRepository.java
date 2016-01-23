package ph.rye.spring622.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ph.rye.spring622.model.Talker;

@Repository
public class JdbcTalkerRepository implements TalkerRepository {


    private final JdbcOperations jdbc;


    @Autowired
    public JdbcTalkerRepository(final JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }


    @Override
    public Talker save(final Talker talker) {
        jdbc.update(
            "insert into Talker (username, password, first_name, last_name, email)"
                    + " values (?, ?, ?, ?, ?)",
            talker.getUsername(),
            talker.getPassword(),
            talker.getFirstName(),
            talker.getLastName(),
            talker.getEmail());
        return talker;
    }

    @Override
    public Talker findByUsername(final String username) {
        return jdbc.queryForObject(
            "select id, username, null, first_name, last_name, email from Talker where username=?",
            new TalkerRowMapper(),
            username);
    }

    private static class TalkerRowMapper implements RowMapper<Talker> {
        @Override
        public Talker mapRow(final ResultSet rs, final int rowNum)
                throws SQLException {
            return new Talker(
                rs.getLong("id"),
                rs.getString("username"),
                null,
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"));
        }
    }

}
