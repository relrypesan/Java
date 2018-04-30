/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.preparacao;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author CMU
 */
public abstract class PanelCelulaPreparacao extends javax.swing.JPanel {

    private final int id;
    private ImageIcon icon;
    javax.swing.border.LineBorder bordaPadrao;
    private boolean celulaSelecionada = false;

    public int getId() {
        return id;
    }

    /**
     * Creates new form PanelCelulaAgua
     *
     * @param id
     */
    public PanelCelulaPreparacao(int id) {
        this.id = id;
        initComponents();
        setOpaque(false);
        bordaPadrao = new javax.swing.border.LineBorder(new java.awt.Color(52, 51, 4));
        setBorder(bordaPadrao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblState = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(50, 50));
        setPreferredSize(new java.awt.Dimension(50, 50));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lblState.setBackground(new java.awt.Color(255, 255, 255));
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblState, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblState, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        enteredCelula();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        exitCelula();
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        clickCelula();
    }//GEN-LAST:event_formMousePressed

    public void enteredCelula() {
        if (!celulaSelecionada) {
            setBorderEntered();
        }
    }

    public void exitCelula() {
        if (!celulaSelecionada) {
            setBorder(bordaPadrao);
        }
    }

    public void clickCelula() {

    }

    // borda para quando sobrepoe uma sequencia do navio que já foi colocado em campo
    public void setBorderSobreposta() {
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
    }

    // borda quando o mouse entra na celula
    public void setBorderEntered() {
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));
    }

    // borda quando o local do navio é selecionado
    public void setBorderSelected() {
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        celulaSelecionada = true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblState;
    // End of variables declaration//GEN-END:variables

    public boolean isCelulaSelecionada() {
        return celulaSelecionada;
    }

    public void setCelulaSelecionada(boolean celulaSelecionada) {
        this.celulaSelecionada = celulaSelecionada;
    }
}
