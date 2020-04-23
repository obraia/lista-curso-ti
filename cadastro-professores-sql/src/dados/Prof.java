/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import gui.Cad_Prof;


public class Prof {
    
    // definindo variáveis
    private int codigo;
    private String nome;
    private int turma;
    private String disciplina;

    
    
   public Prof() {
        this.codigo = 0;
        this.nome = "";
        this.turma = 0;
        this.disciplina = "";
    } 
   
    
    // get e set  código professor
    public int getCodigo() {
        return codigo;
    }
    
 
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    // get e set nome professor
     public String getNome() {
        return nome;
    }
    
   public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    } 
   
    
}

 
