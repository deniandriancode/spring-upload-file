package app;

import org.springframework.core.io.*;
import org.springframework.web.multipart.*;

import java.nio.file.*;
import java.util.stream.*;

public interface StorageService {

    void init();

	void store(MultipartFile file);

	Stream<Path> loadAll();

	Path load(String filename);

	Resource loadAsResource(String filename);

	void deleteAll();

}
