package UI;

import javax.swing.JOptionPane;
import domain.Scheduler;

public class payUI extends javax.swing.JFrame {

    /**
     * Creates new form payUI
     */
    public payUI(String bookId,String memID,String scheID,String seatType,int seatBook,double price) {
        initComponents();
        tf_bookID.setText(bookId);
        tf_memId.setText(memID);
        scheId.setText(scheID);
                  
        tseat.setText(seatType);
        
        noseat.setText(seatBook+"");
        tprice.setText(price+"");
        String scheDate;
        int departure;
        
        try{
            scheTier st = new scheTier();
            Scheduler s = st.retrieveByID(scheID);
                if(s==null){
                    JOptionPane.showMessageDialog(this, "Error retrieve Scheduler date and time");
                }
                else
                {
                    scheDate = s.getScheDate();
                    departure = Integer.parseInt(s.getDeparture());
                    ddate.setText(scheDate);
                    dtime.setText(String.format("%04d",departure));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_bookID = new javax.swing.JTextField();
        tf_memId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        scheId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ddate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dtime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tseat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        noseat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        paym = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        ccno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cardp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");
        setMinimumSize(new java.awt.Dimension(450, 390));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Payment");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(92, 13, 90, 28);

        jLabel2.setText("Booking ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(47, 62, 69, 16);

        jLabel3.setText("Member ID :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(225, 62, 72, 16);

        tf_bookID.setEditable(false);
        getContentPane().add(tf_bookID);
        tf_bookID.setBounds(121, 59, 71, 22);

        tf_memId.setEditable(false);
        getContentPane().add(tf_memId);
        tf_memId.setBounds(302, 59, 72, 22);

        jLabel4.setText("Scheduler ID :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(34, 102, 82, 16);

        scheId.setEditable(false);
        getContentPane().add(scheId);
        scheId.setBounds(121, 99, 70, 22);

        jLabel5.setText("Date Depature :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(25, 133, 91, 16);

        ddate.setEditable(false);
        getContentPane().add(ddate);
        ddate.setBounds(121, 130, 95, 22);

        jLabel6.setText("Time Depature :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(237, 133, 94, 16);

        dtime.setEditable(false);
        getContentPane().add(dtime);
        dtime.setBounds(336, 130, 44, 22);

        jLabel7.setText("Seat Type :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(49, 168, 67, 16);

        tseat.setEditable(false);
        getContentPane().add(tseat);
        tseat.setBounds(121, 165, 70, 22);

        jLabel8.setText("Number Seat Book :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(216, 168, 115, 16);

        noseat.setEditable(false);
        getContentPane().add(noseat);
        noseat.setBounds(336, 165, 35, 22);

        jLabel9.setText("Total Price : RM");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(24, 203, 92, 16);

        tprice.setEditable(false);
        getContentPane().add(tprice);
        tprice.setBounds(121, 200, 70, 22);

        jLabel10.setText("Payment Method :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(12, 235, 104, 16);

        paym.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Credit Card" }));
        paym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymActionPerformed(evt);
            }
        });
        getContentPane().add(paym);
        paym.setBounds(121, 235, 92, 22);

        jLabel11.setText("Credit Card No :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(23, 273, 93, 16);

        ccno.setEditable(false);
        getContentPane().add(ccno);
        ccno.setBounds(121, 270, 103, 22);

        jLabel12.setText("Card Pin :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(238, 273, 57, 16);

        cardp.setEditable(false);
        getContentPane().add(cardp);
        cardp.setBounds(302, 270, 35, 22);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blue-ok-icon (1).png"))); // NOI18N
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(106, 310, 80, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Button-Close-icon.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(224, 310, 100, 25);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 0, 0);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 420, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String memId = tf_memId.getText();
        dispose();
        showSche ss = new showSche(memId);
        ss.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void paymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymActionPerformed
        if(paym.getSelectedItem()=="Credit Card"){
            ccno.setEditable(true);
            cardp.setEditable(true);
        }
        else{
            ccno.setEditable(false);
            cardp.setEditable(false);
        }
            
    }//GEN-LAST:event_paymActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String bookID = tf_bookID.getText();
        String memID = tf_memId.getText();
        String scheID = scheId.getText();
        String scheDate = ddate.getText();
        int scheTime = Integer.parseInt(dtime.getText());
        String seatType = tseat.getText();
        int seatBook = Integer.parseInt(noseat.getText());
        double price = Double.parseDouble(tprice.getText());
        String payMethod = (String) paym.getSelectedItem();
        String cardNo;
        String cardPin;
        cardNo = ccno.getText();
        cardPin = cardp.getText();
        
        boolean valid = true;
        String invalid = "";
        
        for(int o=0;o<cardNo.length();o++){
            char temp3 = cardNo.charAt(o);
            if(Character.isLetter(temp3)){
                valid = false;
                invalid = "Invalid Credit Card Format";
            }
        }
        
        if(cardNo.length()!=16){
            valid = false;
            invalid = "Invalid Credit Card Format.\nPlease Enter 16digit";
        }
        
        for(int a=0;a<cardPin.length();a++){
            char temp = cardPin.charAt(a);
            if(Character.isLetter(temp)){
                valid = false;
                invalid = "Invalid Credit Card Pin.";
            }
        }
        
        if(cardPin.length()!=3){
            valid = false;
            invalid = "Invalid Creadit Card Pin.\nPlease Enter 3 digit only.";
        }
        
        
        if(valid){
        try{
            bookTier bt = new bookTier();
            boolean success = bt.storebook(bookID,memID,scheID,seatType,seatBook,price);
                if(!success){
                    JOptionPane.showMessageDialog(this, "Error inserting new record to Booking");
                }
                payTier pt = new payTier();
                String payID = pt.storepay(bookID,memID,scheID,scheDate,scheTime,seatType,seatBook,price,payMethod,cardNo,cardPin);
                if(payID==null){
                    JOptionPane.showMessageDialog(this, "Error inserting new record to Payment");
                }
                else
                {
                    SeatTier st = new SeatTier();
                    boolean success3 = st.minusSeat(scheID,seatType,seatBook);
                    if(!success3){
                        JOptionPane.showMessageDialog(this, "Error minus seat avaibility");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Payment Success");
                        dispose();
                        test t = new test(payID,memID,bookID,scheID,scheDate,scheTime,seatType,seatBook,price);
                        t.setVisible(true);
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
    }else
        JOptionPane.showMessageDialog(this,invalid);
        
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
            java.util.logging.Logger.getLogger(payUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new payUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardp;
    private javax.swing.JTextField ccno;
    private javax.swing.JTextField ddate;
    private javax.swing.JTextField dtime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField noseat;
    private javax.swing.JComboBox<String> paym;
    private javax.swing.JTextField scheId;
    private javax.swing.JTextField tf_bookID;
    private javax.swing.JTextField tf_memId;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tseat;
    // End of variables declaration//GEN-END:variables
}
