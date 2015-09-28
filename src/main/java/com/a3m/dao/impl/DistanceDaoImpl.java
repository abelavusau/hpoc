package com.a3m.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.a3m.dao.DistanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DistanceDaoImpl implements DistanceDao {

    public static final String DISTANCES_TOTAL_SQL
            = "select count(dealer_distance) as total from f_lead";

    public static final String DISTANCE_AMOUNT_FOR_THRESHOLD_SQL
            = "select count(*) as total from f_lead where to_number(dealer_distance,'99999999.9999') <= ?";


    @Autowired
    private JdbcTemplate template;

    private final RowMapper<Long> TOTAL_ROW_MAPPER = new RowMapper<Long>() {
        @Override
        public Long mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getLong("total");
        }
    };


    @Override
    public long getDistanceValuesTotal() {
        return template.queryForObject(DISTANCES_TOTAL_SQL, TOTAL_ROW_MAPPER);
    }

    @Override
    public long getDistancesFromInterval(long toThreshold) {
        return template.queryForObject(DISTANCE_AMOUNT_FOR_THRESHOLD_SQL, new Object[]{toThreshold}, TOTAL_ROW_MAPPER);
    }
}
