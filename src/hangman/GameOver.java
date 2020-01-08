package hangman;

/**
 * @author e.famorcan
 */
public class GameOver extends javax.swing.JFrame {

    private final int FORM_WIDTH = 1030;
    private final int FORM_HEIGHT = 790;

    /**
     * Creates new form GameOver
     */
    public GameOver() {
        initComponents();
        setForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnplayAgain = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblgameOver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnplayAgain.setBackground(new java.awt.Color(0, 0, 0));
        btnplayAgain.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        btnplayAgain.setForeground(new java.awt.Color(204, 204, 204));
        btnplayAgain.setText("Play Again");
        btnplayAgain.setBorderPainted(false);
        btnplayAgain.setContentAreaFilled(false);
        btnplayAgain.setFocusPainted(false);
        btnplayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayAgainActionPerformed(evt);
            }
        });
        getContentPane().add(btnplayAgain);
        btnplayAgain.setBounds(320, 690, 220, 70);

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 204, 204));
        btnExit.setText("Exit");
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(580, 690, 130, 70);

        lblgameOver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/GAMEOVER.gif"))); // NOI18N
        getContentPane().add(lblgameOver);
        lblgameOver.setBounds(0, 0, 1030, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        RUSure rusure = new RUSure();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnplayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayAgainActionPerformed
        this.dispose();
        Gameplay gameplay = new Gameplay();
    }//GEN-LAST:event_btnplayAgainActionPerformed

    /**
     * setups the form
     */
    private void setForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnplayAgain;
    private javax.swing.JLabel lblgameOver;
    // End of variables declaration//GEN-END:variables
}
