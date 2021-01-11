package com.example.mysqlproject.dao;

import com.example.mysqlproject.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveProfile(Profile profile) {

        String sql = "INSERT into profile(name, fname, age) VALUES(?, ?, ?)";
        int result = jdbcTemplate.update(sql, profile.getName(), profile.getFname(), profile.getAge());

        return result;
    }

    @Override
    public List<Profile> profileList(String query) {
        List<Profile> profileList = jdbcTemplate.query(query, new BeanPropertyRowMapper(Profile.class));

        return profileList;
    }
}
