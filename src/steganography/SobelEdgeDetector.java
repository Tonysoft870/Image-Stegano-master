/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class SobelEdgeDetector {
    
      //sobel code
                 //  BufferedImage image = ImageIO.read(openedFile);

//                    int x = image.getWidth();
//                    int y = image.getHeight();
//
//                    int maxGval = 0;
//                    int[][] edgeColors = new int[x][y];
//                    int maxGradient = -1;
                    

//                        for (int i = 1; i < x - 1; i++) {
//                            for (int j = 1; j < y - 1; j++) {
//
//                                int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
//                                int val01 = getGrayScale(image.getRGB(i - 1, j));
//                                int val02 = getGrayScale(image.getRGB(i - 1, j + 1));
//
//                                int val10 = getGrayScale(image.getRGB(i, j - 1));
//                                int val11 = getGrayScale(image.getRGB(i, j));
//                                int val12 = getGrayScale(image.getRGB(i, j + 1));
//
//                                int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
//                                int val21 = getGrayScale(image.getRGB(i + 1, j));
//                                int val22 = getGrayScale(image.getRGB(i + 1, j + 1));
//
//                                int gx =  ((-1 * val00) + (0 * val01) + (1 * val02)) 
//                                        + ((-2 * val10) + (0 * val11) + (2 * val12))
//                                        + ((-1 * val20) + (0 * val21) + (1 * val22));
//
//                                int gy =  ((-1 * val00) + (-2 * val01) + (-1 * val02))
//                                        + ((0 * val10) + (0 * val11) + (0 * val12))
//                                        + ((1 * val20) + (2 * val21) + (1 * val22));
//
//                                double gval = Math.sqrt((gx * gx) + (gy * gy));
//                                int g = (int) gval;
//
//                                if(maxGradient < g) {
//                                    maxGradient = g;
//                                }
//
//                                edgeColors[i][j] = g;
//                            }
//                        }
//                         double scale = 255.0 / maxGradient;
//
//                for (int i = 1; i < x - 1; i++) {
//                    for (int j = 1; j < y - 1; j++) {
//                        int edgeColor = edgeColors[i][j];
//                        edgeColor = (int)(edgeColor * scale);
//                        edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;
//
//                         System.out.println("Edge color : " + edgeColor);
//                        image.setRGB(i, j, edgeColor);
//                    }
//                }

    
}
