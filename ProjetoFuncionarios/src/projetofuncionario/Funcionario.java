package projetofuncionario;

public class Funcionario {
	private String matricula;
	private String nome;
	private String cargo;
	private double salario;

	
	public Funcionario() {
				
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;	

	}

	public void setNome(String nome) {
		this.nome = nome;	

	}

	public void setCargo(String cargo) {
		this.cargo = cargo;	

	}
	
	public void setSalario(double salario) {
		this.salario = salario;	

	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCargo(){
		return this.cargo;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	
	public void reajustarSalario() {
		if (this.cargo.equalsIgnoreCase("Gerente")) {
			this.salario = this.salario * 1.10; 
			
		} else if (this.cargo.equalsIgnoreCase("Vendedor")) {
			this.salario = this.salario * 1.05; 
	
		} else {
			this.salario = this.salario * 1.01; 
		}
	}
	

}
