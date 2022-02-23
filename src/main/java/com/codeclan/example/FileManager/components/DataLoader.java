package com.codeclan.example.FileManager.components;

import com.codeclan.example.FileManager.models.File;
import com.codeclan.example.FileManager.models.Folder;
import com.codeclan.example.FileManager.models.User;
import com.codeclan.example.FileManager.repositories.FileRepository;
import com.codeclan.example.FileManager.repositories.FolderRepository;
import com.codeclan.example.FileManager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        User peter = new User("Peter");
        userRepository.save(peter);
        User james = new User("James");
        userRepository.save(james);
        User andrew = new User("Andrew");
        userRepository.save(andrew);
        User alexander = new User("Alexander");
        userRepository.save(alexander);
        Folder codeClanWork = new Folder("Code_CLan_work",peter);
        folderRepository.save(codeClanWork);
        File hw = new File("WKND-HW","ttx",15,codeClanWork);
        fileRepository.save(hw);
    }
}
