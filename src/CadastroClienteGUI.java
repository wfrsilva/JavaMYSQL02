
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w7
 */
public class CadastroClienteGUI extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClienteGUI
     */
    public CadastroClienteGUI() {
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

        jLabel2 = new javax.swing.JLabel();
        jLcodigo = new javax.swing.JLabel();
        jLtitulo = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jLnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLcpf = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jLtelefone = new javax.swing.JLabel();
        jTtelefone = new javax.swing.JTextField();
        jLlogradouro = new javax.swing.JLabel();
        jTlogradouro = new javax.swing.JTextField();
        jLnumero = new javax.swing.JLabel();
        jTnumero = new javax.swing.JTextField();
        jLbairro = new javax.swing.JLabel();
        jLcidade = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jTbairro = new javax.swing.JTextField();
        jTcidade = new javax.swing.JTextField();
        jTestado = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jBinserir = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLcodigo.setText("Codigo:");

        jLtitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Cadastro de Cliente");
        jLtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLnome.setText("Nome:");

        jLcpf.setText("CPF:");

        jLtelefone.setText("Telefone:");

        jLlogradouro.setText("Logradouro:");

        jLnumero.setText("Nº:");

        jLbairro.setText("Bairro:");

        jLcidade.setText("Cidade:");

        jLestado.setText("Estado:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBlimpar.setText("Limpar");

        jBinserir.setText("Inserir");
        jBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLnome)
                        .addGap(18, 18, 18)
                        .addComponent(jTnome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLcpf)
                        .addGap(27, 27, 27)
                        .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLtelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTtelefone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLlogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLnumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTbairro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLcidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcidade))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLcodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBbuscar))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBlimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBinserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLestado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLtitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodigo)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcpf)
                    .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtelefone)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlogradouro)
                    .addComponent(jTlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLnumero)
                    .addComponent(jTnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbairro)
                    .addComponent(jTbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcidade)
                    .addComponent(jLestado)
                    .addComponent(jTcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbuscar)
                    .addComponent(jBlimpar)
                    .addComponent(jBinserir))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {  
         System.out.println("INICIO  jBbuscarActionPerformed");
        BuscaGUI  b = new BuscaGUI();
        b.setVisible(true);
    }                                        
    
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("INICIO  jBlimparActionPerformed");
    	 limparCampos();
         System.out.println("FIM  jBlimparActionPerformed");
    }                                        
    

    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("INICIO  jBinserirActionPerformed");
        inserirDados();
        System.out.println("FIM  jBinserirActionPerformed");

    }//jBinserirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBinserir;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbairro;
    private javax.swing.JLabel jLcidade;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLlogradouro;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLnumero;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JTextField jTbairro;
    private javax.swing.JTextField jTcidade;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTestado;
    private javax.swing.JTextField jTlogradouro;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTnumero;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables

    public void inserirDados(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/BDCadastro", "root", "");
            java.sql.Statement stmt = con.createStatement();
            
            int cadMat = Integer.parseInt(jTcodigo.getText());
            String cadNome = jTnome.getText();
            String cadCPF = jTcpf.getText();
            String cadTelefone = jTtelefone.getText();
            String cadLogradouro = jTlogradouro.getText();
            String cadNumero = jTnumero.getText();
            String cadBairro = jTbairro.getText();
            String cadCidade = jTcidade.getText();
            String cadEstado = jTestado.getText();
            
            /*mudanca de sintaxe 
            //https://www.oficinadanet.com.br/artigo/java/criando-um-cadastro-de-usuario-em-java
            String sql = "INSERT INTO TabFicha (Matricula, Nome, CPF, Telefone, Logradoura, Numero, Bairro , Cidade, Estado) VALUES (?,?,?,?,?,?,?,?,? )";
            stmt.setString(1, CadMat);// tratar numero
            stmt.setString(2, cadNome);
            stmt.setString(3, cadCPF);*/
            stmt.executeUpdate("insert into TabFicha (Matricula, Nome, CPF, Telefone, Logradouro, Numero, Bairro, Cidade, Estado) values ('"
                + cadMat
                + "','"
                + cadNome
                + "','"
                + cadCPF
                + "','"
                + cadTelefone
                + "','"
                + cadLogradouro
                + "','"
                + cadNumero
                + "','"
                + cadBairro
                + "','"
                + cadCidade
                + "','"
                + cadEstado
                + "')");
            
            JOptionPane.showMessageDialog(null, "Dados da Matricula " + cadMat + " Salvos!");
            limparCampos();
           
            con.close();
        }//try
        catch(SQLException erro) {
        	JOptionPane.showMessageDialog(null, "Erro comando SQL " + erro.getMessage());
        }//catch
        catch (ClassNotFoundException erro) {
        	JOptionPane.showMessageDialog(null, "ClassNotFoundException - Driver não encontrado!\r"+ erro.getMessage());
        }//catch
        
    }//inserirDados
    
    
    public void limparCampos() {
    	
    	jTcodigo.setText("");
    	jTnome.setText("");
    	jTcpf.setText("");
    	jTtelefone.setText("");
    	jTlogradouro.setText("");
    	jTnumero.setText("");
    	jTbairro.setText("");
    	jTcidade.setText("");
        jTestado.setText("");
    	
    }//limparCampos 
    
    
}//class
