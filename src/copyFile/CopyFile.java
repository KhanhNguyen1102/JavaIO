package copyFile;

import java.io.*;


public class CopyFile {
    public void readFile(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e){
            System.err.println("File ko tồn tại hoặc nội dung có lỗi");
        }
    }
    public void copyFile(String srcFile,String desFile){
        try {
            File inputFile = new File(srcFile);
            if (!inputFile.exists()){
                throw new FileNotFoundException();
            }
            File outputFile = new File(desFile);
            if (outputFile.exists()){
                throw new IllegalArgumentException("Đã tồn tại file này trong system");
            }
            FileWriter fileWriter = new FileWriter(desFile,true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line = "";
            while ((line = br.readLine()) != null){
                bw.write(line + "\n");
            }
            bw.close();
            br.close();
        }catch (FileNotFoundException e) {
            System.err.println("File không tồn tại hoặc nội dung lỗi");
        }catch (Exception e1){
            System.err.println("File đích đã tồn tại trong hệ thống");
        }
    }
}
