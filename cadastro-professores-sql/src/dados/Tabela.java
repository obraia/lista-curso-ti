/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;
import java.util.List;
import javax.swing.table.AbstractTableModel;





/**
 *
 * @author Breno Lima
 */




public class Tabela extends AbstractTableModel {
   private final String colunas[] = {"id Professor", "Nome","Turma","Disciplina"};
    private List<Prof> dados;  

    
    
    public void setDados(List<Prof> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
         if(dados == null){
            return 0;
        }
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int posicao) {
       
        Prof professor = dados.get(l);
        switch (posicao) {
            case 0:
                return professor.getCodigo();
            case 1:
                return professor.getNome();
                case 2:
                return professor.getTurma();
                    case 3:
                return professor.getDisciplina();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
        
        
    }
    
    
   @Override
    public String getColumnName(int nomecampo) {
        return colunas[nomecampo];
    }
    
    
    
    
}
