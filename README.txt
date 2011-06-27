Story Board

História: Requisição de Simulação de Crédito

Sendo uma pessoa que precisa de crédito 
Posso acessar o simulador de crédito ACME
Pois assim saberei das opções que tenho para requisitar.

Aceitação:

Dado que sou um usuário do site de simulação de crédito
Quando peço uma simulação de crédito abaixo de R$500
Então o máximo de parcelas que poderei parcelar serão de 5

Dado que sou um estagiário
Quando peço R$500 
       e tenho renda de R$800
       e indico parcelamento em 4 vezes
Então o Sistema vai negar o empréstimo 
       indicando que tenho acesso apenas a 
       60% da minha renda, ou seja, R$480
	  
Dado que sou um funcionário de uma empresa
Quando peço R$4200 
       e tenho renda de R$10000
       e indico parcelamento em 12 vezes
Então o sistema vai permitir 
       e vai me indicar parcelas de R$350

Dado que sou um funcionário de uma empresa
Quando peço R$4200 
       e tenho renda de R$10000
       e indico parcelamento em 12 vezes
Então o sistema vai permitir 
       e vai me indicar parcelas de R$350