algoritmo "Nums_Pos_Neg_Div"
// Fun��o :
// Autor :
// Data : 02/03/2020
// Se��o de Declara��es 
var

num, soma, divisor: inteiro


inicio



����escreva("Voc� ver� a soma dos")
����escreva(" divisores de um n�mero.")
//divisor� := 1

��Repita
����escreva("Digite um n�mero positivo")
����leia(num);

����se(num <= 0) ent�o
��������escreva ("N�mero inv�lido.")
��������escreva (" Digite um n�mero positivo.")
��At� (num > 0)
fimrepita

��enquanto (divisor <= num) fa�a�
������in�cio�
��������se (divisor MOD num = 0) Entao
������������in�cio
��������������soma := soma + divisor
��������������divisor : = divisor + 1
������������fim

��������SENAO�
������������divisor : = divisor + 1
������fim

����escreva("A soma dos divisores")
����escreva(" deste n�mero � ")
����escreva(soma)

fimalgoritmo

fimalgoritmo
