package entities;

public class Ocorrencias {

	private String tipo;
	private String descricao;
	Usuario usuario;

	private static Ocorrencias[] listaOcorrencias = new Ocorrencias[5];
	private static int indice = 0;

	public Ocorrencias(String tipo, String descricao, Usuario usuario) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.usuario = usuario;
	}

	public Ocorrencias() {
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Tipo= " + tipo + ", Descricao= " + descricao + ", Usuario= " + usuario.getNome();
	}

	public void addOcorrencias(Ocorrencias ocorrencias) {
		if (indice < listaOcorrencias.length) {
			listaOcorrencias[indice] = ocorrencias;
			indice++;
			System.out.println("Ocorrência registrada com sucesso!");
		} else {
			System.out.println("* Erro! Falha ao adicionar ocorrência, lista de ocorrências cheia.");
		}
	}

	public void listarOcorrencia() {
		if (listaOcorrencias[0] == null) {
			System.out.println("Nenhuma ocorrência registrada!");
			}else {
		for (Ocorrencias ocorrencias : listaOcorrencias) {
				if (ocorrencias != null) {
					System.out.println(ocorrencias);
				}
			}
		}
	}
}
