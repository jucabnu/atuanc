/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasPesquisa;

import DAO.DAOUsuario;
import DTO.Usuario;
import Reports.RepUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telasCRUD.CrudUsuario;

/**
 *
 * @author jucabnu
 */
public class PesquisaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PesquisaPadrao
     */
    public PesquisaUsuario() {
        initComponents();

        jComboBoxFiltro.removeAllItems();
        jComboBoxFiltro.addItem("Nome");
        jComboBoxFiltro.addItem("Login");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonMostrar = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox();
        botaoImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Usuários");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setText("Buscar:");

        pesquisa.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        pesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesquisaFocusLost(evt);
            }
        });

        jTableUsuarios.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Email", "Login", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableUsuarios);
        jTableUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButtonMostrar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filter.gif"))); // NOI18N
        jButtonMostrar.setMnemonic('m');
        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apply.gif"))); // NOI18N
        jButtonSelecionar.setMnemonic('e');
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Door.gif"))); // NOI18N
        jButtonSair.setMnemonic('s');
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setText("Filtrar por:");

        jComboBoxFiltro.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botaoImprimir.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        botaoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print.gif"))); // NOI18N
        botaoImprimir.setMnemonic('r');
        botaoImprimir.setText("Relatório");
        botaoImprimir.setPreferredSize(new java.awt.Dimension(91, 25));
        botaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSelecionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    javax.swing.JFrame jframe;

    public void instancia(javax.swing.JFrame jframe) {
        this.jframe = jframe;
    }

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        atualizaTabelaUsuarios();
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        CrudUsuario telaUsu= (CrudUsuario) this.jframe;
        telaUsu.campoRecebe(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0));
        this.dispose();
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void pesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaFocusLost

        jButtonMostrarActionPerformed(null);

    }//GEN-LAST:event_pesquisaFocusLost

    private void botaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirActionPerformed
        // TODO add your handling code here:

        try{
            RepUsuarios mm = new RepUsuarios();
            mm.imprimir(DAOUsuario.getUsuarios());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_botaoImprimirActionPerformed

    
    public void atualizaTabelaUsuarios() {
    
        /*
        String campo;
        if(String.valueOf(jComboBoxFiltro.getSelectedItem()).equals("Nome")){
            campo = "nomusu";
        }else{
            campo = "logusu";
        }
        ArrayList<Usuario> listaUsuario = DAO.DAOUsuario.getUsuarioPorCampo(pesquisa.getText(), campo);
        */
        
        ArrayList<Usuario> listaUsuario = DAO.DAOUsuario.getUsuarioPorNome(pesquisa.getText());
        insereTabelaUsuario(listaUsuario);
        
    }

    // método para criar a tabela (objeto tabela)
    //private void insereTabelaCliente(ArrayList<Cliente> listaCliente) {
    private void insereTabelaUsuario(ArrayList<Usuario> listaUsuarios) {
        DefaultTableModel dtmc = new DefaultTableModel(); // criar o modelo da tabela

        Usuario usu;

        //definir colunas que a tabela vai conter
        dtmc.addColumn("Cod");
        dtmc.addColumn("Nome");
        dtmc.addColumn("Email");
        dtmc.addColumn("Login");
        dtmc.addColumn("Tipo");
        
        
        //preencher tabela com dados
        for (Object u : listaUsuarios) {
            
            usu = (Usuario) u;
            String[] linha = new String[5]; // criar linha com 5 colunas, conforme tabela
            linha[0] = String.valueOf(usu.getCodusu());
            linha[1] = usu.getNomusu();
            linha[2] = usu.getEmausu();
            linha[3] = usu.getLogusu();
            linha[4] = String.valueOf(usu.getTipusu());
   
            dtmc.addRow(linha); // adicionando a linha criada

        }
        jTableUsuarios.setModel(dtmc);
    }

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
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoImprimir;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JComboBox jComboBoxFiltro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField pesquisa;
    // End of variables declaration//GEN-END:variables
}
