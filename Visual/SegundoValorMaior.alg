algoritmo "SegundoValorMaior"
// Fun��o : Solicitar dois valores inteiros e escrever em tela os n�meros impares entre eles.
//Valide a entrada do usu�rio de forma que o segundo valor deve ser obrigatoriamente maior que o primeiro.
//Solicite novamente o segundo valor caso ele n�o seja maior que o primeiro.
// Autor : Elys_Sanntos
// Data : 01/03/2020

var
   valor1,valor2:inteiro

inicio
      Escreva("Digite o primeiro n�mero: ")
      Leia(valor1)
      Escreva("Digite o segundo valor, que seja maior que o primeiro valor: ")
      Leia(valor2)
      
                  Se(valor1 mod 2 = 1)ENTAO
                  Escreva("O primeiro valor digitado �:",valor1)
                  fimse
                       Se(valor2 mod 2 = 1)Entao
                       Escreva(" O segundo valor digitado �:",valor2)
                       senao
                            Se(valor2<=valor1)ENTAO
                            Escreva("O primeiro valor:",valor1," � menor que o segundo valor ",valor2, " O segundo valor deve ser maior!")
                            fimse
                            fimse

                            
fimalgoritmo
