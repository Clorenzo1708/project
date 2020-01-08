package hangman;

/**
 * @author e.famorcan
 */
public class RUSure extends javax.swing.JFrame {

    private final int FORM_WIDTH = 1100;
    private final int FORM_HEIGHT = 750;
    
    /**
     * Creates new form RUSure
     */
    public RUSure() {
        initComponents();
        setForm(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnyes = new javax.swing.JButton();
        btnno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Are you sure you want to exit?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 0, 760, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/sad skeleton.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 50, 280, 380);

        btnyes.setBackground(new java.awt.Color(255, 255, 255));
        btnyes.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        btnyes.setText("YES");
        btnyes.setBorderPainted(false);
        btnyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyesActionPerformed(evt);
            }
        });
        getContentPane().add(btnyes);
        btnyes.setBounds(220, 490, 230, 120);

        btnno.setBackground(new java.awt.Color(255, 255, 255));
        btnno.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        btnno.setText("NO");
        btnno.setBorderPainted(false);
        btnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnno);
        btnno.setBounds(630, 490, 230, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/white.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyesActionPerformed
        System.exit(0);     
    }//GEN-LAST:event_btnyesActionPerformed

    private void btnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoActionPerformed
        this.dispose();
        GameOver gameover = new GameOver();
    }//GEN-LAST:event_btnnoActionPerformed

    /**
     * sets the form
     */
    private void setForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnno;
    private javax.swing.JButton btnyes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
