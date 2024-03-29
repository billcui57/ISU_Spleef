import java.awt.Color;
import javax.swing.ImageIcon;
import sun.audio.AudioPlayer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billc
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        drawingArea1.timer();
        drawingArea1.t1.start();
        this.setTitle("Smashing!");
        ImageIcon img = new ImageIcon("sprite_00.png");
        this.setIconImage(img.getImage());
        this.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingArea1 = new DrawingArea();
        MapChoice1Butt = new javax.swing.JButton();
        MapChoice2Butt = new javax.swing.JButton();
        MapChoice3Butt = new javax.swing.JButton();
        SeePastGamesButt = new javax.swing.JButton();
        RestartButt = new javax.swing.JButton();
        MainMenuButt = new javax.swing.JButton();
        QuitButt = new javax.swing.JButton();
        TutorialButton = new javax.swing.JButton();
        NextPageButton = new javax.swing.JButton();
        PreviousPageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 920));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        drawingArea1.setName(""); // NOI18N
        drawingArea1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drawingArea1MouseMoved(evt);
            }
        });

        MapChoice1Butt.setFocusable(false);
        MapChoice1Butt.setText("Country");
        MapChoice1Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapChoice1ButtActionPerformed(evt);
            }
        });

        MapChoice2Butt.setFocusable(false);
        MapChoice2Butt.setText("Heavens");
        MapChoice2Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapChoice2ButtActionPerformed(evt);
            }
        });

        MapChoice3Butt.setFocusable(false);
        MapChoice3Butt.setText("Hell");
        MapChoice3Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapChoice3ButtActionPerformed(evt);
            }
        });

        SeePastGamesButt.setFocusable(false);
        SeePastGamesButt.setText("See Past Games");
        SeePastGamesButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeePastGamesButtActionPerformed(evt);
            }
        });

        RestartButt.setFocusable(false);
        RestartButt.setVisible(false);
        RestartButt.setText("Restart");
        RestartButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtActionPerformed(evt);
            }
        });

        MainMenuButt.setFocusable(false);
        MainMenuButt.setVisible(false);
        MainMenuButt.setText("Main Menu");
        MainMenuButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtActionPerformed(evt);
            }
        });

        QuitButt.setFocusable(false);
        QuitButt.setVisible(false);
        QuitButt.setText("Quit Game");
        QuitButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtActionPerformed(evt);
            }
        });

        TutorialButton.setText("Tutorial");
        TutorialButton.setFocusable(false);
        TutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialButtonActionPerformed(evt);
            }
        });

        NextPageButton.setVisible(false);
        NextPageButton.setText("Next Page");
        NextPageButton.setFocusable(false);
        NextPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextPageButtonActionPerformed(evt);
            }
        });

        PreviousPageButton.setVisible(false);
        PreviousPageButton.setFocusable(false);
        PreviousPageButton.setText("Previous Page");
        PreviousPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drawingArea1Layout = new javax.swing.GroupLayout(drawingArea1);
        drawingArea1.setLayout(drawingArea1Layout);
        drawingArea1Layout.setHorizontalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingArea1Layout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addGroup(drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingArea1Layout.createSequentialGroup()
                        .addComponent(PreviousPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NextPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingArea1Layout.createSequentialGroup()
                        .addGroup(drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SeePastGamesButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TutorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(499, 499, 499))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingArea1Layout.createSequentialGroup()
                        .addGroup(drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MapChoice2Butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MapChoice1Butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MapChoice3Butt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(QuitButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MainMenuButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RestartButt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(512, 512, 512))))
        );
        drawingArea1Layout.setVerticalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingArea1Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(RestartButt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainMenuButt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuitButt)
                .addGap(18, 18, 18)
                .addComponent(MapChoice1Butt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MapChoice2Butt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MapChoice3Butt)
                .addGap(102, 102, 102)
                .addComponent(SeePastGamesButt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TutorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addGroup(drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NextPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(PreviousPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(drawingArea1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        
        //player stops moving
        switch (evt.getKeyCode()) {
            case 65:
            case 68:
                drawingArea1.player1.stop();
                break;

            case 37:
            case 39:
                drawingArea1.player2.stop();
                break;

        }


    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        //user inputs
        switch (evt.getKeyCode()) {
            case 87:
                drawingArea1.player1.jump();
                break;
            case 65:
                drawingArea1.player1.moveLeft();
                break;
            case 68:
                drawingArea1.player1.moveRight();
                break;
            case 32:
                if (drawingArea1.gun1.canShoot == true) {
                    drawingArea1.gun1.shoot(drawingArea1.player1.playerx, drawingArea1.player1.playery, drawingArea1.player1.faceDirection);
                    try{
                    drawingArea1.gun1.pew();
                    }catch(Exception e){
                        
                    };
                }
                break;
            case 38:
                drawingArea1.player2.jump();
                break;
            case 37:
                drawingArea1.player2.moveLeft();
                break;
            case 39:
                drawingArea1.player2.moveRight();
                break;
            case 76:
                if (drawingArea1.gun2.canShoot == true) {
                    drawingArea1.gun2.shoot(drawingArea1.player2.playerx, drawingArea1.player2.playery, drawingArea1.player2.faceDirection);
                    try{
                    drawingArea1.gun2.pew();
                    }catch(Exception e){
                        
                    };
                }
                break;

            case 27:
                //user presses esc for pause menu
                if ((drawingArea1.scene == 2)) {
                    drawingArea1.scene = 4;
                    MainMenuButt.setVisible(true);
                    QuitButt.setVisible(true);
                    RestartButt.setVisible(true);
                    drawingArea1.t1.start();
                } else if (drawingArea1.scene == 4) {
                    drawingArea1.scene = 2;
                    MainMenuButt.setVisible(false);
                    QuitButt.setVisible(false);
                    RestartButt.setVisible(false);
                } else if ((drawingArea1.scene == 3)||(drawingArea1.scene == 5)||(drawingArea1.scene == 6)) {
                     drawingArea1.scene =1;
                    MapChoice1Butt.setVisible(true);
                    MapChoice2Butt.setVisible(true);
                    MapChoice3Butt.setVisible(true);
                    SeePastGamesButt.setVisible(true);
                    TutorialButton.setVisible(true);
                    PreviousPageButton.setVisible(false);
                    NextPageButton.setVisible(false);
                } 

                break;
        }


    }//GEN-LAST:event_formKeyPressed

    private void drawingArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingArea1MousePressed
        // TODO add your handling code here:
        
        //developer tool for manually removing tiles
        for (int y = -10; y < 11; y++) {
            for (int x = -10; x < 11; x++) {
                drawingArea1.ground[evt.getY() + y][evt.getX() + x] = false;

                int rgb = new Color(214, 217, 223).getRGB();
                drawingArea1.map.setRGB(evt.getX() + x, evt.getY() + y, rgb);

            }
        }
    }//GEN-LAST:event_drawingArea1MousePressed

    private void MapChoice1ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapChoice1ButtActionPerformed
        // TODO add your handling code here:
        
        //Country map
        drawingArea1.runGameStartUp = true;
        drawingArea1.mapName = "Map.png";
        MapChoice1Butt.setVisible(false);
        MapChoice2Butt.setVisible(false);
        MapChoice3Butt.setVisible(false);
        SeePastGamesButt.setVisible(false);
        TutorialButton.setVisible(false);
    }//GEN-LAST:event_MapChoice1ButtActionPerformed

    private void MapChoice2ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapChoice2ButtActionPerformed
        // TODO add your handling code here:
        
        //Heaven map
        drawingArea1.runGameStartUp = true;
        drawingArea1.mapName = "map_sky.png";
        MapChoice1Butt.setVisible(false);
        MapChoice2Butt.setVisible(false);
        MapChoice3Butt.setVisible(false);
        SeePastGamesButt.setVisible(false);
        TutorialButton.setVisible(false);
    }//GEN-LAST:event_MapChoice2ButtActionPerformed

    private void MapChoice3ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapChoice3ButtActionPerformed
        // TODO add your handling code here:
        
        //Hell map
        drawingArea1.runGameStartUp = true;
        drawingArea1.mapName = "map hell.png";
        MapChoice1Butt.setVisible(false);
        MapChoice2Butt.setVisible(false);
        MapChoice3Butt.setVisible(false);
        SeePastGamesButt.setVisible(false);
        TutorialButton.setVisible(false);
    }//GEN-LAST:event_MapChoice3ButtActionPerformed

    private void SeePastGamesButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeePastGamesButtActionPerformed
        // TODO add your handling code here:
        
        //Button to see past games
        drawingArea1.scene = 3;

        MapChoice1Butt.setVisible(false);
        MapChoice2Butt.setVisible(false);
        MapChoice3Butt.setVisible(false);
        SeePastGamesButt.setVisible(false);
        TutorialButton.setVisible(false);
    }//GEN-LAST:event_SeePastGamesButtActionPerformed

    private void RestartButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtActionPerformed
        // TODO add your handling code here:
        
        //Button to restart
        drawingArea1.restart();
        drawingArea1.scene = 2;

        MainMenuButt.setVisible(false);
        QuitButt.setVisible(false);
        RestartButt.setVisible(false);


    }//GEN-LAST:event_RestartButtActionPerformed

    private void MainMenuButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtActionPerformed
        // TODO add your handling code here:
        
        //Button to go to main menu
        drawingArea1.scene = 1;
        MapChoice1Butt.setVisible(true);
        MapChoice2Butt.setVisible(true);
        MapChoice3Butt.setVisible(true);
        SeePastGamesButt.setVisible(true);
        MainMenuButt.setVisible(false);
        QuitButt.setVisible(false);
        RestartButt.setVisible(false);
        TutorialButton.setVisible(true);
    }//GEN-LAST:event_MainMenuButtActionPerformed

    private void QuitButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtActionPerformed
        // TODO add your handling code here:
        
        //Button to quit
        System.exit(0);
    }//GEN-LAST:event_QuitButtActionPerformed

    private void drawingArea1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingArea1MouseMoved
        // TODO add your handling code here:
        
        //place holder for future rocket movement that follows mouse
    }//GEN-LAST:event_drawingArea1MouseMoved

    private void TutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialButtonActionPerformed
        // TODO add your handling code here:
        drawingArea1.scene=5;
        TutorialButton.setVisible(false);
        MapChoice1Butt.setVisible(false);
        MapChoice2Butt.setVisible(false);
        MapChoice3Butt.setVisible(false);
        SeePastGamesButt.setVisible(false);
        PreviousPageButton.setVisible(true);
        NextPageButton.setVisible(true);
    }//GEN-LAST:event_TutorialButtonActionPerformed

    private void PreviousPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousPageButtonActionPerformed
        // TODO add your handling code here:
        drawingArea1.scene=5;
       
    }//GEN-LAST:event_PreviousPageButtonActionPerformed

    private void NextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextPageButtonActionPerformed
        // TODO add your handling code here:
        drawingArea1.scene=6;
       
    }//GEN-LAST:event_NextPageButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenuButt;
    private javax.swing.JButton MapChoice1Butt;
    private javax.swing.JButton MapChoice2Butt;
    private javax.swing.JButton MapChoice3Butt;
    private javax.swing.JButton NextPageButton;
    private javax.swing.JButton PreviousPageButton;
    private javax.swing.JButton QuitButt;
    private javax.swing.JButton RestartButt;
    private javax.swing.JButton SeePastGamesButt;
    private javax.swing.JButton TutorialButton;
    private DrawingArea drawingArea1;
    // End of variables declaration//GEN-END:variables
}
