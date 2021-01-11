package com.example.mysqlproject;

import com.example.mysqlproject.dao.ProfileService;
import com.example.mysqlproject.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class MysqlprojectApplication {

	@Autowired
	private ProfileService profileService;

	public static void main(String[] args) {
		SpringApplication.run(MysqlprojectApplication.class, args);
	}

	/*@Override
	public void run(String... strings) throws Exception {

		Profile newProfile = new Profile();
		newProfile.setName("Dembitu");
		newProfile.setFname("Hambisa");
		newProfile.setAge(18);

		int result = profileService.saveProfile(newProfile);

		if(result > 0){
			System.out.println("A new row inserted");
		}


		String selectSql = "SELECT * FROM profile";
		List<Profile> profiles = profileService.profileList(selectSql);

		if(profiles != null){
			System.out.println("List of Customer profiles are");
		}
	}*/
}
