/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Iago2
 */
public class Funcao {

    private String ano;
    private String cidade;
    private String bairro;
    private String doenca;
    private String casos;

    public Funcao() {
    }

    public Funcao(String ano, String cidade, String doenca, String casos) {
        this.ano = ano;
        this.cidade = cidade;
        this.doenca = doenca;
        this.casos = casos;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getCasos() {
        return casos;
    }

    public void setCasos(String casos) {
        this.casos = casos;
    }
}
