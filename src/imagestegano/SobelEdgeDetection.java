///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package imagestegano;
//
///**
// *
// * @author user
// */
//import java.io.File;
//import java.io.InputStream;
//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.highgui.HighGui;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;
//public class SobelEdgeDetection {
//   public static void main(String args[]) {
//      //Loading the OpenCV core library
//       // loadLibraries();
//      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
//      String file ="D:\\Images\\win2.jpg";
//      Mat src = Imgcodecs.imread(file);
//      //Creating an empty matrix for the destination image
//      Mat dst = new Mat();
//      //Applying sobel derivative with values x:0 y:1
//      Imgproc.Sobel(src, dst, -1, 0, 1);
//      HighGui.imshow("Sobel - x:0 & y:1 ", dst);
//      HighGui.waitKey();
//      //Applying sobel derivative with values x:1 y:0
//      Imgproc.Sobel(src, dst, -1, 1, 0);
//      HighGui.imshow("Sobel - x:1 & y:0 ", dst);
//      HighGui.waitKey();
//      //Applying sobel derivative with values x:1 y:1
//      Imgproc.Sobel(src, dst, -1, 1, 1);
//      HighGui.imshow("Sobel - x:1 & y:1 ", dst);
//      HighGui.waitKey();
//   }
//   
//   private static void loadLibraries() {
//
//    try {
//        InputStream in = null;
//        File fileOut = null;
//        String osName = System.getProperty("os.name");
//        String opencvpath = System.getProperty("user.dir");
//        if(osName.startsWith("Windows")) {
//            int bitness = Integer.parseInt(System.getProperty("sun.arch.data.model"));
//            if(bitness == 32) {
//                opencvpath=opencvpath+"\\opencv\\x86\\";
//            }
//            else if (bitness == 64) { 
//                opencvpath=opencvpath+"\\opencv\\x64\\";
//            } else { 
//                opencvpath=opencvpath+"\\opencv\\x86\\"; 
//            }           
//        } 
//        else if(osName.equals("Mac OS X")){
//            opencvpath = opencvpath+"Your path to .dylib";
//        }
//        System.out.println(opencvpath);
//        System.load(opencvpath + Core.NATIVE_LIBRARY_NAME + ".dll");
//    } catch (Exception e) {
//        throw new RuntimeException("Failed to load opencv native library", e);
//    }
//}
//}