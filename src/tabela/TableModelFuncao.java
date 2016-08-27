/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import classes.Funcao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iago2
 */
public class TableModelFuncao extends AbstractTableModel {

    protected ArrayList<Funcao> linhas;
    protected String[] colunas = {"Ano", "Cidade", "Doença", "Nº Casos"};

    public TableModelFuncao() {
        this.linhas = new ArrayList<>();
    }

    public void addLinha(Funcao fc) {
        this.linhas.add(fc);
        fireTableDataChanged();
    }

    public void removerLinha(int linha) {
        this.linhas.remove(linha);
        fireTableDataChanged();
    }

    public Funcao getFuncao(int linha) {
        return linhas.get(linha);
    }

    public void setFuncao(int linha, Funcao fc) {
        linhas.set(linha, fc);
    }

    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int col) {
        if (col < getColumnCount()) {
            return colunas[col];
        }
        return super.getColumnName(col);
    }

    @Override
    public Object getValueAt(int linha, int col) {
        Funcao fc = (Funcao) linhas.get(linha);

        switch (col) {
            case 0:
                return fc.getAno();
            case 1:
                return fc.getCidade();
            case 2:
                return fc.getDoenca();
            case 3:
                return fc.getCasos();
            default:
                return null;
        }
    }
}
