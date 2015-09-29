package com.a3m.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.a3m.domain.SmallLeadDO;
import org.springframework.jdbc.core.RowMapper;

public class SmallLeadDOMapper implements RowMapper<SmallLeadDO> {
    @Override
    public SmallLeadDO mapRow(ResultSet rs, int rowNum) throws SQLException {
        SmallLeadDO smallLeadDO = new SmallLeadDO();

        smallLeadDO.setVehicleMake(rs.getString("rf_edmunds_make"));
        smallLeadDO.setVehicleYear(rs.getInt("rf_edmunds_year"));
        smallLeadDO.setPricePromise(rs.getBoolean("ld_price_promise_flag"));
        smallLeadDO.setOfferPrice(rs.getFloat("rf_offer_price"));

        return smallLeadDO;
    }
}
