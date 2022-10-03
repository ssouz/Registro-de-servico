package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.FuncionarioDTO;

public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public void cadastrarServico(FuncionarioDTO objfuncionariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement("insert into servicos (nome_funcionario, nome_cliente, valor_servico, data_servico, servico_descricao) values (?,?,?,?,?)");
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getNome_cliente());
            pstm.setFloat(3, objfuncionariodto.getValor_servico());
            pstm.setDouble(4, objfuncionariodto.getData_servico());
            pstm.setString(5, objfuncionariodto.getServicoDescricao());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO cadastrar: " + erro);
        }
    }

    public  ArrayList<FuncionarioDTO>  consultarHistoricoServicos() {
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement("select * from servicos");
            rs = pstm.executeQuery();

            while(rs.next()){
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                objFuncionarioDTO.setId_servico(rs.getInt("id_servico"));
                objFuncionarioDTO.setData_servico(rs.getDouble("data_servico"));
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
