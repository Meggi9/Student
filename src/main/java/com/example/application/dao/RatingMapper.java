package com.example.application.dao;

import com.example.application.Enity.Rating;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingMapper implements RowMapper<Rating> {
    @Override
    public Rating mapRow(ResultSet rs, int rowNum) throws SQLException {

        Rating rating = new Rating();

        rating.setNameDisciplane(rs.getString("namediscipline"));
        rating.setFormContr(rs.getString("nameform"));
        rating.setRatings(rs.getString("ratings"));
        rating.setTeacher(rs.getString("teacher"));

        return rating;
    }
}
