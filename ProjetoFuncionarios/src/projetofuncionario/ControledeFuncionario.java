package projetofuncionario;

import javax.swing.JOptionPane;


public class ControledeFuncionario {

	public static void main(String[] args) {

			Funcionario funcionario;
			
			funcionario = new Funcionario();
			
			funcionario.setMatricula(JOptionPane.showInputDialog("Digite um matricula:"));
			funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
			funcionario.setCargo(JOptionPane.showInputDialog("Digite seu Cargo:"));
			funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:")));

			
			JOptionPane.showMessageDialog(null, "Matricula: " + funcionario.getMatricula());
			JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome());
			JOptionPane.showMessageDialog(null, "Cargo: " + funcionario.getCargo());
			JOptionPane.showMessageDialog(null, "Salário: " + funcionario.getSalario());
			
			funcionario.reajustarSalario();
			
			JOptionPane.showMessageDialog(null, "Salário reajustado: " + funcionario.getSalario());

				
		}


	}


