package importadados;

public class Cadastro implements Comparable<Cadastro>{

    private String nome, cpf, rg, data_nasc, endereco, cidade, estado;
    private int numero;

    public Cadastro(String nome, String cpf, String data_nasc, String endereco, String numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.numero = Integer.parseInt(numero);
        this.cidade = cidade;
        this.estado = estado;

    }

    Cadastro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int compareTo(Cadastro x) {
        if (this.nome.compareTo(x.nome) > 0) {
            return 1;
        }
        if (this.nome.compareTo(x.nome) < 0) {
            return -1;
        }

        return 0;

    }
    
    @Override
    public String toString(){
        
        return this.nome+","
                
                
                
                
                +this.cpf+","+this.data_nasc+","+this.endereco+","+this.numero+","+this.cidade+","+this.estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean existe (String s){
        if(this.nome.toLowerCase().contains(s.toLowerCase()))
            return true;
        return false;
    }
}
