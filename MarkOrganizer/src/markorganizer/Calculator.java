/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markorganizer;

/**
 *
 * @author Zohra
 */

import java.text.DecimalFormat;
import java.util.ArrayList; 
import java.util.Collections;
public class Calculator extends javax.swing.JFrame {
ArrayList<Double> testmarks = new ArrayList<Double>();
ArrayList<Double> testmarkssorted = new ArrayList<Double>();
double[] testmarksstring = new double[testmarks.size()]; 
double testaverage;
String testaverageString;
double testTotal = 0;
String testworth;
double median;
int units;
FileSetup no = new FileSetup();
Exam yes = new Exam();
/**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        Error.setVisible(false);
        if(MarkOrganizerUI.row == -1){
            this.setVisible(false);
        }
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
        Testmark = new javax.swing.JLabel();
        Testmarkinput = new javax.swing.JTextField();
        Testaverage = new javax.swing.JLabel();
        Testaveragedisplay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Testmedian = new javax.swing.JLabel();
        Mediandisplay = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Restart = new javax.swing.JButton();
        Error = new javax.swing.JLabel();
        Finish = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Enter test marks ONLY here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        Testmark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Testmark.setText("Test mark:");

        Testmarkinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestmarkinputActionPerformed(evt);
            }
        });

        Testaverage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Testaverage.setText("Test average is: ");

        jLabel7.setText("/");

        jLabel10.setText("/100");

        Testmedian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Testmedian.setText("Test median is:");

        Mediandisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediandisplayActionPerformed(evt);
            }
        });

        jLabel12.setText("/100");

        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });

        Error.setText("Invalid input");

        Finish.setText("Finish and display average");
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });

        Continue.setText("Continue?");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        jLabel1.setText("unit tests entered");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Testmedian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mediandisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Continue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Finish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Restart))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Testaverage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Testaveragedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Testmark)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Testmarkinput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Testmark)
                        .addComponent(jLabel7)
                        .addComponent(Error)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Testmarkinput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continue)
                    .addComponent(Finish)
                    .addComponent(Restart))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Testaverage)
                    .addComponent(Testaveragedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Testmedian)
                    .addComponent(Mediandisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TestmarkinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestmarkinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TestmarkinputActionPerformed

    private void MediandisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediandisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediandisplayActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        // TODO add your handling code here:
        testmarks.clear();
        Testmarkinput.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_RestartActionPerformed

    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        // TODO add your handling code here:
        if(!Testmarkinput.getText().isEmpty() || !jTextField2.getText().isEmpty()){
            units++;
            jTextField1.setText(String.valueOf(units));
        }
        DecimalFormat med = new DecimalFormat("##.##");
        for(double c: testmarks){
            testTotal += c;
        }
        testaverage = testTotal/testmarks.size();
        Testaveragedisplay.setText(String.valueOf(med.format(testaverage)));
        testmarkssorted = testmarks;
        Collections.sort(testmarkssorted);
        double sortlen = testmarks.size();
        if(sortlen % 2 == 0){
            median = (testmarkssorted.get(testmarks.size()/2) + testmarkssorted.get(testmarks.size()/2 + 1))/2;
            Mediandisplay.setText(String.valueOf(med.format(median)));
        }else{
            sortlen = (sortlen + 1)/2;
            int middle = Integer.parseInt(String.valueOf(sortlen));
            median = testmarkssorted.get(middle);
            Mediandisplay.setText(String.valueOf(med.format(median)));
        }
        if(testmarks.size() == 7){
            yes.setVisible(true);
        }
    }//GEN-LAST:event_FinishActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        // TODO add your handling code here:
         if(Testmarkinput.getText().isEmpty() || jTextField2.getText().isEmpty()){
            Error.setVisible(true);
            Testmarkinput.setText("");
        }else{
            Error.setVisible(false);
            try{
                double a = Double.parseDouble((Testmarkinput.getText()));
                double b = Double.parseDouble(jTextField2.getText());
                testmarks.add((a/b)*100);
                units++;
                jTextField1.setText(String.valueOf(units));
            }catch(NumberFormatException e){
                Error.setVisible(true);
                Testmarkinput.setText("");
                jTextField2.setText("");
            }
            Testmarkinput.setText("");
            jTextField2.setText("");
        }
    }//GEN-LAST:event_ContinueActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MarkOrganizerUI write = new MarkOrganizerUI();
        Calculator ec = new Calculator();
        DecimalFormat mark = new DecimalFormat("##.##");
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
        ec.testaverage = ec.testTotal/ec.testmarks.size();
        ec.testaverageString = String.valueOf(ec.testaverage);
        ec.testworth = mark.format((ec.testaverage/100) * 70);
        for(int q = 0; q < ec.testmarks.size(); ++q){
            ec.testmarksstring[q] = ec.testmarks.get(q);
            System.out.println(ec.testmarksstring);
        }
        for(int p = 0; p < ec.testmarks.size() + 1; p++){
            if(MarkOrganizerUI.students[MarkOrganizerUI.row][p + 2] == null || MarkOrganizerUI.students[MarkOrganizerUI.row][p + 2].equals(" ")){
                MarkOrganizerUI.students[MarkOrganizerUI.row][p + 2] = String.valueOf(ec.testmarksstring[p]);
            }
        }
        System.out.println(MarkOrganizerUI.students);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JLabel Error;
    private javax.swing.JButton Finish;
    private javax.swing.JTextField Mediandisplay;
    private javax.swing.JButton Restart;
    private javax.swing.JLabel Testaverage;
    private javax.swing.JTextField Testaveragedisplay;
    private javax.swing.JLabel Testmark;
    private javax.swing.JTextField Testmarkinput;
    private javax.swing.JLabel Testmedian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
