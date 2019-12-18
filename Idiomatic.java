import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

class Idiomatic {

    String[] pathsFromClassPath() {
        return System.getProperty("java.class.path").split(File.pathSeparator);
    }

    boolean checkFileExtension(Path p, String extension) {
        return FileSystems
            .getDefault()
            .getPathMatcher("glob:*." + extension)
            .matches(p);
    }

    private static void main(String... args) {
    }
}
