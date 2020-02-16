$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("consultarCPF.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    },
    {
      "line": 2,
      "value": "#enconding UTF-8"
    }
  ],
  "line": 5,
  "name": "Pesquisar CPF no Site",
  "description": "\t\t\t\t\t\tEu como usuario gostaria\r\n\t\t\t\t\t\tde consultar o meu CPF no site",
  "id": "pesquisar-cpf-no-site",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@geral"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Consultar CPF no site com sucesso",
  "description": "",
  "id": "pesquisar-cpf-no-site;consultar-cpf-no-site-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 11,
  "name": "que eu preencha os dados",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "os dados do CPF estão corretos",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "o CPF é consultado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "ConsultarCpfSteps.que_eu_preencha_os_dados()"
});
formatter.result({
  "duration": 18287623300,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarCpfSteps.os_dados_do_CPF_estão_corretos()"
});
formatter.result({
  "duration": 47500,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarCpfSteps.o_CPF_é_consultado_com_sucesso()"
});
formatter.result({
  "duration": 32300,
  "status": "passed"
});
});