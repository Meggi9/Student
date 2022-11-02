package com.example.application.dao;

import com.example.application.Enity.Rating;
import com.example.application.Enity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class RatingDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RatingDAO(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }

    public List<Rating> RecordBook(Student student){
        return jdbcTemplate.query("SELECT dscp.namediscipline, fc.nameform, ratings, teacher FROM statements st JOIN disciplines_of_academ_plan dap\n" +
                "ON dap.id_dap = st.disc_id\n" +
                "JOIN form_control fc ON fc.id_control = dap.id_control\n" +
                "JOIN disciplines dscp ON dscp.id_discipline = dap.disc_name_id WHERE student_id =?;",new Object[]{student.getRecord_number()}, new RatingMapper());
    }
}
