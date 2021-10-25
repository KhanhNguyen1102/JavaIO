package copyFile;

public class TestCopyFile {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.readFile("result.txt");
        copyFile.copyFile("result.txt","destination.txt");
    }
}
