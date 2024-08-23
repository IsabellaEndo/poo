package poo;

public class juntos {

	public static void main(String[] args) {

	}
	String nome;
	int idade;
	int CPF;
	int RG;
	String endereco;
	String profissao;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade= idade;
	}
	public String getEndereco () {
		return endereco;
	}
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao (){
		return profissao;
	}
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF (int CPF) {
		this.CPF = CPF;
	}
	public int getRG() {
		return RG;
	}
	public void setRG (int RG) {
		this.RG = RG;


		classePessoa pessoa2 = new classePessoa();
		classePessoa pessoa1 = new classePessoa();

		pessoa1.setNome("Tom cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California,USA");
		pessoa1.setProfissao("Ator");

		pessoa1.setRG(456863656);
		pessoa1.setCPF(474991828);

		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami,USA");
		pessoa2.setProfissao("Jogador de futebol");

		pessoa2.setRG(434538466);
		pessoa2.setCPF(474991828);

		System.out.println("-----OBJETO 1-----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getRG());
		System.out.println(pessoa1.getCPF());

		System.out.println("-----OBJETO 2-----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getRG());
		System.out.println(pessoa2.getCPF());



	}

}
