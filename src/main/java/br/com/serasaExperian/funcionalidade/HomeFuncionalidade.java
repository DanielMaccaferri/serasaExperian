package br.com.serasaExperian.funcionalidade;

import org.openqa.selenium.By;
import com.github.javafaker.Faker;


import br.com.serasaExperian.pages.HomePage;

public class HomeFuncionalidade {
	
	private HomePage home;
	
	public  HomeFuncionalidade() {
		home = new HomePage();
	}
	
	public void clicarBotaoPrecisa(){
		home.getBotaoPrecisa().click();
		
	}

}


