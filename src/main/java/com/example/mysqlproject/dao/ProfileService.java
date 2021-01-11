package com.example.mysqlproject.dao;

import com.example.mysqlproject.model.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface ProfileService {

    int saveProfile(Profile profile);

    List<Profile> profileList(String query);
}
