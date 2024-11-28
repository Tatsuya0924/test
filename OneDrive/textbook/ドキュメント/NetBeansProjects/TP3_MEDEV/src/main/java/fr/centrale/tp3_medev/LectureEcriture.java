package fr.centrale.tp3_medev;

import java.io.*;

public class LectureEcriture {

    private final String header;
    private final String comment;
    private int width;
    private int height;
    private int maxVal;
    private int[][] pixels;

    public LectureEcriture() {
        header = null;
        comment = null;
        width = 0;
        height = 0;
        maxVal = 0;
    }

    public void readPGM(InputStream is) throws Exception {
        if (is == null) {
            throw new IllegalArgumentException("No resource");
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;

        String header = br.readLine().trim(); 

        line = br.readLine();
        while (line.startsWith("#") || line.trim().isEmpty()) {
            line = br.readLine();
        }
        
        String[] dimensions = line.trim().split("\\s+"); 
      
        width = Integer.parseInt(dimensions[0].trim());
        height = Integer.parseInt(dimensions[1].trim());

        line = br.readLine();
        while (line.trim().isEmpty()) { 
            line = br.readLine();
        }
        
        maxVal = Integer.parseInt(line.trim());

        pixels = new int[height][width];
        int row = 0;
        while ((line = br.readLine()) != null && row < height) {
            String[] pixelValues = line.trim().split("\\s+");
            int col = 0;
            for (String value : pixelValues) {
                if (!value.isEmpty()) { 
                    pixels[row][col++] = Integer.parseInt(value.trim());
                }
            }
            row++;
        }

        System.out.println("Succeed in reading the pgm file: width = " + width + ", height = " + height + ", max = " + maxVal);
    }

    public void writePGM(String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(header + "\n");
            bw.write(comment + "\n");
            bw.write(width + "  " + height + "\n");
            bw.write(maxVal + "\n");

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    bw.write(pixels[i][j] + "  ");
                }
                bw.newLine();
            }
        }
    }

}
