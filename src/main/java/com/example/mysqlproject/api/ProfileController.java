package com.example.mysqlproject.api;

import com.example.mysqlproject.dao.ProfileService;
import com.example.mysqlproject.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public int saveProfile(@RequestBody Profile profile){
        int result = profileService.saveProfile(profile);

        return result;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Profile> profileList(){
        String selectSql = "SELECT * FROM profile";

        List<Profile> profiles = profileService.profileList(selectSql);

        return profiles;
    }

}
