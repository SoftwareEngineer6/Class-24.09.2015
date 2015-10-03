package br.edu.univas.si6.es4.builder.report;

import java.util.Date;
import java.util.List;

public interface ReportBuilder {

	public void buildHeader(Date data, int quantidade);

	public void buildBody(List<Produto> produtos);

	public void buildFooter(float valorTotal);

}
