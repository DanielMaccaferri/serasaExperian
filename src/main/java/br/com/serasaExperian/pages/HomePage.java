package br.com.serasaExperian.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.serasaExperian.core.BasePage;
import br.com.serasaExperian.core.Driver;

public class HomePage extends BasePage {

	@FindBy(xpath = "//button[@class='ecs_hl_ag ecs_hl_ah ecs_hl_el ecs_hl_ai ecs_hl_w ecs_hl_cz ecs_hl_ak ecs_hl_al ecs_hl_am ecs_hl_em ecs_hl_ao ecs_hl_ce ecs_hl_aq ecs_hl_ar ecs_hl_d ecs_hl_z ecs_hl_f ecs_hl_as ecs_hl_at ecs_hl_en ecs_hl_au ecs_hl_av ecs_hl_aw ecs_hl_ax ecs_hl_ay ecs_hl_az ecs_hl_ba ecs_hl_bb ecs_hl_bc']")
	WebElement botaoPrecisa;

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public WebElement getBotaoPrecisa() {
		return botaoPrecisa;
	}

	public void setBotaoPrecisa(WebElement botaoPrecisa) {
		this.botaoPrecisa = botaoPrecisa;
	}

}
