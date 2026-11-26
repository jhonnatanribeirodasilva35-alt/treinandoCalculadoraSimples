import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);


    System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Divisão\n5 - Resto da Divisão");
    int opcao = teclado.nextInt();

    System.out.println("Digite o primeiro número: ");
    double numero1 = teclado.nextDouble();

    System.out.println("Digite o segundo número: ");
    double numero2 = teclado.nextDouble();

    double resultado = 0;
    boolean contaValida = true; // ajuda !!!!

    if (opcao == 1){
        resultado = numero1 + numero2;
    } else if (opcao == 2){
        resultado = numero1 - numero2;
    } else if (opcao == 3){
        resultado = numero1 * numero2;
    } else if (opcao == 4) {
        if(numero2 == 0){
            System.out.println("Erro: Não é possível dividir por zero!");
            contaValida = false;
        } else {resultado = numero1 / numero2;}
    } else if (opcao == 5) {
        if(numero2 == 0){
            System.out.println("Erro: Não é possível calcular o resto com zero!");
            contaValida = false;
        } else {resultado = numero1 % numero2;}
    } else {
        System.out.println("Esse valor está indisponível no momento só estás opcões estão acessíveis, qualquer dúvida converse com o adm");
        contaValida = false;
    }
    if (contaValida == true){
        System.out.println("O resultado é: " + resultado);
    }


    teclado.close();
}

