/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces1;

import classes.Accept_return;

/**
 *
 * @author Kashif Roshen
 */
public class returnCar extends javax.swing.JFrame {

    /**
     * Creates new form returnCar
     */
    public returnCar() {
        initComponents();
        
        amount.setEnabled(false);
        type_amount.setEnabled(false);
        get_amount.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cus_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        display_overdue = new javax.swing.JLabel();
        damaged = new javax.swing.JCheckBox();
        amount = new javax.swing.JLabel();
        type_amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        display_amount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        display_refund = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        get_amount = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Customer name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 140, 130, 20);
        jPanel1.add(Cus_name);
        Cus_name.setBounds(250, 140, 180, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Overdue");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 180, 90, 20);
        jPanel1.add(display_overdue);
        display_overdue.setBounds(250, 180, 180, 40);

        damaged.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        damaged.setText("Damaged");
        damaged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damagedActionPerformed(evt);
            }
        });
        jPanel1.add(damaged);
        damaged.setBounds(70, 210, 110, 35);

        amount.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        amount.setText("amount");
        jPanel1.add(amount);
        amount.setBounds(80, 260, 80, 20);
        jPanel1.add(type_amount);
        type_amount.setBounds(250, 260, 180, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setText("Total amount");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 310, 120, 20);
        jPanel1.add(display_amount);
        display_amount.setBounds(250, 300, 180, 50);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setText("Refund");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(470, 310, 70, 20);
        jPanel1.add(display_refund);
        display_refund.setBounds(590, 300, 180, 50);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel11.setText("Payment");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 380, 70, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(310, 380, 180, 30);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 140, 110, 30);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 380, 110, 30);

        get_amount.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        get_amount.setText("OK");
        get_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_amountActionPerformed(evt);
            }
        });
        jPanel1.add(get_amount);
        get_amount.setBounds(500, 260, 110, 30);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons/home.png"))); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(590, 30, 130, 40);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("RETURN CAR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 90, 120, 26);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/bac.jpeg"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(820, 512));
        background.setPreferredSize(new java.awt.Dimension(820, 512));
        jPanel1.add(background);
        background.setBounds(0, 0, 820, 512);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String x=jTextField3.getText();
        
        int y=Integer.parseInt(x);
        
       Accept_return o=new Accept_return();
       
       o.InsertPayment(y);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void damagedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damagedActionPerformed
        
        if (damaged.isSelected())
        {
            amount.setEnabled(true);
            type_amount.setEnabled(true);
            get_amount.setEnabled(true);
        }
        
        else
        {
            amount.setEnabled(false);
            type_amount.setEnabled(false);
            get_amount.setEnabled(false);
        }
    }//GEN-LAST:event_damagedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Accept_return Return=new Accept_return();
        
        String cus_name=Cus_name.getText();
        
        Return.getRentAndCarID(cus_name);
        
        Return.setPrices();
        
        boolean check_Overdue=Return.checkforOverdue();
        
        if (check_Overdue==true)
        {
            double overdue=Return.calculateOverdue();
            
            display_overdue.setText(String.valueOf(overdue));
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void get_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_amountActionPerformed
        
         String cus_name=Cus_name.getText();
        
        
        String damaged_compensation=type_amount.getText();
        
        Accept_return Return1=new Accept_return();
        Return1.getRentAndCarID(cus_name);
        Return1.setPrices();
        
        String final_amount=String.valueOf(Return1.setFinalAmount());
        
        String refund=String.valueOf(Return1.refund(damaged_compensation));
        
        display_amount.setText(final_amount);
        
        display_refund.setText(refund);
        
        
        
    }//GEN-LAST:event_get_amountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        main window=new main();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(returnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cus_name;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel background;
    private javax.swing.JCheckBox damaged;
    private javax.swing.JLabel display_amount;
    private javax.swing.JLabel display_overdue;
    private javax.swing.JLabel display_refund;
    private javax.swing.JButton get_amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField type_amount;
    // End of variables declaration//GEN-END:variables
}
