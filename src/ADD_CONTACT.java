
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import static javax.swing.text.html.parser.DTDConstants.NUMBER;
import jdk.nashorn.internal.parser.TokenType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class ADD_CONTACT extends javax.swing.JFrame {

    /**
     * Creates new form add_contact
     */
    public ADD_CONTACT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MOB_NO_2 = new javax.swing.JLabel();
        AB = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        FN = new javax.swing.JTextField();
        MN = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        G = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        ADD1 = new javax.swing.JTextField();
        ADD2 = new javax.swing.JTextField();
        CITY = new javax.swing.JTextField();
        STATE = new javax.swing.JTextField();
        PC = new javax.swing.JTextField();
        MN1 = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        FNLABEL = new javax.swing.JLabel();
        MNLABEL = new javax.swing.JLabel();
        LNLABEL = new javax.swing.JLabel();
        GROUPLABEL = new javax.swing.JLabel();
        EIDLABEL = new javax.swing.JLabel();
        MN1LABEL = new javax.swing.JLabel();
        ADD1LABEL = new javax.swing.JLabel();
        ADD2LABEL = new javax.swing.JLabel();
        CITYLABEL = new javax.swing.JLabel();
        STATELABEL = new javax.swing.JLabel();
        PCLABEL = new javax.swing.JLabel();
        INSERTBUT = new javax.swing.JButton();
        EXITBUT = new javax.swing.JButton();
        MOB_ALT = new javax.swing.JButton();
        EMAIL_ALT = new javax.swing.JButton();
        DOBLABEL = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();

        MOB_NO_2.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/address2.jpg"))); // NOI18N

        jPanel1.setLayout(null);
        jPanel1.add(FN);
        FN.setBounds(160, 10, 160, 30);
        jPanel1.add(MN);
        MN.setBounds(160, 60, 160, 30);

        LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNActionPerformed(evt);
            }
        });
        jPanel1.add(LN);
        LN.setBounds(160, 110, 160, 30);
        jPanel1.add(G);
        G.setBounds(160, 160, 160, 30);

        DOB.setToolTipText("IN  YYYY-MM-DD FORMAT ONLY");
        DOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DOBKeyTyped(evt);
            }
        });
        jPanel1.add(DOB);
        DOB.setBounds(160, 210, 160, 30);
        jPanel1.add(ADD1);
        ADD1.setBounds(160, 260, 160, 30);
        jPanel1.add(ADD2);
        ADD2.setBounds(520, 10, 160, 30);
        jPanel1.add(CITY);
        CITY.setBounds(520, 60, 160, 30);
        jPanel1.add(STATE);
        STATE.setBounds(520, 110, 160, 30);

        PC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PCKeyTyped(evt);
            }
        });
        jPanel1.add(PC);
        PC.setBounds(520, 160, 160, 30);

        MN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MN1KeyTyped(evt);
            }
        });
        jPanel1.add(MN1);
        MN1.setBounds(520, 210, 160, 30);
        jPanel1.add(ID);
        ID.setBounds(520, 260, 160, 30);

        FNLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FNLABEL.setText("FIRST NAME");
        jPanel1.add(FNLABEL);
        FNLABEL.setBounds(30, 20, 80, 15);

        MNLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MNLABEL.setText("MIDDLE NAME");
        jPanel1.add(MNLABEL);
        MNLABEL.setBounds(30, 70, 87, 15);

        LNLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LNLABEL.setText("LAST NAME");
        jPanel1.add(LNLABEL);
        LNLABEL.setBounds(30, 120, 70, 15);

        GROUPLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GROUPLABEL.setText("GROUP");
        jPanel1.add(GROUPLABEL);
        GROUPLABEL.setBounds(30, 170, 42, 15);

        EIDLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EIDLABEL.setText("EMAIL ID");
        jPanel1.add(EIDLABEL);
        EIDLABEL.setBounds(360, 270, 60, 15);

        MN1LABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MN1LABEL.setText("MOBILE NUMBER");
        jPanel1.add(MN1LABEL);
        MN1LABEL.setBounds(360, 220, 110, 15);

        ADD1LABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADD1LABEL.setText("ADDRESS LINE 1");
        jPanel1.add(ADD1LABEL);
        ADD1LABEL.setBounds(30, 270, 110, 15);

        ADD2LABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADD2LABEL.setText("ADDRESS LINE 2");
        jPanel1.add(ADD2LABEL);
        ADD2LABEL.setBounds(360, 20, 110, 15);

        CITYLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CITYLABEL.setText("CITY");
        jPanel1.add(CITYLABEL);
        CITYLABEL.setBounds(360, 70, 60, 15);

        STATELABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        STATELABEL.setText("STATE");
        jPanel1.add(STATELABEL);
        STATELABEL.setBounds(360, 120, 38, 15);

        PCLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PCLABEL.setText("PIN CODE");
        jPanel1.add(PCLABEL);
        PCLABEL.setBounds(360, 170, 58, 15);

        INSERTBUT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        INSERTBUT.setText("INSERT CONTACT");
        INSERTBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTBUTActionPerformed(evt);
            }
        });
        jPanel1.add(INSERTBUT);
        INSERTBUT.setBounds(70, 310, 180, 40);

        EXITBUT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXITBUT.setText("BACK");
        EXITBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBUTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBUT);
        EXITBUT.setBounds(480, 310, 110, 40);

        MOB_ALT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MOB_ALT.setText("CLICK TO ADD ANOTHER MOBILE NUMBER");
        MOB_ALT.setEnabled(false);
        MOB_ALT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOB_ALTActionPerformed(evt);
            }
        });
        jPanel1.add(MOB_ALT);
        MOB_ALT.setBounds(20, 380, 290, 40);

        EMAIL_ALT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EMAIL_ALT.setText("CLICK TO ADD ANOTHER EMAIL ID");
        EMAIL_ALT.setEnabled(false);
        jPanel1.add(EMAIL_ALT);
        EMAIL_ALT.setBounds(390, 380, 290, 40);

        DOBLABEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DOBLABEL.setText("DATE OF BIRTH");
        jPanel1.add(DOBLABEL);
        DOBLABEL.setBounds(30, 220, 100, 15);

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jPanel1.add(BACKGROUND);
        BACKGROUND.setBounds(0, 0, 720, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  int n=(int)(Math.random()*10000);
  String con_id="C"+n;
public void addmob()
{
    String mob=MN1.getText();
   String m=JOptionPane.showInputDialog("ENTER YOUR MOBILE NUMBER");
   if(m.length()!=10)
   {
       JOptionPane.showMessageDialog(this,"ENTER VALID MOBILE NUMBER");
       addmob();
   }
   if(m.equals(mob))
   {
       JOptionPane.showMessageDialog(this,"NUMBER ALREADY ADDED");
       addmob();
   }
   else
   {
       try
          {         
             Class.forName("java.sql.Driver");
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/address","root","modi");
             Statement stmt=(Statement)con.createStatement();
             String q1="insert into mobile values('"+(con_id)+"','"+(m)+"')";
             stmt.execute(q1);
             JOptionPane.showMessageDialog(this,"MOBILE NUMBER ADDED");
          }
       catch(Exception e)
          {
             JOptionPane.showMessageDialog(this, e.getMessage());
             JOptionPane.showMessageDialog(this,"MOBILE NUMBER NOT INSERTED");
          }
   }
}

public void addemail()
{
   String em=ID.getText();
   String m=JOptionPane.showInputDialog("ENTER YOUR EMAIL ID");
   if(m.equals(em))
   {
       JOptionPane.showMessageDialog(this,"EMAIL ID ALREADY ADDED");
       addemail();
   }
   else
   {
       try
          {         
             Class.forName("java.sql.Driver");
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/address","root","modi");
             Statement stmt=(Statement)con.createStatement();
             String q1="insert into mobile values('"+(con_id)+"','"+(m)+"')";
             stmt.execute(q1);
             JOptionPane.showMessageDialog(this,"EMAIL ID ADDED");
          }
       catch(Exception e)
          {
             JOptionPane.showMessageDialog(this, e.getMessage());
             JOptionPane.showMessageDialog(this,"EMAIL ID NOT INSERTED");
          }
   }
}
    private void EXITBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBUTActionPerformed
      new FIRST_PAGE().show();
      this.dispose();
    }//GEN-LAST:event_EXITBUTActionPerformed

    private void INSERTBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTBUTActionPerformed
   
  if(FN.getText().isEmpty()==true || MN1.getText().isEmpty()==true)
    {
       JOptionPane.showMessageDialog(this,"PLEASE ENTER FIRST NAME AND MOBILE NUMBER");
    }
  else
    {    
       try
          {         
             Class.forName("java.sql.Driver");
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/address","root","modi");
             Statement stmt=(Statement)con.createStatement();
             String fn=FN.getText();          String mn=ADD2.getText();
             String ln=LN.getText();          String group=G.getText();
             String dob=DOB.getText();        String add1=ADD1.getText();
             String add2=MN.getText();        String pin=PC.getText();
             String city=CITY.getText();      String state=STATE.getText();
             String mob=MN1.getText();
             String em=ID.getText();
             String q="insert into contact values('"+(con_id)+"','"+(fn)+"','"+(mn)+"','"+(ln)+"','"+(group)+"','"+(add1)+"','"+(add2)+"','"+(city)+"','"+(state)+"','"+(dob)+"','"+(pin)+"')";
             stmt.execute(q);
             String q1="insert into mobile values('"+(con_id)+"','"+(mob)+"')";
             String q2="insert into email values('"+(con_id)+"','"+(em)+"')";
             stmt.execute(q2);
             stmt.execute(q1);
             JOptionPane.showMessageDialog(this,"RECORD INSERTED");          
          }
      catch(Exception e)
          {
             JOptionPane.showMessageDialog(this, e.getMessage());
             JOptionPane.showMessageDialog(this,"RECORD NOT INSERTED");             
          }
       int m=JOptionPane.showConfirmDialog(this,"DO YOU WANT TO ADD MORE MOBILE NUMBERS AND EMAIL ID's?","MESSAGE",JOptionPane.YES_NO_OPTION);
         if(m==JOptionPane.YES_OPTION)
         {
             MOB_ALT.setEnabled(true);
             EMAIL_ALT.setEnabled(true);
             INSERTBUT.setEnabled(false);
             FN.setEnabled(false);
             ADD2.setEnabled(false);
             LN.setEnabled(false);
             MN1.setEnabled(false);
             ADD1.setEnabled(false);
             MN.setEnabled(false);
             CITY.setEnabled(false);
             DOB.setEnabled(false);
             G.setEnabled(false);
             STATE.setEnabled(false);
             PC.setEnabled(false);
             ID.setEnabled(false);             
         }
         if(m==JOptionPane.NO_OPTION)
         {
             new FIRST_PAGE().show();
             this.dispose();
         }
        
     }
  
  
    }//GEN-LAST:event_INSERTBUTActionPerformed
 
    private void MOB_ALTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOB_ALTActionPerformed
        addmob();
    }//GEN-LAST:event_MOB_ALTActionPerformed

    private void LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNActionPerformed
    
    private void MN1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MN1KeyTyped
        char ch=evt.getKeyChar();
        if(!(ch>='0' && ch<='9'))
        {
            evt.consume();
        }
        int l=MN1.getText().length();
        if(l>9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_MN1KeyTyped

    private void PCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PCKeyTyped
        char ch=evt.getKeyChar();
        if(!(ch>='0' && ch<='9'))
        {
            evt.consume();
        }
        int l=PC.getText().length();
        if(l>5)
        {
            evt.consume();
        }
    }//GEN-LAST:event_PCKeyTyped

    private void DOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DOBKeyTyped
         char ch=evt.getKeyChar();
        if(!(ch>='0' && ch<='9' || ch=='-'))
        {
            evt.consume();
        }
        int l=DOB.getText().length();
        if(l>9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_DOBKeyTyped

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
            java.util.logging.Logger.getLogger(ADD_CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_CONTACT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AB;
    private javax.swing.JTextField ADD1;
    private javax.swing.JLabel ADD1LABEL;
    private javax.swing.JTextField ADD2;
    private javax.swing.JLabel ADD2LABEL;
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JTextField CITY;
    private javax.swing.JLabel CITYLABEL;
    private javax.swing.JTextField DOB;
    private javax.swing.JLabel DOBLABEL;
    private javax.swing.JLabel EIDLABEL;
    private javax.swing.JButton EMAIL_ALT;
    private javax.swing.JButton EXITBUT;
    private javax.swing.JTextField FN;
    private javax.swing.JLabel FNLABEL;
    private javax.swing.JTextField G;
    private javax.swing.JLabel GROUPLABEL;
    private javax.swing.JTextField ID;
    private javax.swing.JButton INSERTBUT;
    private javax.swing.JTextField LN;
    private javax.swing.JLabel LNLABEL;
    private javax.swing.JTextField MN;
    private javax.swing.JTextField MN1;
    private javax.swing.JLabel MN1LABEL;
    private javax.swing.JLabel MNLABEL;
    private javax.swing.JButton MOB_ALT;
    private javax.swing.JLabel MOB_NO_2;
    private javax.swing.JTextField PC;
    private javax.swing.JLabel PCLABEL;
    private javax.swing.JTextField STATE;
    private javax.swing.JLabel STATELABEL;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
