package br.com.guifroes1984.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>  {

	Curso findByNome(String nome);

}
