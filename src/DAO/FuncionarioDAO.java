package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import DTO.FuncionarioDTO;

public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarServico(FuncionarioDTO objfuncionariodto) {
        String sql = "insert into servicos (nome_funcionario, nome_cliente, valor_servico, data_servico, servico_descricao) values (?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2,objfuncionariodto.getNome_cliente());
            pstm.setString(3,objfuncionariodto.getValor_servico());
            pstm.setString(4,objfuncionariodto.getData_servico());
            pstm.setString(5, objfuncionariodto.getServicoDescricao());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO " + erro);
        }
    }

}
