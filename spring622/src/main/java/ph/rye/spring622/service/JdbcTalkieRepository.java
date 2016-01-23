package ph.rye.spring622.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ph.rye.spring622.model.Talkie;


@Repository
public class JdbcTalkieRepository implements TalkieRepository {


    private final JdbcOperations jdbc;

    
    @Autowired
    public JdbcTalkieRepository(final JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    
    public List<Talkie> findRecentTalkies() {
        return jdbc.query(
            "select id, message, created_at, latitude, longitude"
                    + " from Talkie" + " order by created_at desc limit 20",
            new TalkieRowMapper());
    }

    @Override
    public List<Talkie> findTalkies(final long max, final int count) {
        return jdbc.query(
            "select id, message, created_at, latitude, longitude"
                    + " from Talkie" + " where id < ?"
                    + " order by created_at desc limit 20",
            new TalkieRowMapper(),
            max);
    }

    public Talkie findOne(final long id) {
        return jdbc.queryForObject(
            "select id, message, created_at, latitude, longitude"
                    + " from Talkie" + " where id = ?",
            new TalkieRowMapper(),
            id);
    }

    public void save(final Talkie talkie) {
        jdbc.update(
            "insert into Talkie (message, created_at, latitude, longitude)"
                    + " values (?, ?, ?, ?)",
            talkie.getMessage(),
            talkie.getTime(),
            talkie.getLatitude(),
            talkie.getLongitude());
    }

    private static class TalkieRowMapper implements RowMapper<Talkie> {
        @Override
        public Talkie mapRow(final ResultSet rs, final int rowNum)
                throws SQLException {
            return new Talkie(
                rs.getLong("id"),
                rs.getString("message"),
                rs.getDate("created_at"),
                rs.getDouble("longitude"),
                rs.getDouble("latitude"));
        }
    }

}
