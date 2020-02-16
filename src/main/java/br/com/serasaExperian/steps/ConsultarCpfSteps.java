package br.com.serasaExperian.steps;
import static br.com.serasaExperian.core.Driver.getDriver;

import br.com.serasaExperian.funcionalidade.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ConsultarCpfSteps {

	String url = "https://www.serasaconsumidor.com.br/";
    HomeFuncionalidade home = new HomeFuncionalidade();
    
	@Dado("^que eu preencha os dados$")
	public void que_eu_preencha_os_dados() throws Throwable {
		getDriver().get(url);
		home.clicarBotaoPrecisa();
		
	}

	@Quando("^os dados do CPF estão corretos$")
	public void os_dados_do_CPF_estão_corretos() throws Throwable {
		
	}

	@Entao("^o CPF é consultado com sucesso$")
	public void o_CPF_é_consultado_com_sucesso() throws Throwable {
	}

}
