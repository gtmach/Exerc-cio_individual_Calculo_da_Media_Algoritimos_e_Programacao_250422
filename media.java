import java.util.InputMismatchException; //importa exception que pode ocorrer no codigo, ao entrar com dados em formato incorreto
import java.util.Scanner; //importa o scanner para receber entradas

public class media { //inicia a classe
    public static void main(String[] args) { //inicia o método main
        try { // inicia o try para tentar pegar e tratar alguma possivel exepction
            double ac1, ac2, ag, af, notaFinal; //inicia as variaveis utilizadas no calculo
            Scanner sc = new Scanner(System.in); //inicia o scanner

            System.out.println("Digite suas notas como solicitado para calcular a media"); //instrui o usuario
            System.out.println("\n"); //pula linha

            System.out.print("Nota da AC1: "); // texto solocitando nota da AC1
            ac1 = sc.nextDouble() * 0.15; //multiplica a entrada por 0.15 e atribui o valor a ac1
            System.out.print("Nota da AC2: "); // texto solocitando nota da AC2
            ac2 = sc.nextDouble() * 0.3; //multiplica a entrada por 0.3 e atribui o valor a ac2
            System.out.print("Nota da AG: "); // texto solocitando nota da AG
            ag = sc.nextDouble() * 0.1; //multiplica a entrada por 0.1 e atribui o valor a ag
            System.out.print("Nota da AF: "); // texto solocitando nota da AF
            af = sc.nextDouble() * 0.45; //multiplica a entrada por 0.45 e atribui o valor a af

            notaFinal = ac1 + ac2 + ag + af; //calcula a media ao somar os pontos de cada nota

            if (ac1 < 0 || ac1 > 10 || ac2 < 0 || ac2 > 10 || ag < 0 || ag > 10 || af < 0 || af > 10) { //verifica se alguma nota possui valor negativo ou é maior do que 10
                System.out.println("Nenhuma nota pode ser negativa ou maior do que 10, Tente novamente."); //mostra a mensagem na tela
                media.main(args); ///executa o metodo main novamente (reinicia o programa) para que seja executado novamente, possibilitando o usuario digitar entradas adequadas
            }

            System.out.printf("Sua media foi: %.2f%n", notaFinal); //mostra na tela o texto com a nota final formatada em duas casas decimais

            if (notaFinal >= 8 && notaFinal <= 10) { //verifica se a nota é maior ou igual a 5 e menor ou igual a 10
                System.out.println("Status: APROVADO"); //caso a condicao seja verdadeira, mostra a mensagem
            } else if (notaFinal >=6 && notaFinal <8) { //verifica se a nota é menor ou igual a 65 e menor que 8
                System.out.println("Status: RECUPERACAO"); //caso esta condicao seja verdadeira, mostra a mensagem
            } else if (notaFinal < 6 && notaFinal >= 0) { //verifica se a nota é menor que 6 e maior ou igual a 0
                System.out.println("Status: REPROVADO"); //caso esta condicao seja verdadeira, mostra a mensagem
            } else { //verifica se a nota esta fora dos intervalos definidos anteriormente, provavelmente por digitar algum numero incorretamente, resultando em nota fora do intervalo 0-10.
                System.out.println("Sua nota é invalida, nao esta no intervalo de 0-10. Tente novamente"); //mostra a mensagem caso a condicao seja verdadeira
                media.main(args); ///executa o metodo main novamente (reinicia o programa) para que seja executado novamente, possibilitando o usuario digitar entradas adequadas
            }
        } catch (InputMismatchException ex) { //trata esta exeption, caso nao seja digitado um formato de entrada que o codigo trabalhe ( entrada nao seja numero inteiro ou decimal)
            System.out.println("\n"); //pula linha
            System.err.println("Entrada invalida."); //retorna texto em formato de erro
            System.err.println("Erro: InputMismatchException"); //retorna o texto em formato de erro
            System.out.println("\n"); //pula linha
            media.main(args); //executa o metodo main novamente (reinicia o programa) para que seja executado novamente, possibilitando o usuario digitar entradas adequadas
        }

        }
    }
