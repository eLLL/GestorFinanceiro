/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dlp.view;

/**
 *
 * @author USUARIO
 */
public class RelatorioDespesa extends javax.swing.JFrame
{

    /**
     * Creates new form RelatorioDespesa
     */
    public RelatorioDespesa()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_relatorio = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador Financeiro - Relatório Despesa");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório de Despesas",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Ferramentas"));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 51, 51));
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        jPanel11Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7).addContainerGap()));
        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING));

        tb_relatorio.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
                { "Almoço", "Alimentação", "01/06/2014", new Double(10.0) },
                { "Almoço", "Alimentação", "05/06/2014", new Double(7.5) },
                { "Almoço", "Alimentação", "09/06/2014", new Double(12.9) },
                { "Compras mês", "Mercado", "15/06/2014", new Double(150.0) },
                { "Camisas", "Roupas", "01/07/2014", new Double(350.4) },
                { "Janta", "Alimentação", "02/07/2014", new Double(76.9) },
                { "Almoço", "Alimentação", "08/08/2014", new Double(15.9) },
                { "Lanche", "Alimentação", "12/08/2014", new Double(11.0) },
                { "Compras", "Mercado", "01/09/2014", new Double(176.5) },
                { "Almoço", "Alimentação", "15/09/2014", new Double(9.5) },
                { "Almoço", "Alimentação", "17/09/2014", new Double(13.4) } }, new String[] { "Descrição",
                "Categoria", "Data", "Valor" })
        {
            Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.Double.class };

            public Class getColumnClass(int columnIndex)
            {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_relatorio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGroup(
                        jPanel1Layout
                                .createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        jPanel1Layout
                                .createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        jMenu1.setText("Adicionar");

        jMenuItem3.setText("Receita");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Despesa");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenu6.setText("Categoria");

        jMenuItem9.setText("Receita");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("Despesa");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatório");

        jMenuItem5.setText("Receita");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Despesa");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenuItem6MouseClicked(evt);
            }
        });
        jMenuItem6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem8.setText("Geral");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenuItem8MouseClicked(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jButton7ActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenuItem3MouseClicked

        AddReceita frame = new AddReceita();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem3ActionPerformed

        AddReceita frame = new AddReceita();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenuItem4MouseClicked

        AddDespesa frame = new AddDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem4ActionPerformed

        AddDespesa frame = new AddDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem9ActionPerformed

        CategoriaReceita frame = new CategoriaReceita();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem10ActionPerformed

        CategoriaDespesa frame = new CategoriaDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenuItem5MouseClicked

        RelatorioReceita frame = new RelatorioReceita();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem5ActionPerformed

        RelatorioReceita frame = new RelatorioReceita();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenuItem6MouseClicked

        RelatorioDespesa frame = new RelatorioDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem6MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem6ActionPerformed

        RelatorioDespesa frame = new RelatorioDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenuItem8MouseClicked

        RelatorioReceitaDespesa frame = new RelatorioReceitaDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem8MouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenuItem8ActionPerformed

        RelatorioReceitaDespesa frame = new RelatorioReceitaDespesa();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        Sobre frame = new Sobre();
        frame.setVisible(true);
    }// GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_jMenu4ActionPerformed

        Sobre frame = new Sobre();
        frame.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt)
    {// GEN-FIRST:event_jMenu5MouseClicked

        System.exit(0);
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenu5MouseClicked

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RelatorioDespesa.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RelatorioDespesa.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RelatorioDespesa.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RelatorioDespesa.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RelatorioDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_relatorio;
    // End of variables declaration//GEN-END:variables
}
