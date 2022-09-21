package com.codeclan.FilesAndFolders.Files_And_Folders.repositories;

import com.codeclan.FilesAndFolders.Files_And_Folders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
