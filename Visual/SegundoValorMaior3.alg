algoritmo "SegundoValorMaior"
// Fun��o : Solicitar dois valores inteiros e escrever em tela os n�meros impares entre eles.
//Valide a entrada do usu�rio de forma que o segundo valor deve ser obrigatoriamente maior que o primeiro.
//Solicite novamente o segundo valor caso ele n�o seja maior que o primeiro.
// Autor : Elys_Sanntos
// Data : 01/03/2020

var
   valor1,valor2,v1:inteiro

   inicio
         Escreva("Digite um numero: ")
         leia (valor1)
         escreva("Digite um numero  maior que o primeiro: ")
         leia(valor2)
      se(valor1 < valor2)ENTAO
      enquanto (valor1>valor2) faca
      escreva("Digite o segundo numero maior que o primeiro")
      Leia(valor2)
      fimenquanto
                 se(valor1 mod 2 = 1)ENTAO
                 v1 <- valor1
                 Enquanto
                 (v1 < valor2)FACA
                 v1<- v1 + 1
                 Se(v1<- valor2)ENTAO
                 Escreva(v1)
                 fimse
                 fimenquanto
      senao
      v1<- v1 + 1
      Enquanto
      (v1 < valor2)faca
      v1<- v1 + 1
      Se(v1<= valor2)entao
      escreva(v1)
      fimse
      fimenquanto
      fimse
      
      
      


         
      fimse
      


   fimalgoritmo
