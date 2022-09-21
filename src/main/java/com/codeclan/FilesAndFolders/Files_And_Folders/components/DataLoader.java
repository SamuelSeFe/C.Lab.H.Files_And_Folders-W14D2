package com.codeclan.FilesAndFolders.Files_And_Folders.components;

import com.codeclan.FilesAndFolders.Files_And_Folders.models.File;
import com.codeclan.FilesAndFolders.Files_And_Folders.models.Folder;
import com.codeclan.FilesAndFolders.Files_And_Folders.models.Person;
import com.codeclan.FilesAndFolders.Files_And_Folders.repositories.FileRepository;
import com.codeclan.FilesAndFolders.Files_And_Folders.repositories.FolderRepository;
import com.codeclan.FilesAndFolders.Files_And_Folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader(){}

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person samuel = new Person("Samuel");
        personRepository.save(samuel);

        Person mattia = new Person("Mattia");
        personRepository.save(mattia);

        Folder school = new Folder("School", mattia);
        folderRepository.save(school);

        Folder codeclan = new Folder("CodeClan", samuel);
        folderRepository.save(codeclan);

        File schoolHomework = new File("School Homework", "txt", 5, school);
        fileRepository.save(schoolHomework);

        File schoolTests = new File("School Tests", "txt", 10, school);
        fileRepository.save(schoolTests);

        File classPython = new File("CodeClan Python", "py", 8, codeclan);
        fileRepository.save(classPython);

        File classJava = new File("CodeClan Java", "java", 12, codeclan);
        fileRepository.save(classJava);

        File classJavaScript = new File("CodeClan JavaScript", "js", 15, codeclan);
        fileRepository.save(classJavaScript);

        school.addFile(schoolHomework);
        school.addFile(schoolTests);
        folderRepository.save(school);

        codeclan.addFile(classJava);
        codeclan.addFile(classJavaScript);
        codeclan.addFile(classPython);
        folderRepository.save(codeclan);

        mattia.addFolder(school);
        personRepository.save(mattia);

        samuel.addFolder(codeclan);
        personRepository.save(samuel);

    }
}
