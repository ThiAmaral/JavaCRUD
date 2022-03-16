
package DTO;

public class FuncionarioDTO {
    private int id_funcionario;
    private String nome_funcionario;
    private String endereco_funcionario;

    public FuncionarioDTO() {
    }

    public String getNome_funcionario() {
        return this.nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getEndereco_funcionario() {
        return this.endereco_funcionario;
    }

    public void setEndereco_funcionario(String endereco_funcionario) {
        this.endereco_funcionario = endereco_funcionario;
    }

    public int getId_funcionario() {
        return this.id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
