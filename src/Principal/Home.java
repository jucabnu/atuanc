/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import DAO.DAOMotivo;
import DAO.DAORnc;
import DAO.DAOSetor;
import DAO.DAOUsuario;
import DTO.GeralRep;
import DTO.Rnc;
import DTO.Setor;
import DTO.Usuario;
import Reports.RepMotivos;
import Reports.RepRNC;
import Reports.RepSetores;
import Reports.RepUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import telasCRUD.CrudMotivo;
import telasCRUD.CrudRnc;
import telasCRUD.CrudSetor;
import telasCRUD.CrudUsuario;

/**
 *
 * @author jucabnu
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    private Usuario user;
    
    public Home() {
        initComponents();
    }
    
    public Home(Usuario user){
        this.user = user;
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

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jLabelMostraSobre = new javax.swing.JLabel();
        jLabelMostraLogo = new javax.swing.JLabel();
        jLabelMostraLogo1 = new javax.swing.JLabel();
        jLabelMostraLogo2 = new javax.swing.JLabel();
        jLabelUsuarioLogado = new javax.swing.JLabel();
        jMenuBarMain = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuUsuario = new javax.swing.JMenuItem();
        jMenuRNC = new javax.swing.JMenuItem();
        jMenuMotivo = new javax.swing.JMenuItem();
        jMenuSetor = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuUsuarioR = new javax.swing.JMenuItem();
        jMenuMotivoR = new javax.swing.JMenuItem();
        jMenuSetorR = new javax.swing.JMenuItem();
        jMenuRNCR = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenuItem();
        jMenuItemTrocaUsuario = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AtuaNC | Gestão 1.0");
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelMostraSobre.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelMostraSobre.setText("AtuaNC | 2018");

        jLabelMostraLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabelUsuarioLogado.setText("jLabel1");
        jLabelUsuarioLogado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUsuarioLogadoMouseEntered(evt);
            }
        });
        jLabelUsuarioLogado.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabelUsuarioLogadoComponentShown(evt);
            }
        });

        jMenuCadastros.setMnemonic('c');
        jMenuCadastros.setText("Cadastros");
        jMenuCadastros.setToolTipText("");
        jMenuCadastros.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuCadastros.setName(""); // NOI18N

        jMenuUsuario.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Male.gif"))); // NOI18N
        jMenuUsuario.setMnemonic('u');
        jMenuUsuario.setText("Usuários");
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuUsuario);

        jMenuRNC.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuRNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.gif"))); // NOI18N
        jMenuRNC.setMnemonic('r');
        jMenuRNC.setText("RNC");
        jMenuRNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRNCActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuRNC);

        jMenuMotivo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuMotivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.gif"))); // NOI18N
        jMenuMotivo.setMnemonic('m');
        jMenuMotivo.setText("Motivos");
        jMenuMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMotivoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuMotivo);

        jMenuSetor.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.gif"))); // NOI18N
        jMenuSetor.setMnemonic('S');
        jMenuSetor.setText("Setores");
        jMenuSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSetorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuSetor);

        jMenuBarMain.add(jMenuCadastros);

        jMenuRelatorios.setMnemonic('r');
        jMenuRelatorios.setText("Relatórios");
        jMenuRelatorios.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jMenuUsuarioR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuUsuarioR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuUsuarioR.setMnemonic('u');
        jMenuUsuarioR.setText("Usuários");
        jMenuUsuarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuUsuarioR);

        jMenuMotivoR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuMotivoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuMotivoR.setMnemonic('m');
        jMenuMotivoR.setText("Motivos");
        jMenuMotivoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMotivoRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuMotivoR);

        jMenuSetorR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuSetorR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuSetorR.setMnemonic('s');
        jMenuSetorR.setText("Setores");
        jMenuSetorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSetorRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuSetorR);

        jMenuRNCR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuRNCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuRNCR.setMnemonic('l');
        jMenuRNCR.setText("Lista RNCs");
        jMenuRNCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRNCRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuRNCR);

        jMenuItem1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuItem1.setMnemonic('r');
        jMenuItem1.setText("RNC x Setor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem1);

        jMenuBarMain.add(jMenuRelatorios);

        jMenuAjuda.setMnemonic('a');
        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jMenuAbout.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/About.gif"))); // NOI18N
        jMenuAbout.setMnemonic('s');
        jMenuAbout.setText("Sobre");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuAbout);

        jMenuItemTrocaUsuario.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuItemTrocaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Male.gif"))); // NOI18N
        jMenuItemTrocaUsuario.setMnemonic('t');
        jMenuItemTrocaUsuario.setText("Trocar usuário");
        jMenuItemTrocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTrocaUsuarioActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemTrocaUsuario);

        jMenuBarMain.add(jMenuAjuda);

        jMenuSair.setMnemonic('s');
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuSair);

        setJMenuBar(jMenuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelMostraLogo)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMostraSobre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUsuarioLogado)
                .addGap(33, 33, 33))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMostraLogo1)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(jLabelMostraLogo2)
                    .addGap(22, 22, 22)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelMostraLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMostraSobre)
                    .addComponent(jLabelUsuarioLogado))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabelMostraLogo1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabelMostraLogo2)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     private Image icone() {    
     return new javax.swing.ImageIcon(getClass().getResource(
     "C:/Users/jucabnu/Documents/NetBeansProjects/TCCValgaSis8_130613_1/src/icone.ico")).getImage();    
     }   */
    // setIconImage(new ImageIcon(getClass().getResource("C:/Users/jucabnu/Documents/NetBeansProjects/TCCValgaSis8_130613_1/src/icone.ico")).getImage());  
    private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed

        if(DAOUsuario.isAdm(user)){
            CrudUsuario telaUsuario = new CrudUsuario();
            telaUsuario.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário precisa ser administrador!");
        }
    }//GEN-LAST:event_jMenuUsuarioActionPerformed
       
    private void jMenuRNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRNCActionPerformed
        CrudRnc telaRnc = new CrudRnc(user);
        telaRnc.setVisible(true);
    }//GEN-LAST:event_jMenuRNCActionPerformed

    private void jMenuMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMotivoActionPerformed
        CrudMotivo telaMotivo = new CrudMotivo();
        telaMotivo.setVisible(true);
    }//GEN-LAST:event_jMenuMotivoActionPerformed

    private void jMenuSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSetorActionPerformed
        CrudSetor telaSetor = new CrudSetor();
        telaSetor.setVisible(true);
    }//GEN-LAST:event_jMenuSetorActionPerformed

    private void jMenuUsuarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioRActionPerformed
        
        // JOptionPane.showMessageDialog(null, "Não implementado!" + "\n" + "\n" + "Não há impressora instalada!");
        try{
            RepUsuarios r = new RepUsuarios();
            r.imprimir(DAOUsuario.getUsuarios());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
    }//GEN-LAST:event_jMenuUsuarioRActionPerformed

    private void jMenuRNCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRNCRActionPerformed

        // JOptionPane.showMessageDialog(null, "Não implementado!" + "\n" + "\n" + "Não há impressora instalada!");
        try{
            RepRNC r = new RepRNC();
            r.imprimir2(DAORnc.getRncsSintetico());
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
        
    }//GEN-LAST:event_jMenuRNCRActionPerformed

    private void jMenuMotivoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMotivoRActionPerformed

        try{            
            RepMotivos mm = new RepMotivos();
            mm.imprimir(DAOMotivo.getMotivos());            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
        
    }//GEN-LAST:event_jMenuMotivoRActionPerformed

    private void jMenuSetorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSetorRActionPerformed

        try{            
            RepSetores ss = new RepSetores();
            ss.imprimir(DAOSetor.getSetores());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
        
    }//GEN-LAST:event_jMenuSetorRActionPerformed

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked

        System.exit(0);
        //this.dispose();
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemTrocaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocaUsuarioActionPerformed
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItemTrocaUsuarioActionPerformed

    private void jLabelUsuarioLogadoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabelUsuarioLogadoComponentShown

        
    }//GEN-LAST:event_jLabelUsuarioLogadoComponentShown

    private void jLabelUsuarioLogadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioLogadoMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabelUsuarioLogadoMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLabelUsuarioLogado.setText(user.getLogusu());
        
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // AQUI VAI A CHAMADA PARA O RELATÓRIO GERAL       
        
        try{            
            
            // coloca todas rnc num arraylist
            ArrayList<Rnc> todas = DAORnc.getRncs();
            ArrayList<Setor> setores = DAOSetor.getSetores();
            
            // cria objeto que vai guardar todos dados para o report
            ArrayList<GeralRep> lista = new ArrayList<>();
            
            //coloca todos os setores na lista!!!!!!!!!
            for(Setor s : setores){
                //GeralRep ggg = new GeralRep(s.getNomset(), 0);
                lista.add(new GeralRep(s.getNomset(), 0, 0));
            }
            
            int total = 0;
            
            // percorre o arraylist de rncs e vai alimentando os dados no objeto   
            for(Rnc r : todas){
                for(GeralRep g : lista){
                    if(DAOSetor.getSetorPeloCod(r.getCodset()).getNomset().equals(g.getSetor())){
                        System.out.println(DAOSetor.getSetorPeloCod(r.getCodset()).getNomset());
                        g.setQuantidade(g.getQuantidade()+1);
                        total++;
                        System.out.println(g.getQuantidade());
                    }else{
                        
                    }
                }
            }
            
            for (GeralRep g : lista){
                g.setPercentual((g.getQuantidade()/total)*100);
            }
            System.out.println("total: " + total);
            
            RepRNC rr = new RepRNC();
            rr.imprimir3(lista);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);   
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMostraLogo;
    private javax.swing.JLabel jLabelMostraLogo1;
    private javax.swing.JLabel jLabelMostraLogo2;
    private javax.swing.JLabel jLabelMostraSobre;
    private javax.swing.JLabel jLabelUsuarioLogado;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarMain;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItemTrocaUsuario;
    private javax.swing.JMenuItem jMenuMotivo;
    private javax.swing.JMenuItem jMenuMotivoR;
    private javax.swing.JMenuItem jMenuRNC;
    private javax.swing.JMenuItem jMenuRNCR;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuSetor;
    private javax.swing.JMenuItem jMenuSetorR;
    private javax.swing.JMenuItem jMenuUsuario;
    private javax.swing.JMenuItem jMenuUsuarioR;
    // End of variables declaration//GEN-END:variables
}