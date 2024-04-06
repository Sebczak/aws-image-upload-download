package com.company.awsimageupload.services;

import com.company.awsimageupload.datastore.UserProfileDataStore;
import com.company.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileDataAccessService {

    private final UserProfileDataStore userProfileDataStore;

    public UserProfileDataAccessService(UserProfileDataStore userProfileDataStore) {
        this.userProfileDataStore = userProfileDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return userProfileDataStore.getUserProfiles();
    }
}
