

algoritmo "Maior Valor Positivo"
var
   num, maior: inteiro
inicio
      maior <- -1
      leia(num)
      enquanto (num>=0) faca
         se (num>maior) entao
            maior<-num
         fimse
         leia(num)
      fimenquanto
      se (maior<0) entao
         escreval("N�o foi digitado um valor maior que zero.")
      senao
         escreval("O maior valor digitado � ", maior)
      fimse
fimalgoritmo

