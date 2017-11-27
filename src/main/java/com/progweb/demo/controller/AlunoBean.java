package com.progweb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.progweb.demo.dao.AlunoDAO;
import com.progweb.demo.model.Aluno;

@ManagedBean
@SessionScoped
public class AlunoBean {

	private AlunoDAO alunoDAO = new AlunoDAO();
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Aluno aluno = new Aluno();
	
	public void listar() {
		this.alunos = this.alunoDAO.listar();
	}
	
	public void salvar() {
		this.alunoDAO.salvar(aluno);
		aluno = new Aluno();
		listar();
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public List<Aluno> getAlunos() {
		return this.alunos;
	}
	
	
	
}
