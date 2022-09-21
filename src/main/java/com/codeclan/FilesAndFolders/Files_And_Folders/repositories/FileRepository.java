package com.codeclan.FilesAndFolders.Files_And_Folders.repositories;

import com.codeclan.FilesAndFolders.Files_And_Folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
