algoritmo "Positivo_Qtd_Divisores"
// Fun��o :Solicita um n�mero inteiro POSITIVO e escreva em tela a QUANTIDADE de divisores que esse n�mero tem
// Autor :  Elys_Sanntos
// Data : 01/03/2020

var
num,cont,divisor:inteiro
inicio
Escreva("Digite um numero POSITIVO: ")
leia(num)
//testar quantos divisores o num tem
         cont:= num
         divisor:= 0
                   //Escvreva "l", pula uma linha
                   escreval("Divisores de: ",num, ": ")
         repita
         se(num mod cont = 0)entao
         divisor:= divisor + 1
                   //Mostra o contador que � o divisor do numero digitado
                   escreval(cont)
         fimse
         //contador decrescente
         //cont recebe novo valor: o valor que cont tinha -1
         cont:=cont -1
         ate(cont<1)


fimalgoritmo
