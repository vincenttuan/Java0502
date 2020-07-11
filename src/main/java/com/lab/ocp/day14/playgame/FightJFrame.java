package com.lab.ocp.day14.playgame;

import javax.swing.ImageIcon;

public class FightJFrame extends javax.swing.JFrame {

    boolean isReady = true;
    boolean isRunning = false;
    private ImageIcon[] icon_ready = {
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\ready_0.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\ready_1.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\ready_2.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\ready_3.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\ready_4.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\ready_5.png"),};

    private ImageIcon[] icon_fight = {
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\fight_0.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\fight_1.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\fight_2.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\fight_3.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\fight_4.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\fight_5.png"),};

    private ImageIcon[] icon_running = {
        //new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_0.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_1.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_2.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_3.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_4.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_5.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_6.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day14\\playgame\\images\\running_7.png"),};

    class Ready extends Thread {

        @Override
        public void run() {
            for (int i = 0;;) {
                if (isRunning) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    continue;
                }
                i = i % icon_ready.length;
                if (isReady) {
                    actor.setIcon(icon_ready[i]);
                } else {
                    actor.setIcon(icon_fight[i]);
                }
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                i++;
            }
        }
    }

    class Running extends Thread {

        @Override
        public void run() {
            for (int i = 0;;) {
                if (!isRunning) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    continue;
                }
                i = i % icon_running.length;
                actor.setIcon(icon_running[i]);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                i++;

            }
        }
    }

    public FightJFrame() {
        initComponents();
        actor.setIcon(icon_ready[0]);
        new Ready().start();
        new Running().start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actorMousePressed(evt);
            }
        });

        jButton1.setText("跑步");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actorMousePressed
        isRunning = false;
        isReady = !isReady;
    }//GEN-LAST:event_actorMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 按下跑步鍵
        isRunning = true;
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actor;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
