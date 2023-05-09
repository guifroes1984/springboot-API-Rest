package br.com.guifroes1984.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
