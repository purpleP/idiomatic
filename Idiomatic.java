import java.io.File;

class Idiomatic {

    String[] pathsFromClassPath() {
        return System.getProperty("java.class.path").split(File.pathSeparator);
    }

    private static void main(String... args) {
    }
}
