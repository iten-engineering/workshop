package features.java11;

import static java.nio.file.StandardOpenOption.APPEND;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		final Path p = Paths.get("test.txt");

		Files.writeString(p, "Line A\n");
		Files.writeString(p, "Line B\n", APPEND);
		Files.writeString(p, "Line C\n", APPEND);

		String content = Files.readString(p);

		List<String> lines = content.lines().collect(Collectors.toList());
		lines.forEach(System.out::println);
	}

}
