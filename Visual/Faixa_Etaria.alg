algoritmo "Faixa_Etaria"
// Fun��o :  Solicitar a idade de um aluno e em seguida indique em qual classifica��o ele se encaixa em fun��o de sua idade,
//de acordo com a tabela abaixo:
//Idade		 	Classifica��o
//Menos de 4 anos		Sem classifica��o
//De 4 a 10 anos		Infantil
//De 11 a 14 anos 	Infanto-Juvenil
//De 15 a 17 anos		Juvenil
//18 anos ou mais		Adulto
// Autor :   Elys_Sanntos
// Data : 01/03/2020
// Se��o de Declara��es
var
idade : inteiro
inicio

escreva("Digite a idade do Aluno: ")
Leia(idade)

Se(idade>=18)ENTAO
   escreva(idade, " anos. O aluno � um adulto")

senao
   se(idade >=15)ENTAO
      escreva(idade," anos. O aluno est� na faixa Juvenil")

   senao
      se(idade>=11)ENTAO
         escreva(idade," anos. O aluno est� na faixa Infanto-Juvenil")

      senao
         se(idade>=4)ENTAO
            escreva(idade, " anos. O aluno est� na faixa Infantil")

         senao
            escreva(idade, " anos. Sem classifica��o. Por favor, digite uma idade v�lida!")
         fimse
      fimse
   fimse
fimse

fimalgoritmo
