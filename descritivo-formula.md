<img src="https://github.com/leoarcabold/calculadora-financeira-api/blob/main/img/banner.jpg">

# API Calculadora Financeira

Para que servem as fórmulas em matemática financeira?
Em uma empresa, os números significam muita coisa. Para resumir aqui, posso dizer que eles representam a saúde do negócio. Qual tem sido o lucro mensal do lugar? Quanto dinheiro tem saído? Há prejuízos? Possíveis gastos que podem ser cortados? Dívidas que precisam ser pagas? A resposta para tudo isso são números.

Através das fórmulas de matemática financeira, é possível ter uma visão ampla e precisa do que está acontecendo na empresa. Por consequência, é possível saber como administrar melhor a companhia – e o seu dinheiro.

As fórmulas, por sua vez, vêm para facilitar o seu dia a dia. Na correria da rotina, com tanto para se fazer, elas representam um atalho para essas informações. Quais as principais fórmulas da matemática financeira?
Eu fiz um compilado das fórmulas mais usadas no seu dia a dia. De uma forma ou de outra, é bastante provável que você tenha que lidar com elas com bastante frequência. 

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/20935330-787ad4ed-8d4b-4528-a3cc-8961dfc7cced?action=collection%2Ffork&collection-url=entityId%3D20935330-787ad4ed-8d4b-4528-a3cc-8961dfc7cced%26entityType%3Dcollection%26workspaceId%3Df9ad812c-0284-4ca6-be69-d25c7a98d505)

>Clone o código-fonte.

`git clone https://github.com/leoarcabold/calculadora-financeira-api.git`



#### 1 – Montante
O montante é o valor que considera o capital inicial, mais os juros aplicados sobre ele. Quando o pagamento de uma dívida atrasa, por exemplo, é essa a fórmula que você deve usar para saber qual o valor atual dessa dívida, já que ela terá a sua quantia alterada devido à aplicação de juros.

|Fórmula|Onde|
|---|---|
|<h4>M = C (1 + i .t)|<p>M = montante<p>C = capital inicial<p>J = juros<p>i = taxa de juros<p>t = prazo.|
>Recurso URL
    
`POST /calculadora/montante`
>Parametros:
    
|Nome||Descrição|
|---|---|---|
|capital|requerido|valor do capital inicial|
|taxa|requerido|taxa que será aplicada|
prazo|reguerido|prazo da aplicação|


#### 2 – Fórmula de juros simples
J = c . i . t

Considere:

C = capital inicial;
J = juros;
i = taxa de juros (em decimais, não em porcentagem);
t = prazo.
Essa fórmula é utilizada para calcular quanto de juros vai ser aplicado em uma quantia. Sabe quando você pega um dinheiro emprestado e precisa devolver um pouco a mais? É por causa da incidência desses juros simples. 

#### 3 – Fórmula de juros compostos
M = C . (1 +  i)t

J = M – C

Os juros compostos são os juros que se aplicam sobre outros juros. Vou colocar de outra forma: enquanto os juros simples são aplicados apenas no valor inicial, os compostos são aplicados ao fim de cada período, somando-se aos juros aplicados anteriormente.

#### 4 – Taxas equivalentes
1 + ia = (1 + im)t

Considere: 

ia = taxa anual
im = taxa mensal

Às vezes, nós sabemos qual é a taxa mensal de juros de uma dívida, por exemplo. Entretanto, não sabemos qual o valor da taxa anual, ou dos juros acumulados no período combinado. Esta fórmula, portanto, nos ajuda a descobrir essas informações.

#### 5 – Taxas nominais, reais e efetivas
Exemplo para compreender a fórmula:

Uma taxa de 15 % a.a., capitalização mensal, terá 16.08 % a.a. como taxa efetiva:

    15/12 = 1,25                1,012512 = 1,1608

Nas Taxas Nominais, o período de formação e incorporação dos juros ao capital não coincide com o período no qual a taxa foi referida. Ao contrário dela, nas Taxas Efetivas o período coincide. Por fim, a Taxa Real é aquela que foi corrigida no período da operação. 

#### 6 – Valor presente e futuro
M = C . (1 + i)n 

Esta fórmula é utilizada para descobrir com o valor presente de uma equação (o capital inicial), ou o valor futuro (o montante, após ter juros aplicados).

#### 7 – Porcentagem
P% = P/100

Considere:

P: o valor da porcentagem.
Calcular a porcentagem de algo é uma das tarefas mais básicas e utilizadas no dia a dia. A porcentagem de um juros, um desconto, um acréscimo… Tudo isso indica porcentagem! 

#### 8 – Variação percentual
É a comparação ou variação entre dois valores em um espaço de tempo. Pode ser de acréscimo ou decréscimo. A fórmula para calcular a variação percentual é:

Variação = Valor final - valor inicial x 100
           Valor inicial

Exemplo: 

Qual a variação percentual de um produto que antes custava R$ 15 e agora custa R$ 20?

Variação = (20 - 15 x 100)/17

Variação = 5/15 x 100

Variação = 33,33%

Desta forma, o valor do produto variou 33,33%. 

#### 9 – Desconto simples racional

O desconto simples racional é o chamado de desconto por dentro, ou desconto real. O valor do desconto é equivalente aos juros produzidos pelo valor atual do título, a uma taxa de juros e tempo correspondentes ao desconto.

A = N / (1 + i.n)
Dr = N – A

Considere:

Dr = desconto realizado;
A = valor atual;
N = valor nominal;
i = taxa de desconto;
n = quantidade de períodos.

Exemplo:

Uma Empresa deseja descontar hoje uma duplicata de valor nominal igual a R$ 10.000,00, com vencimento para daqui a 3 meses. Considerando que o banco cobra uma taxa de 2% a.m., calcular o valor do desconto simples racional.

Resolução

Temos:
N = R$ 10.000,00
i = 2% a.m.
n = 3
Calculando o valor atual:
A = N / (1 + i.n) ➡️ A = 10000 / (1 + 0,02 . 3) ➡️ A = 9433,96
Calculando o desconto realizado: 
Dr = N – A ➡️ Dr = 10000 - 9433,96 ➡️ Dr = 566,0



#### 10 – Desconto simples comercial
d = N * i * n

ou

A = N – d (lembrando que d = N * i * n)

A = N – N * i * n

A = N*(1 – i * n)

Considere: 

d = valor do desconto;
N = valor nominal do título;
i = taxa de desconto;
n = tempo (antecipação do desconto);
Esse desconto, por sua vez, é aquele no qual a taxa de desconto incide sempre sobre o montante, ou o valor futuro. Inclusive, é amplamente utilizado em descontos de duplicatas, realizados por bancos. 
