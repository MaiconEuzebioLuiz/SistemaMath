/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.ModeloHost;

/**
 *
 * @author maicon
 */
public class ControleHost {
//classe responsável por todas as funcionalidades da classe host, incluir, alterar, excluir, pesquisar e etc...
    ConexaoBD conex = new ConexaoBD();
    ModeloHost mod = new ModeloHost();
    
    public void salvar(ModeloHost mod){//metodo salvar com parâmetro mod do tipo ModeloHost 
        conex.conexao();
        
        conex.desconecta();
    }
}
