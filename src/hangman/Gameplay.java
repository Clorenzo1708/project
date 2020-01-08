package hangman;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import music.MediaPlayer;

/**
 * @author e.famorcan
 */
public class Gameplay extends javax.swing.JFrame {

    //GLOBAL VARIABLES BELLOW
    private final int FORM_WIDTH = 1290;
    private final int FORM_HEIGHT = 720;

    private String guess;
    public JLabel[] deathLabels = new JLabel[4];
    public JButton[] letterButtons = new JButton[26];
    private boolean[] guessedSpots;
    private int trys = 0;
    private int numberLetter;

    public String word[] = {"wary", "vindicate", "abject", "aberration",
        "abjure", "abnegation", "abrogate", "abscond", "abstruse", "accede",
        "accost", "accretion", "acumen", "adamant", "admonish", "adumbrate",
        "adverse", "advocate", "affluent", "aggrandize", "alacrity", "alias",
        "tirade", "zephyr", "yoke", "fortuitous", "forbearance", "garrulous",
        "gratuitous", "hegemony", "heterogenous", "interlocutor", "pernicious",
        "quandary", "semaphore", "sanguine", "surfeit", "subjugate", "staid",
        "spurious", "vestige", "veracity", "upbraid", "utilitarian", "elicit",
        "elegy", "egregious", "expedient", "connive", "construe", "vestige",
        "upbraid", "pellucid", "paucity", "partisan", "fractious", "fortuitous",
        "forbearance", "gourmand", "grandiloquent", "expurgate", "fallacious",
        "fatuous", "fetter", "flagrant", "foil", "annex", "ambivalent", "amenable",
        "amorphous", "anachronistic", "anathema", "antiseptic", "cleave", "clamor",
        "circumvent", "circumscribe", "cogent", "cognizant", "conduit", "debacle",
        "debauch", "dearth", "cupidity", "divisive", "disrepute", "dispel",
        "disparate", "edict", "egregious", "ebullient", "emollient",
        "enfranchise", "expedient", "impute", "inexorable", "interlocutor",
        "legerdemain", "litigant", "modicum"};

    public int number = random();

    /**
     * Creates new form Gameplay
     */
    public Gameplay() {
        initComponents();

        setForm();

//        lbllife.setText("Life: " + trys);
        lblWord.setText("Word: ");//set the lblword to say "word"
        guessedSpots = new boolean[word[number].length()];//create an array

        deathLabels[0] = lblRope;
        deathLabels[1] = lblHead;
        deathLabels[2] = lblBody;
        deathLabels[3] = lblLegs;

        letterButtons[0] = btnA;
        letterButtons[1] = btnB;
        letterButtons[2] = btnC;
        letterButtons[3] = btnD;
        letterButtons[4] = btnE;
        letterButtons[5] = btnF;
        letterButtons[6] = btnG;
        letterButtons[7] = btnH;
        letterButtons[8] = btnI;
        letterButtons[9] = btnJ;
        letterButtons[10] = btnK;
        letterButtons[11] = btnL;
        letterButtons[12] = btnM;
        letterButtons[13] = btnN;
        letterButtons[14] = btnO;
        letterButtons[15] = btnP;
        letterButtons[16] = btnQ;
        letterButtons[17] = btnR;
        letterButtons[18] = btnS;
        letterButtons[19] = btnT;
        letterButtons[10] = btnU;
        letterButtons[21] = btnV;
        letterButtons[22] = btnW;
        letterButtons[23] = btnX;
        letterButtons[24] = btnY;
        letterButtons[25] = btnZ;

//       for (int i = 0; i < letterButtons.length; i++) {
//            letterButtons[i].setVisible(true);
//        }
        for (int i = 0; i < deathLabels.length; i++) {
            deathLabels[i].setVisible(false);
        }

        for (int i = 0; i < guessedSpots.length; i++)// Fill in the array 
        {
            guessedSpots[i] = false;//for every spots of array puts false for now 
        }

        reveal();//reveal the letter
        setForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWord = new javax.swing.JLabel();
        lbloutput = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        lblLegs = new javax.swing.JLabel();
        lblBody = new javax.swing.JLabel();
        lblRope = new javax.swing.JLabel();
        btnM = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblWord.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        lblWord.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblWord);
        lblWord.setBounds(30, 520, 530, 100);

