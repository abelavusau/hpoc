package com.a3m.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.a3m.domain.SmallLeadDO;
import org.springframework.jdbc.core.RowMapper;

public class SmallLeadDOMapper implements RowMapper<SmallLeadDO> {
    @Override
    public SmallLeadDO mapRow(ResultSet rs, int rowNum) throws SQLException {
        SmallLeadDO smallLeadDO = new SmallLeadDO();

        smallLeadDO.setVehicleMake(rs.getString("vehicle_make"));
        smallLeadDO.setVehicleYear(rs.getString("vehicle_year"));
        smallLeadDO.setPricePromise(rs.getString("price_promise_flag"));
        smallLeadDO.setOfferPrice(rs.getString("offer_price"));


        return smallLeadDO;
    }
}
