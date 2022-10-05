package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.servicoDTO;

public class servicoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<servicoDTO> lista = new ArrayList<>();

    public void cadastrarServico(servicoDTO objfuncionariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement("insert into servicos (nome_funcionario, nome_cliente, valor_servico, servico_descricao, data_servico) values (?,?,?,?,?)");
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getNome_cliente());
            pstm.setFloat(3, objfuncionariodto.getValor_servico());
            pstm.setString(4, objfuncionariodto.getServicoDescricao());
            pstm.setString(5, objfuncionariodto.getData_servico());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO cadastrar: " + erro);
        }
    }

    public  ArrayList<servicoDTO>  consultarHistoricoServicos() {
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement("select * from servicos");
            rs = pstm.executeQuery();

            while(rs.next()){
                servicoDTO objFuncionarioDTO = new servicoDTO();
                objFuncionarioDTO.setId_servico(rs.getInt("id_servico"));
                objFuncionarioDTO.setData_servico(rs.getString("data_servico"));
                objFuncionarioDTO.setNome_cliente(rs.getString("nome_cliente"));
                objFuncionarioDTO.setServicoDescricao(rs.getString("servico_descricao"));
                objFuncionarioDTO.setValor_servico(rs.getFloat("valor_servico"));
                objFuncionarioDTO.setNome_funcionario(rs.getString(	"nome_funcionario"));
                
                lista.add(objFuncionarioDTO);
            }

        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "FuncionarioDAO consultar: "+erro);
        }
        return lista;
        
    }

}
