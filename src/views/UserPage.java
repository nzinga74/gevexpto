/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Employee;
import models.User;
import repositories.EmployeeRepository;
import repositories.UserRepository;
import utils.providers.JEncript;
import utils.tables.TableSerialize;
import utils.tables.UserTableDataTransform;

/**
 *
 * @author Rita
 */
public class UserPage extends javax.swing.JPanel {

    /**
     * Creates new form User
     */
    ArrayList<Employee> employeeList;
    ArrayList<User> usersList;

    public UserPage() {
        initComponents();
        try {
            employeeList = EmployeeRepository.getAll();
            int employeeLength = employeeList.size();
            String employeeData[] = new String[employeeLength];
            for (int i = 0; i < employeeLength; i++) {
                employeeData[i] = employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName();
            }
            employeeCd.setModel(new DefaultComboBoxModel(employeeData));
        } catch (Exception e) {
            System.out.println("Erro ao carregar Funcionário");
            employeeList = new ArrayList<Employee>();
        }
        
        //GET ALL USERS
        loadUserData();
        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeCd = new javax.swing.JComboBox<>();
        emailInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        accessLevelCb = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTb = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 440));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 66, 88));
        jLabel1.setText("Usuários");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Funcionário");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nivel de acesso");

        employeeCd.setBackground(new java.awt.Color(227, 236, 245));
        employeeCd.setForeground(new java.awt.Color(140, 164, 188));
        employeeCd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha funcionário", " " }));
        employeeCd.setBorder(null);
        employeeCd.setPreferredSize(new java.awt.Dimension(64, 18));

        emailInput.setBackground(new java.awt.Color(227, 236, 245));
        emailInput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailInput.setForeground(new java.awt.Color(140, 164, 188));
        emailInput.setText(" Digite o email");
        emailInput.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Senha");

        passwordInput.setBackground(new java.awt.Color(227, 236, 245));
        passwordInput.setForeground(new java.awt.Color(140, 164, 188));
        passwordInput.setText("jPasswordField1");
        passwordInput.setBorder(null);

        submitBtn.setBackground(new java.awt.Color(55, 66, 88));
        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Cadastrar");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        accessLevelCb.setBackground(new java.awt.Color(227, 236, 245));
        accessLevelCb.setForeground(new java.awt.Color(140, 164, 188));
        accessLevelCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o nivel", "Admin", "Normal" }));
        accessLevelCb.setBorder(null);
        accessLevelCb.setPreferredSize(new java.awt.Dimension(64, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeCd, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(accessLevelCb, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(302, 302, 302)
                            .addComponent(jLabel4))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accessLevelCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeCd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        userTb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Email", "Senha", "Nivel de acesso", "Estado", "Funcionário"
            }
        ));
        jScrollPane1.setViewportView(userTb);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadUserData() {
        try {
            usersList = UserRepository.getAll();
            String [][] data = UserTableDataTransform.dataTransform(usersList);
            System.out.println(data[0][0]);
            String [] columnNames = UserTableDataTransform.dataColumn();
            TableSerialize userTableModel = new TableSerialize(data, columnNames) ;
            userTb.setModel(userTableModel);
        } catch (Exception e) {

        }
    }
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (employeeList != null) {
            String email = emailInput.getText();
            String password;
            try {
                password = JEncript.encript(passwordInput.getText());
            } catch (NoSuchAlgorithmException ex) {
                return;
            }
            int employeeId = employeeCd.getSelectedIndex();
            Employee employee = employeeList.get(employeeId);
            int accessLevel = accessLevelCb.getSelectedIndex() + 1;
            User user = new User(email, password, accessLevel, 0, employee);

            try {
                UserRepository.add(user);
                JOptionPane.showMessageDialog(null, "Cadastrar com sucesso");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
            }
            loadUserData();
        }
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accessLevelCb;
    private javax.swing.JTextField emailInput;
    private javax.swing.JComboBox<String> employeeCd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable userTb;
    // End of variables declaration//GEN-END:variables
}
