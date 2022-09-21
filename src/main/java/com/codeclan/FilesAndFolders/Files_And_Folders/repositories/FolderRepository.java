package com.codeclan.FilesAndFolders.Files_And_Folders.repositories;

import com.codeclan.FilesAndFolders.Files_And_Folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
