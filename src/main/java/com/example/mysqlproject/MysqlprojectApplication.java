package com.example.mysqlproject;

import com.example.mysqlproject.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class MysqlprojectApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MysqlprojectApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
/*		String sql = "INSERT into profile(name, fname, age) VALUES(?, ?, ?)";

		int result = jdbcTemplate.update(sql, "Abel", "Tadesse", 29);

		if(result > 0){
			System.out.println("A new row inserted");
		}*/


		String selectSql = "SELECT * FROM profile";

		List<Profile> profileList = jdbcTemplate.query(selectSql, new BeanPropertyRowMapper(Profile.class));

		if(profileList != null){
			System.out.println("List of Customer profiles are");
		}
	}
}
