/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.Faculty;

import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import prototype.Master_Frame;

/**
 *
 * @author alex
 */
public class Faculty_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Faculty_Panel
     */
    public Faculty_Panel() {
        initComponents();
        fillTable();
        facultyTable.getTableHeader().setFont(new Font("Tahoma", 1, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        facultyTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        facultyTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        facultyTable.setRowHeight(20);
        facultyTable.setRowMargin(2);
        facultyTable.getTableHeader().setReorderingAllowed(false);
        facultyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(facultyTable);
        if (facultyTable.getColumnModel().getColumnCount() > 0) {
            facultyTable.getColumnModel().getColumn(0).setResizable(false);
            facultyTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(addButton)
                            .addGap(18, 18, 18)
                            .addComponent(editButton)
                            .addGap(18, 18, 18)
                            .addComponent(removeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void facultyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyTableMouseClicked
        if (facultyTable.getSelectedRow() != -1) {
            editButton.setEnabled(true);
            removeButton.setEnabled(true);
        }
        else {
            editButton.setEnabled(false);
            removeButton.setEnabled(false);
        }
    }//GEN-LAST:event_facultyTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        JDialog box = new JDialog(Master_Frame.masterFrame, true);
        box.add(new Faculty_AddOrEditPanel());
        box.setResizable(false);
        box.pack();
        box.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        JDialog box = new JDialog(Master_Frame.masterFrame, true);
        //        int rowSelected = courseTable.getSelectedRow();
        //        Object[] params = {
            //            courseTable.getValueAt(rowSelected, 0),
            //            courseTable.getValueAt(rowSelected, 1),
            //            courseTable.getValueAt(rowSelected, 2),
            //            courseTable.getValueAt(rowSelected, 3)
            //        };

        box.add(new Faculty_AddOrEditPanel());
        box.setResizable(false);
        box.pack();
        box.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void fillTable() {
        facultyTable.setValueAt("Walter White", 0, 0);
        facultyTable.setValueAt("wwhite@siue.edu", 0, 1);
        
        facultyTable.setValueAt("Gustavo Fring", 1, 0);
        facultyTable.setValueAt("gfring@siue.edu", 1, 1);
        
        facultyTable.setValueAt("Jesse Pinkman", 2, 0);
        facultyTable.setValueAt("jpinkman@siue.edu", 2, 1);
        
        facultyTable.setValueAt("Mike Ehrmantraut", 3, 0);
        facultyTable.setValueAt("mehrman@siue.edu", 3, 1);
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTable facultyTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}