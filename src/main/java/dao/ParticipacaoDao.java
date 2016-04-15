package dao;

import java.util.List;

import dominio.Artista;
import dominio.Filme;
import dominio.Participacao;

public interface ParticipacaoDao {
	public void inserir(Participacao x);
	public void atualizar(Participacao x);
	public void excluir(Participacao x);
	public Participacao buscar (int cod);
	public List<Participacao> buscarTodos();
	public Participacao buscarExato(String personagem, Artista artista, Filme filme);
	public Participacao buscarExatoDiferente(Integer codigo, String personagem, Artista artista, Filme filme);

}
