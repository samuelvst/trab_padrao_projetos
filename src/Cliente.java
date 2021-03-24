package trab_padrao_projetos;

public class Cliente {
    private int id;
    private String nome;
    private String data_nacimento;

    public Cliente(String nome, String data_nacimento, int id) {
        this.nome = nome;
        this.data_nacimento = data_nacimento;
        this.id = id;
    }

    public Cliente(){
        this.nome = "";
        this.data_nacimento = "";
        this.id = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String data_nacimento() {
        return data_nacimento;
    }

    public void setdata_nascimento(String data_nacimento) {
        this.data_nacimento = data_nacimento;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

}