/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setTitle("Gestion des machines");
        this.setExtendedState(MAXIMIZED_BOTH);//permet d'afficher l'interface en plein ecran
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        machineMenuItem = new javax.swing.JMenuItem();
        salleMenuItem = new javax.swing.JMenuItem();
        rechercheMenu = new javax.swing.JMenu();
        rechercheMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editMenu.setMnemonic('e');
        editMenu.setText("Gestion");

        machineMenuItem.setMnemonic('t');
        machineMenuItem.setText("Machines");
        machineMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machineMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(machineMenuItem);

        salleMenuItem.setMnemonic('y');
        salleMenuItem.setText("Salles");
        salleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(salleMenuItem);

        menuBar.add(editMenu);

        rechercheMenu.setText("Recherche");
        rechercheMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheMenuMouseClicked(evt);
            }
        });

        rechercheMenuItem.setText("rechercher");
        rechercheMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheMenuItemActionPerformed(evt);
            }
        });
        rechercheMenu.add(rechercheMenuItem);

        menuBar.add(rechercheMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void machineMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machineMenuItemActionPerformed
        // TODO add your handling code here:
        MachineForm mf = MachineForm.getInstance();

        if (mf == null || !mf.isVisible()) {
            mf = MachineForm.getInstance();
            desktopPane.add(mf);
            mf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, " Cette fenêtre est déja ouverte");
        }
    }//GEN-LAST:event_machineMenuItemActionPerformed

    private void salleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleMenuItemActionPerformed
        SalleForm sf = SalleForm.getInstance();
        if (sf == null || !sf.isVisible()) {
            sf = SalleForm.getInstance();
            desktopPane.add(sf);
            sf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Cette fenêtre est déja ouverte");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_salleMenuItemActionPerformed

    private void rechercheMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheMenuItemActionPerformed
 RechercheForm rf = RechercheForm.getInstance();
        if (rf == null || !rf.isVisible()) {
            rf = RechercheForm.getInstance();
            desktopPane.add(rf);
            rf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Cette fenêtre est déja ouverte");
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_rechercheMenuItemActionPerformed

    private void rechercheMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheMenuMouseClicked
        
// TODO add your handling code here:
    }//GEN-LAST:event_rechercheMenuMouseClicked


    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem machineMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu rechercheMenu;
    private javax.swing.JMenuItem rechercheMenuItem;
    private javax.swing.JMenuItem salleMenuItem;
    // End of variables declaration//GEN-END:variables

}