        lbloutput.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbloutput.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbloutput);
        lbloutput.setBounds(790, 360, 370, 70);

        lblHead.setForeground(new java.awt.Color(255, 255, 255));
        lblHead.setText("Head");
        getContentPane().add(lblHead);
        lblHead.setBounds(200, 210, 30, 20);

        lblLegs.setText("Legs");
        getContentPane().add(lblLegs);
        lblLegs.setBounds(200, 230, 30, 20);

        lblBody.setText("Body");
        getContentPane().add(lblBody);
        lblBody.setBounds(200, 270, 23, 20);

        lblRope.setText("Rope");
        getContentPane().add(lblRope);
        lblRope.setBounds(200, 250, 30, 20);

        btnM.setBackground(new java.awt.Color(0, 0, 0));
        btnM.setForeground(new java.awt.Color(255, 255, 255));
        btnM.setText("M");
        btnM.setBorderPainted(false);
        btnM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        getContentPane().add(btnM);
        btnM.setBounds(710, 590, 50, 50);

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1200, 10, 73, 23);

        btnT.setBackground(new java.awt.Color(0, 0, 0));
        btnT.setForeground(new java.awt.Color(255, 255, 255));
        btnT.setText("T");
        btnT.setBorderPainted(false);
        btnT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        getContentPane().add(btnT);
        btnT.setBounds(710, 660, 50, 50);

        btnU.setBackground(new java.awt.Color(0, 0, 0));
        btnU.setForeground(new java.awt.Color(255, 255, 255));
        btnU.setText("U");
        btnU.setBorderPainted(false);
        btnU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        getContentPane().add(btnU);
        btnU.setBounds(780, 660, 50, 50);

        btnO.setBackground(new java.awt.Color(0, 0, 0));
        btnO.setForeground(new java.awt.Color(255, 255, 255));
        btnO.setText("O");
        btnO.setBorderPainted(false);
        btnO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        getContentPane().add(btnO);
        btnO.setBounds(850, 590, 50, 50);

        btnN.setBackground(new java.awt.Color(0, 0, 0));
        btnN.setForeground(new java.awt.Color(255, 255, 255));
        btnN.setText("N");
        btnN.setBorderPainted(false);
        btnN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        getContentPane().add(btnN);
        btnN.setBounds(780, 590, 50, 50);

        btnZ.setBackground(new java.awt.Color(0, 0, 0));
        btnZ.setForeground(new java.awt.Color(255, 255, 255));
        btnZ.setText("Z");
        btnZ.setBorderPainted(false);
        btnZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        getContentPane().add(btnZ);
        btnZ.setBounds(1150, 660, 50, 50);

        btnA.setBackground(new java.awt.Color(0, 0, 0));
        btnA.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 51, 51));
        btnA.setText("A");
        btnA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA.setBorderPainted(false);
        btnA.setContentAreaFilled(false);
        btnA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA);
        btnA.setBounds(780, 450, 50, 50);

        btnW.setBackground(new java.awt.Color(0, 0, 0));
        btnW.setForeground(new java.awt.Color(255, 255, 255));
        btnW.setText("W");
        btnW.setBorderPainted(false);
        btnW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        getContentPane().add(btnW);
        btnW.setBounds(920, 660, 50, 50);

        btnE.setBackground(new java.awt.Color(0, 0, 0));
        btnE.setForeground(new java.awt.Color(255, 255, 255));
        btnE.setText("E");
        btnE.setBorderPainted(false);
        btnE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        getContentPane().add(btnE);
        btnE.setBounds(1080, 450, 50, 50);

        btnG.setBackground(new java.awt.Color(0, 0, 0));
        btnG.setForeground(new java.awt.Color(255, 255, 255));
        btnG.setText("G");
        btnG.setBorderPainted(false);
        btnG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        getContentPane().add(btnG);
        btnG.setBounds(780, 520, 50, 50);

        btnR.setBackground(new java.awt.Color(0, 0, 0));
        btnR.setForeground(new java.awt.Color(255, 255, 255));
        btnR.setText("R");
        btnR.setBorderPainted(false);
        btnR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        getContentPane().add(btnR);
        btnR.setBounds(1080, 590, 50, 50);

        btnP.setBackground(new java.awt.Color(0, 0, 0));
        btnP.setForeground(new java.awt.Color(255, 255, 255));
        btnP.setText("P");
        btnP.setBorderPainted(false);
        btnP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        getContentPane().add(btnP);
        btnP.setBounds(920, 590, 50, 50);

        btnL.setBackground(new java.awt.Color(0, 0, 0));
        btnL.setForeground(new java.awt.Color(255, 255, 255));
        btnL.setText("L");
        btnL.setBorderPainted(false);
        btnL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        getContentPane().add(btnL);
        btnL.setBounds(1150, 520, 50, 50);

        btnQ.setBackground(new java.awt.Color(0, 0, 0));
        btnQ.setForeground(new java.awt.Color(255, 255, 255));
        btnQ.setText("Q");
        btnQ.setBorderPainted(false);
        btnQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ);
        btnQ.setBounds(1000, 590, 50, 50);

        btnX.setBackground(new java.awt.Color(0, 0, 0));
        btnX.setForeground(new java.awt.Color(255, 255, 255));
        btnX.setText("X");
        btnX.setBorderPainted(false);
        btnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        getContentPane().add(btnX);
        btnX.setBounds(1000, 660, 50, 50);

        btnB.setBackground(new java.awt.Color(0, 0, 0));
        btnB.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 51, 51));
        btnB.setText("B");
        btnB.setBorderPainted(false);
        btnB.setContentAreaFilled(false);
        btnB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB);
        btnB.setBounds(840, 450, 60, 60);

        btnK.setBackground(new java.awt.Color(0, 0, 0));
        btnK.setForeground(new java.awt.Color(255, 255, 255));
        btnK.setText("K");
        btnK.setBorderPainted(false);
        btnK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        getContentPane().add(btnK);
        btnK.setBounds(1080, 520, 50, 50);

        btnV.setBackground(new java.awt.Color(0, 0, 0));
        btnV.setForeground(new java.awt.Color(255, 255, 255));
        btnV.setText("V");
        btnV.setBorderPainted(false);
        btnV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        getContentPane().add(btnV);
        btnV.setBounds(850, 660, 50, 50);

        btnI.setBackground(new java.awt.Color(0, 0, 0));
        btnI.setForeground(new java.awt.Color(255, 255, 255));
        btnI.setText("I");
        btnI.setBorderPainted(false);
        btnI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        getContentPane().add(btnI);
        btnI.setBounds(920, 520, 50, 50);

        btnS.setBackground(new java.awt.Color(0, 0, 0));
        btnS.setForeground(new java.awt.Color(255, 255, 255));
        btnS.setText("S");
        btnS.setBorderPainted(false);
        btnS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        getContentPane().add(btnS);
        btnS.setBounds(1150, 590, 50, 50);

        btnY.setBackground(new java.awt.Color(0, 0, 0));
        btnY.setForeground(new java.awt.Color(255, 255, 255));
        btnY.setText("Y");
        btnY.setBorderPainted(false);
        btnY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        getContentPane().add(btnY);
        btnY.setBounds(1080, 660, 50, 50);

        btnH.setBackground(new java.awt.Color(0, 0, 0));
        btnH.setForeground(new java.awt.Color(255, 255, 255));
        btnH.setText("H");
        btnH.setBorderPainted(false);
        btnH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        getContentPane().add(btnH);
        btnH.setBounds(850, 520, 50, 50);

        btnF.setBackground(new java.awt.Color(0, 0, 0));
        btnF.setForeground(new java.awt.Color(255, 255, 255));
        btnF.setText("F");
        btnF.setBorderPainted(false);
        btnF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        getContentPane().add(btnF);
        btnF.setBounds(710, 520, 50, 50);

        btnD.setBackground(new java.awt.Color(0, 0, 0));
        btnD.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 0, 51));
        btnD.setText("D");
        btnD.setBorderPainted(false);
        btnD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD);
        btnD.setBounds(990, 450, 60, 50);

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 51, 51));
        btnC.setText("C");
        btnC.setBorderPainted(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC);
        btnC.setBounds(920, 450, 60, 60);

        btnJ.setBackground(new java.awt.Color(0, 0, 0));
        btnJ.setForeground(new java.awt.Color(255, 255, 255));
        btnJ.setText("J");
        btnJ.setBorderPainted(false);
        btnJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ);
        btnJ.setBounds(1000, 520, 50, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/85219859e5edf9deb03a68b5f33d9d94.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -20, 1280, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        check("M");


    }//GEN-LAST:event_btnMActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        check("D");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        check("J");
    }//GEN-LAST:event_btnJActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        check("O");
    }//GEN-LAST:event_btnOActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        check("Q");
    }//GEN-LAST:event_btnQActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        check("U");
    }//GEN-LAST:event_btnUActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        check("W");
    }//GEN-LAST:event_btnWActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        check("Z");
        numberLetter = 25;
    }//GEN-LAST:event_btnZActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        check("A");
        numberLetter = 0;
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        check("B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        check("C");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        check("E");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        check("F");
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        check("G");
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        check("H");
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        check("I");
    }//GEN-LAST:event_btnIActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        check("K");
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        check("L");
    }//GEN-LAST:event_btnLActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        check("N");
    }//GEN-LAST:event_btnNActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        check("P");
    }//GEN-LAST:event_btnPActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        check("R");
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        check("S");
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        check("T");
    }//GEN-LAST:event_btnTActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        check("V");
    }//GEN-LAST:event_btnVActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        check("X");
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        check("Y");

    }//GEN-LAST:event_btnYActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBody;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLegs;
    private javax.swing.JLabel lblRope;
    private javax.swing.JLabel lblWord;
    private javax.swing.JLabel lbloutput;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the form
     */
    private void setForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        MediaPlayer music = new MediaPlayer();
        

    }

    /**
     * if the user clicked the right letter it reveals it
     *
     */
    private void reveal() {
        String newWord = "";

        System.out.println(newWord);

        for (int i = 0; i < guessedSpots.length; i++) {
            if (guessedSpots[i] == true) {
                newWord += word[number].charAt(i) + " ";

            } else {

                newWord += "_ ";

            }
        }
        lblWord.setText("Word: " + newWord);

    }

    /**
     *
     * @param letter
     *
     */
    private void check(String btnletter) {
        boolean correct = false;
        lbloutput.setText(btnletter);
        System.out.println("The word is: " + word[number]);
        

        for (int i = 0; i < word[number].length(); i++) {
            String currentLetter = "" + word[number].charAt(i);

            System.out.println("The " + i + "th letter has been "
                    + guessedSpots[i] + " guessed");

            if (currentLetter.equalsIgnoreCase(btnletter)) {
                guessedSpots[i] = true;
                reveal();
                correct = true;

            }
            

        }

        if (correct == true) {
            return;
        } else {
            trys++;
//            lbllife.setText("Trys: " + trys);

//            letterButtons[numberLetter].setVisible(false);
System.out.println(trys);

            deathLabels[trys - 1].setVisible(true);

            if (trys == 4) {
                JOptionPane.showMessageDialog(null,
                        "He's dead \n The word was " + word[number]);

                this.dispose();
                GameOver gameover = new GameOver();
                return;
            } 
            
            else
            {
                reveal();
                return;

            }
        }
    }

    /**
     * comment later
     *
     * @return
     */
    private int random() {
        double seed = Math.random();
        double low = 0;
        double high = 99;
        double random = (high - low + 1) * seed + low;
        int roll = (int) random;
        return roll;
    }

}
