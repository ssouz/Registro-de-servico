package DTO;

public class FuncionarioDTO {

    private String nome_funcionario, data_servico, nome_cliente, valor_servico, servicoDescricao;

    /**
     * @return the nome_funcionario
     */
    public String getNome_funcionario() {
        return nome_funcionario;
    }

    /**
     * @param nome_funcionario the nome_funcionario to set
     */
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getServicoDescricao() {
        return servicoDescricao;
    }

    public void setServicoDescricao(String servicoDescricao) {
        this.servicoDescricao = servicoDescricao;
    }

    /**
     * @return the data_servico
     */
    public String getData_servico() {
        return data_servico;
    }

    /**
     * @param data_servico the data_servico to set
     */
    public void setData_servico(String data_servico) {
        this.data_servico = data_servico;
    }

    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the valor_servico
     */
    public String getValor_servico() {
        return valor_servico;
    }

    /**
     * @param valor_servico the valor_servico to set
     */
    public void setValor_servico(String valor_servico) {
        this.valor_servico = valor_servico;
    }

}
