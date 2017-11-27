package com.progweb.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.progweb.demo.model.Aluno;

public class AlunoDAO {

	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public AlunoDAO() {
		Aluno aluno = new Aluno();
		aluno.setNome("Goku");
		aluno.setEmail("goku@gmail.com");
		aluno.setPeriodo(10);
		alunos.add(aluno);
	}
	
	public List<Aluno> listar() {
		return alunos;
	}
	
	public void salvar(Aluno aluno) {
		this.alunos.add(aluno);
	}
}
