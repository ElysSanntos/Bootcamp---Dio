algoritmo "DivisivelPorCinco"
// Fun��o :solicite um n�mero inteiro POSITIVO e verifique se esse n�mero � divis�vel por 5.
// Autor :  Elys_Sanntos
// Data : 01/03/2020

var

   NumPos, resto: inteiro

inicio
   Escreva("Digite um n�mero Positivo: ")
   Leia(NumPos)
   
   resto:= NumPos mod 5
               Se(resto = 0)  Entao
               Escreva(NumPos," � divisivel por 5;")
               senao
               escreva(NumPos," n�o � divisivel por 5;")
               fimse
   


fimalgoritmo
