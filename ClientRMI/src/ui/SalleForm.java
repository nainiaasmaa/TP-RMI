/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import config.Config;
import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class SalleForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalleForm
     */
    
    DefaultTableModel model = null;
    IDao<Machine> dao = null;
    IDao<Salle> dao2 = null;
    int id = -1;
    private static SalleForm sf;

    public SalleForm() {
        try {
            initComponents();
            dao2 = (IDao<Salle>) Naming.lookup("rmi://" + Config.ip + ":" + Config.port + "/dao2");
            dao = (IDao<Machine>) Naming.lookup("rmi://" + Config.ip + ":" + Config.port + "/dao");
            model = (DefaultTableModel) tableSalle.getModel();
            load();
        } catch (NotBoundException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public static SalleForm getInstance() {
        if (sf == null) {
            sf = new SalleForm();
        }
        return sf;
    }

    public void load() {
        try {
            model.setRowCount(0);
            for (Salle s : dao2.findAll()) {
                model.addRow(new Object[]{
                    s.getId(),
                    s.getCode()
                });
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bouttonAjouter = new javax.swing.JButton();
        bouttonModifier = new javax.swing.JButton();
        bouttonSupprimer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSalle = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations Salle"));

        jLabel1.setText("Code :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        bouttonAjouter.setText("Ajouter");
        bouttonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonAjouterActionPerformed(evt);
            }
        });

        bouttonModifier.setText("Modifier");
        bouttonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonModifierActionPerformed(evt);
            }
        });

        bouttonSupprimer.setText("Supprimer");
        bouttonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bouttonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bouttonAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bouttonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bouttonAjouter)
                .addGap(18, 18, 18)
                .addComponent(bouttonModifier)
                .addGap(18, 18, 18)
                .addComponent(bouttonSupprimer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des salles"));

        tableSalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Code"
            }
        ));
        tableSalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSalle);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouttonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonSupprimerActionPerformed
        // TODO add your handling code here:
        try {
            if (id != -1) {
                Salle salle = dao2.findById(id);

                if (salle != null) {
                    int machineCount = countMachinesInSalle();
                    String message;
                    if (machineCount > 0) {
                        JOptionPane.showMessageDialog(this, "La salle contient " + machineCount + " machine(s), vous ne pouvez pas supprimer cette salle.");
                    } else {
                        message = "Voulez-vous vraiment supprimer cette salle ?";
                        int response = JOptionPane.showConfirmDialog(this, message, "La salle est bien supprimée", JOptionPane.YES_NO_OPTION);
                        if (response == JOptionPane.YES_OPTION) {
                            dao2.delete(salle);
                            load();
                            id = -1;
                            JOptionPane.showMessageDialog(this, "La salle a été supprimée");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vous devez sélectionner une salle dans la liste.");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bouttonSupprimerActionPerformed

    private void bouttonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonModifierActionPerformed
        try {
            // TODO add your handling code here:
            String code = txtCode.getText();
            Salle updatedSalle = new Salle(code);
            updatedSalle.setId(id);
            dao2.update(updatedSalle);
            load();
            JOptionPane.showMessageDialog(this, "La salle a été modifiée");
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bouttonModifierActionPerformed
      private int countMachinesInSalle() throws RemoteException {
        Salle salle = dao2.findById(id);
        int count = 0;
        if (salle != null) {
            for (Machine machine : dao.findAll()) {
                Salle machineSalle = machine.getSalle();
                if (machineSalle != null && machineSalle.getId() == salle.getId()) {
                    count++;
                }
            }
        }

        return count;
    } 
    
    private void tableSalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalleMouseClicked
        int selectedRow = tableSalle.getSelectedRow();
        if (selectedRow != -1) {
            try {
                id = Integer.parseInt(tableSalle.getValueAt(selectedRow, 0).toString());
                txtCode.setText(dao2.findById(id).getCode());
            } catch (RemoteException ex) {
                Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableSalleMouseClicked
    
    
    private void bouttonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonAjouterActionPerformed
        String code = txtCode.getText();
        try {
            dao2.create(new Salle(code));
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        load();
        JOptionPane.showMessageDialog(this, "La salle a été ajoutée");
        // TODO add your handling code here:
    }//GEN-LAST:event_bouttonAjouterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouttonAjouter;
    private javax.swing.JButton bouttonModifier;
    private javax.swing.JButton bouttonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSalle;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
