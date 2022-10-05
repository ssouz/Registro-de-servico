package DTO;

public class servicoDTO {

    private String nome_funcionario, nome_cliente, servicoDescricao, data_servico;
    private float valor_servico;
    private int id_servico;

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

   
    public String getData_servico() {
        return data_servico;
    }

    public void setData_servico(String data_servico) {
        this.data_servico = data_servico;
    }

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

    public float getValor_servico() {
        return valor_servico;
    }

    public void setValor_servico(float valor_servico) {
        this.valor_servico = valor_servico;
    }

}
