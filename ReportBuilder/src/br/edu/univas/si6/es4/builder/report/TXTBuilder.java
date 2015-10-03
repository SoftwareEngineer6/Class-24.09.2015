package br.edu.univas.si6.es4.builder.report;

import java.util.Date;
import java.util.List;

public class TXTBuilder implements ReportBuilder {
	
	private String header;
	private String body;
	private String footer;

	@Override
	public void buildHeader(Date data, int quantidade) {
		StringBuilder sb = new StringBuilder();
		sb.append("Relatório de produtos\n");
		sb.append("Data: ").append(data);
		sb.append(" - Quantidade total: ").append(quantidade);
		header = sb.toString();
	}

	@Override
	public void buildBody(List<Produto> produtos) {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome\tQuantidade\tPreço\n");
		for(Produto produto: produtos) {
			sb.append(produto.getNome()).append("\t");
			sb.append(produto.getQuantidade()).append("\t");
			sb.append(produto.getPreco()).append("\n");
		}
		body = sb.toString();
	}

	@Override
	public void buildFooter(float valorTotal) {
		StringBuilder sb = new StringBuilder();
		sb.append("Valor total do estoque: ").append(valorTotal);
		footer = sb.toString();
	}
	
	public String getResult() {
		StringBuilder sb = new StringBuilder();
		sb.append(header).append("\n");
		sb.append("----------------------------------------\n");
		sb.append(body).append("\n");
		sb.append("----------------------------------------\n");
		sb.append(footer).append("\n");
		return sb.toString();
	}

}
