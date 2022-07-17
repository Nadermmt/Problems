import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxSum {
    public Integer getCount() {
        ArrayList<ArrayList<String>> array = readFile();
        Integer count = 0;
        Integer currentIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (i == 0) {
                count += Integer.parseInt(array.get(i).get(0));
            } else {
                Integer a = Integer.parseInt(array.get(i).get(currentIndex));
                Integer b = Integer.parseInt(array.get(i).get(currentIndex + 1));
                if (a > b || a == b) {
                    count += a;
                } else {
                    count += a;
                    currentIndex += 1;
                }
            }
        }
        return count;
    }

    private ArrayList<ArrayList<String>> readFile() {
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            String line;
            URL fileName = getClass().getResource("triangle.txt");
            File file = new File(fileName.getPath());
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            int index = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(new ArrayList<>(Arrays.asList(line.split(" "))));
                index += 1;
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
            }
            try {
                fileReader.close();
            } catch (Exception ee) {
            }
        }
        return lines;
    }
}
