package test;

/**
 * 
 * Coesão próposito de suas classes
 */
import model.Professor;

public class ProfessorTest02 {

	public static void main(String[] args) {

		Professor prof = new Professor();
		prof.nome = "Ricardo";
		prof.idade = 12;
		prof.sexo = 'M';
		
		System.out.println(prof.nome + prof.idade + prof.sexo);
		
	}

}
