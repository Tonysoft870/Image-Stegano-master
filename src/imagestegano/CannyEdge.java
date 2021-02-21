/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagestegano;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.nio.file.Files;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import steganography.CannyEdgeDetector;
import steganography.LSBEncoding;
import utility.ImageUtility;

/**
 *
 * @author user
 */
public class CannyEdge extends javax.swing.JFrame {

     JFileChooser fileChooser;
    File textFile;
    BufferedImage coverImage;
    ImageUtility imageUtility;
    ColorModel coverImageColorModel;
    File openedFile;
     BufferedImage edges;
       String edgeMask ="";
     
     CannyEdgeDetector cannyEdgeDetector = new CannyEdgeDetector();
     
    /**
     * Creates new form CannyEdge
     */
    public CannyEdge() {
        initComponents();
        
         fileChooser = new JFileChooser();
        imageUtility = new ImageUtility();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        chooseTextFileButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        secretMessageTextFiled = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chooseCoverImageButton = new javax.swing.JButton();
        hideTextButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textFileLabel = new javax.swing.JLabel();
        coverImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Choose a text File");

        chooseTextFileButton.setText("Choose text file");
        chooseTextFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseTextFileButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("OR");

        jLabel5.setText("Enter text to hide: ");

        jLabel1.setText("Choose Cover Image:");

        chooseCoverImageButton.setText("Choose Cover Image");
        chooseCoverImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCoverImageButtonActionPerformed(evt);
            }
        });

        hideTextButton.setText("Hide Text");
        hideTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideTextButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel3.setText("Canny Edge Text Encoding");

        textFileLabel.setForeground(new java.awt.Color(140, 56, 104));

        coverImageLabel.setForeground(new java.awt.Color(140, 56, 104));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secretMessageTextFiled, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chooseCoverImageButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coverImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(hideTextButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73)
                                .addComponent(chooseTextFileButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(chooseTextFileButton))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secretMessageTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chooseCoverImageButton)
                        .addComponent(jLabel1))
                    .addComponent(coverImageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(hideTextButton)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseTextFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseTextFileButtonActionPerformed
        fileChooser.setDialogTitle("Choose a plain Text File");
        TextFileFilter filter = new TextFileFilter();
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            textFile = fileChooser.getSelectedFile();
            String name = textFile.getName();
            textFileLabel.setText(name);
        }
    }//GEN-LAST:event_chooseTextFileButtonActionPerformed

    private void chooseCoverImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCoverImageButtonActionPerformed
        fileChooser.setDialogTitle("Select an image");
        ImageFileFilter imageFilter = new ImageFileFilter();
        fileChooser.setFileFilter(imageFilter);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            openedFile = fileChooser.getSelectedFile();
            String name = openedFile.getName();
            try {
                if (imageFilter.isPNGOrBMPImage(name)) {
                    coverImage = ImageIO.read(openedFile);

                    // converting original image to suitable type
                    BufferedImage currentImage
                    = imageUtility.convertImage(coverImage);
                    if (currentImage != null) {
                        coverImage = currentImage;
                    }

                    coverImageColorModel = coverImage.getColorModel();
                    coverImageLabel.setText(name + ", size: "
                        + openedFile.length() / 1024 + " KB, "
                        + coverImage.getWidth() + "X"
                        + coverImage.getHeight());
                } else {
                    alert("Please select only .png or .bmp image");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_chooseCoverImageButtonActionPerformed
            
     private void alert(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void hideTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hideTextButtonActionPerformed
        if (coverImage == null) {
            alert("No cover Image selected");
            return;
        }
        String secretMessage = "";
        if (textFile == null) {
            secretMessage = secretMessageTextFiled.getText();
            if (secretMessage.equals("")) {
                alert("Enter secret message to hide");
                return;
            }
        } else {
            try {

                byte[] encoded = Files.readAllBytes(textFile.toPath());
                secretMessage = new String(encoded);
                //alert("" + secretMessage);
                // System.out.println("" + secretMessage);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
      //  LSBEncoding lsbEncoding = new LSBEncoding();
        
        
                    cannyEdgeDetector.setLowThreshold(0.5f);
                    cannyEdgeDetector.setHighThreshold(0.5f);
                //apply it to an image
                    cannyEdgeDetector.setSourceImage(coverImage);
                    cannyEdgeDetector.process();
                      edgeMask = cannyEdgeDetector.resultWithPadding;
                      //int edd = Integer.parseInt(edgeMask);
                      //int answer = Math.abs(edd);
                  System.out.println("Edge color : " + edgeMask);
                    edges = cannyEdgeDetector.getEdgesImage();
                    edges = new ImageUtility().convertImage(edges);
              
               
                int bitArray[] = new int[8];
                bitArray[1] = 1;
                 encodeText(coverImage, secretMessage, bitArray);
//        lsbEncoding.encodeText(coverImage, secretMessage, bitArray);
       saveImage();

    }//GEN-LAST:event_hideTextButtonActionPerformed

     public void encodeText(BufferedImage coverImage, 
            String message, int bitArray[]) {
        byte image[] = imageUtility.getByteData(coverImage);
        byte payload[] = message.getBytes();
        int offset = 0;
        int imageLength = image.length;
        boolean data[] = convertToBits(payload);
        // byte cannyedge[] = imageUtility.getByteData(edges);
          
            
       
     //     System.out.println("secret message"+payload );
//           System.out.println(""+image );
        //    System.out.println(""+imageLength );
    //     System.out.println("secret message to bit"+data );
        int dataLength = data.length;
        int dataOverFlag = 0;
        for (int i = 0; i < imageLength && dataOverFlag == 0; i++) {
            for (int j = 7; j >= 0  && dataOverFlag == 0; j--) {
                if (bitArray[j] == 1) {
                    int mask = returnMask(j);
                    image[i] = (byte) ((image[i] & mask));
                    if (data[offset++]) {
                        image[i] = (byte) (image[i] | ~mask);
                    }
                    if (offset >= dataLength) {
                        dataOverFlag = 1;
                    }
                }
            }
        }
    }
     
     
     private int returnMask(int bit) {
        int mask = 0xFF;
        switch (bit) {
            case 0:
                mask = 0xFE;
                break;
            case 1:
                mask = 0xFD;
                break;
            case 2:
                mask = 0xFB;
                break;
            case 3:
                mask = 0xF7;
                break;
            case 4:
                mask = 0xEF;
                break;
            case 5:
                mask = 0xDF;
                break;
            case 6:
                mask = 0xBF;
                break;
            case 7:
                mask = 0x7F;
                break;
        }
        return mask;
    }
    
    private boolean[] convertToBits(byte payload[]) {
        boolean result[] = new boolean[8 * payload.length];
        int offset = 0;
        for (byte b: payload) {
            for (int i = 7; i >= 0; i--) {
                int singleBit = (b >> i) & 1;
                if (singleBit == 1) {
                    result[offset++] = true;
                } else {
                    result[offset++] = false;
                }
            }
        }
        return result;
    }
     
     
     
     
      private void saveImage() {
        if (coverImage == null) {
            return;
        }
        fileChooser.setDialogTitle("Choose a location");
        String oldFileName = openedFile.getName();
        String newFileName = imageUtility.getNewFileName(oldFileName);
        String path = openedFile.getAbsolutePath();
        path = path.substring(0, path.lastIndexOf(File.separator) + 1);
        File file = new File(path + newFileName);
        fileChooser.setSelectedFile(file);
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            String name = file.getName();
            if (imageUtility.isImage(name)) {
                imageUtility.saveImage(coverImage, file);
            } else {
                alert("Invalid file name");
            }

        } 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CannyEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CannyEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CannyEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CannyEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CannyEdge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseCoverImageButton;
    private javax.swing.JButton chooseTextFileButton;
    private javax.swing.JLabel coverImageLabel;
    private javax.swing.JButton hideTextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField secretMessageTextFiled;
    private javax.swing.JLabel textFileLabel;
    // End of variables declaration//GEN-END:variables
}
