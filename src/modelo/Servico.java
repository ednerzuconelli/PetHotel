/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import exceptions.CadastroException;


public class Servico {
    private int codigo;
    private String servico;
    private String local;
    private String descricao;

    public Servico(int codigo, String servico, String local, String descricao) {
        if (local.equals("") ) {
            throw new CadastroException("Preencha descrição.");
        }
        this.codigo = codigo;
        this.servico = servico;
        this.local = local;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public String getServico() {
        return servico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return servico; //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
