package br.edu.univas.si6.es4.builder.report;

import java.util.Date;
import java.util.List;

public class XMLBuilder implements ReportBuilder {

	private String header;
	private String body;
	private String footer;

	@Override
	public void buildHeader(Date data, int quantidade) {
		StringBuilder sb = new StringBuilder();
		sb.append("\t<header>\n");
		sb.append("\t\t<data>").append(data).append("</data>\n");
		sb.append("\t\t<quantidade>").append(quantidade);
		sb.append("</quantidade>\n");
		sb.append("\t</header>\n");
		header = sb.toString();
	}

	@Override
	public void buildBody(List<Produto> produtos) {
		StringBuilder sb = new StringBuilder();
		sb.append("\t<body>\n");
		for(Produto produto: produtos) {
			sb.append("\t\t<produto>\n");
			sb.append("\t\t\t<nome>").append(produto.getNome());
			sb.append("</nome>\n");
			sb.append("\t\t\t<quantidade>");
			sb.append(produto.getQuantidade());
			sb.append("</quantidade>\n");
			sb.append("\t\t\t<preco>");
			sb.append(produto.getPreco());
			sb.append("</preco>\n");
			sb.append("\t\t</produto>\n");
		}
		sb.append("\t</body>\n");
		body = sb.toString();
	}

	@Override
	public void buildFooter(float valorTotal) {
		StringBuilder sb = new StringBuilder();
		sb.append("\t<footer>\n");
		sb.append("\t\t<valorTotal>").append(valorTotal);
		sb.append("</valorTotal>\n");
		sb.append("\t</footer>\n");
		footer = sb.toString();
	}

	public String getResult() {
		StringBuilder sb = new StringBuilder();
		sb.append("<report>\n");
		sb.append(header);
		sb.append(body);
		sb.append(footer);
		sb.append("</report>\n");
		return sb.toString();
	}

}
