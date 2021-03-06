/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import classes.Funcao;
import classes.JanelasOpcoes;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import tabela.TableModelFuncao;

/**
 *
 * @author Iago2
 */
public class TelaRegistrar extends javax.swing.JFrame {

    TableModelFuncao tableModelFuncao;

    /**
     * Creates new form TelaRegistrar
     */
    public TelaRegistrar() {
        initComponents();

        this.tableModelFuncao = new TableModelFuncao();
        this.tblReg.setModel(tableModelFuncao);

//        perguntando se o usuario deseja mesmo fechar a janela quando apertar no 'X'
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (e.getID() == WindowEvent.WINDOW_CLOSING) {
                    JanelasOpcoes op = new JanelasOpcoes();
                    op.sair();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        pan2 = new javax.swing.JPanel();
        cbAno = new javax.swing.JComboBox<>();
        cbCidade = new javax.swing.JComboBox<>();
        cbDoenca = new javax.swing.JComboBox<>();
        txtCasos = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReg = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmitAbrir = new javax.swing.JMenuItem();
        jmitSalvar = new javax.swing.JMenuItem();
        jmitSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmitConsultar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmitSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Casos da Dengue no Estado do Pará");
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);

        pan2.setBackground(new java.awt.Color(51, 51, 51));
        pan2.setPreferredSize(new java.awt.Dimension(820, 420));

        cbAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Ano", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
        cbAno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbAno.setMaximumSize(new java.awt.Dimension(1000, 1000));
        cbAno.setMinimumSize(new java.awt.Dimension(0, 0));
        cbAno.setPreferredSize(new java.awt.Dimension(170, 29));

        cbCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCidade.setMaximumRowCount(20);
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Cidade", "Belém", "Ananideua", "Marituba", "Castanhal", "Parauapebas", "Altamira", "Senador José.P", "Canaã dos Carajás" }));
        cbCidade.setToolTipText("Selecione o ano para fazer a pesquisa");
        cbCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCidade.setMaximumSize(new java.awt.Dimension(1000, 1000));
        cbCidade.setMinimumSize(new java.awt.Dimension(0, 0));
        cbCidade.setPreferredSize(new java.awt.Dimension(150, 22));
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });

        cbDoenca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDoenca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dengue" }));
        cbDoenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbDoenca.setMaximumSize(new java.awt.Dimension(1000, 1000));
        cbDoenca.setMinimumSize(new java.awt.Dimension(0, 0));
        cbDoenca.setPreferredSize(new java.awt.Dimension(150, 22));

        txtCasos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCasos.setPreferredSize(new java.awt.Dimension(50, 29));

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deletar.gif"))); // NOI18N
        btnRemove.setText("Deletar");
        btnRemove.setMaximumSize(new java.awt.Dimension(1000, 1000));
        btnRemove.setMinimumSize(new java.awt.Dimension(10, 10));
        btnRemove.setPreferredSize(new java.awt.Dimension(128, 35));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Insert.gif"))); // NOI18N
        btnAdd.setText("Inserir");
        btnAdd.setMaximumSize(new java.awt.Dimension(1000, 1000));
        btnAdd.setMinimumSize(new java.awt.Dimension(10, 10));
        btnAdd.setPreferredSize(new java.awt.Dimension(128, 35));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(1000, 1000));
        btnSair.setMinimumSize(new java.awt.Dimension(10, 10));
        btnSair.setPreferredSize(new java.awt.Dimension(128, 35));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSort.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/consult.gif"))); // NOI18N
        btnSort.setText("Consultar");
        btnSort.setPreferredSize(new java.awt.Dimension(128, 35));
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        tblReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ano", "Cidade", "Doença", "Nº Casos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReg.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jScrollPane1.setViewportView(tblReg);
        if (tblReg.getColumnModel().getColumnCount() > 0) {
            tblReg.getColumnModel().getColumn(0).setResizable(false);
            tblReg.getColumnModel().getColumn(1).setResizable(false);
            tblReg.getColumnModel().getColumn(2).setResizable(false);
            tblReg.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nº Casos");

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCasos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan2Layout.createSequentialGroup()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jmitAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmitAbrir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jmitAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NovoArqui.gif"))); // NOI18N
        jmitAbrir.setText("Abrir");
        jMenu1.add(jmitAbrir);

        jmitSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmitSalvar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jmitSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Salvar.gif"))); // NOI18N
        jmitSalvar.setText("Salvar Tabela");
        jMenu1.add(jmitSalvar);

        jmitSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmitSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jmitSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sair.png"))); // NOI18N
        jmitSair.setText("Sair");
        jmitSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmitSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmitSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jmitConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmitConsultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jmitConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/consult.gif"))); // NOI18N
        jmitConsultar.setText("Consultar");
        jmitConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmitConsultarActionPerformed(evt);
            }
        });
        jMenu2.add(jmitConsultar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jmitSobre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jmitSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info.png"))); // NOI18N
        jmitSobre.setText("Sobre");
        jmitSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmitSobreActionPerformed(evt);
            }
        });
        jMenu3.add(jmitSobre);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmitConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmitConsultarActionPerformed
        // TODO add your handling code here:
        new TelaConsultar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmitConsultarActionPerformed

    private void jmitSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmitSobreActionPerformed
        // TODO add your handling code here:
        new TelaSobre().setVisible(true);
    }//GEN-LAST:event_jmitSobreActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        new TelaConsultar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        adicionar();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        apagar();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        // TODO COLOCAR EM ORDEM ALFABÉTICA OS ITENS DESSE COMBO BOX:
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        new JanelasOpcoes().sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jmitSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmitSairActionPerformed
        new JanelasOpcoes().sair();
    }//GEN-LAST:event_jmitSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaRegistrar().setVisible(true);
            }
        });
    }

    /*
     * MÉTODOS PARA DIMINUIR OS CÓDIGOS DISPOSTOS NOS EVENTOS DE BOTAO
     */
    public void adicionar() {
        //TODO: OS VALORES DE ANO E CASOS DEVEM SER DO TIPO INT. TRATAR ESSA EXCEPTION.

        String ano = cbAno.getSelectedItem().toString();
        String cidade = cbCidade.getSelectedItem().toString();
        String doenca = cbDoenca.getSelectedItem().toString();
        String casos = txtCasos.getText();

        Funcao fc = new Funcao(ano, cidade, doenca, casos);
        this.tableModelFuncao.addLinha(fc);
    }

    public void apagar() {
        //TODO: AUMENTAR A FONTE DO TEXTO NA POPUP
        Object[] op = {"Sim", "Não"};

        int i = JOptionPane.showOptionDialog(this, "Deseja realmente excluir a seleção?", "ATENÇÃO ",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);

        try {
            if (i == JOptionPane.YES_OPTION) {
                int linhaSelecionada = tblReg.getSelectedRow();
                tableModelFuncao.removerLinha(linhaSelecionada);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbDoenca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmitAbrir;
    private javax.swing.JMenuItem jmitConsultar;
    private javax.swing.JMenuItem jmitSair;
    private javax.swing.JMenuItem jmitSalvar;
    private javax.swing.JMenuItem jmitSobre;
    private javax.swing.JPanel pan2;
    private javax.swing.JTable tblReg;
    private javax.swing.JTextField txtCasos;
    // End of variables declaration//GEN-END:variables
}
