algoritmo "Escre_Impar"
// Fun��o :Solicita dois valores inteiros e escreva em tela os n�meros impares entre eles.
// Autor :   Elys_Sanntos
// Data : 01/03/2020

var
valor1,valor2: inteiro

inicio

Escreval("Digite o primeiro numero: ")
Leia(valor1)
Escreval("Digite o segundo numero: ")
Leia(valor2)

se(valor1 mod 2 = 1) ENTAO
   Escreval( "O primeiro numero digitado:",valor1," � um numero Impar.")
fimse
   se(valor1 = 0) entao
      escreval("O primeiro numero digitado foi Zero, insira um valor v�lido!")
   fimse
   
      se(valor2 mod 2 = 1) ENTAO
         Escreval(" O segundo numero digitado:",valor2," � um numero Impar.")
      senao
         se(valor2 = 0) entao
            escreval(" O segundo numero digitado foi Zero, insira um valor v�lido!")



      fimse


   fimse

fimalgoritmo
