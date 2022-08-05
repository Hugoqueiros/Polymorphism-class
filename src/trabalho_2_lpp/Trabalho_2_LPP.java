package trabalho_2_lpp;

import java.util.Scanner;

public class Trabalho_2_LPP {

    public static void main(String[] args) {

        System.out.println("    GESTÃO AEROPORTO    ");

        Scanner leitura = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        Aviao aviao = new Aviao();
        int i = 0, n = 0, k = 0, l = 0, m = 0;
        int escolha;

        System.out.println("");
        System.out.printf("Insira a Matrícula do Transporte: ");
        veiculo.setMatricula(leitura.nextLine());
        System.out.printf("Insira a Lotação Máxima do Transporte: ");
        veiculo.setCapacidade(leitura.nextInt());
        leitura.nextLine();
        System.out.printf("Insira a origem da Viagem: ");
        aviao.setOrigem(leitura.nextLine());
        if (aviao.getOrigem().equals("")) {
            System.out.println("Deve inserir o ponto de partida da sua viagem");
        } else {
            System.out.printf("Insira o Destino da Viagem: ");
            aviao.setDestino(leitura.nextLine());
            if (aviao.getDestino().equals("")) {
                System.out.println("Deve inserir o ponto de chegada da sua viagem");
            } else {
                System.out.println("Quantos passageiros irão a bordo?");
                n = leitura.nextInt();
                aviao.setLotacao_pa(n);
                Passageiro[] p = new Passageiro[n];
                System.out.println("Quantos Pilotos irão a bordo?");
                k = leitura.nextInt();
                Pessoa[] pess = new Pessoa[k];
                if (k < 0) {
                    System.out.println("É necessário introduzir pilotos");
                } else {
                    if (aviao.getLotacao_pa() + aviao.getLotacao_pi() > veiculo.getCapacidade()) {
                        System.out.println("Foram inseridas Pessoas a mais");
                    } else {
                        aviao.setLotacao_pi(k);
                        Piloto pi = new Piloto();
                        veiculo.aviao = aviao;
                        veiculo.print();
                        do {
                            System.out.println("\n|1 - Inserir Passageiros");
                            System.out.println("|2 - Inserir Pilotos");
                            System.out.println("|3 - Verificar Lista de Passageiros");
                            System.out.println("|4 - Verificar Lista de Pilotos");
                            System.out.println("|5 - Sair|");
                            System.out.printf("\nEscolha uma das opções: ");
                            escolha = leitura.nextInt();
                            switch (escolha) {

                                case 1:
                                    if (i < n) {
                                        System.out.println("\nInsira a " + (i + 1) + "ª pessoa ");
                                        p[i] = new Passageiro();
                                        leitura.nextLine();
                                        System.out.printf("Nome: ");
                                        p[i].setNome(leitura.nextLine());
                                        System.out.printf("Nacionalidade: ");
                                        p[i].setNacionalidade(leitura.nextLine());
                                        System.out.printf("Idade: ");
                                        p[i].setIdade(leitura.nextInt());
                                        leitura.nextLine();
                                        System.out.printf("Nº de Passaporte: ");
                                        p[i].setPassaporte(leitura.nextLine());
                                        p[i].verificaNacionalidade(aviao.getOrigem());
                                        i++;
                                    } else {
                                        System.out.println("Os passageiros já foram todos inseridos!");
                                    }
                                    break;

                                case 2:
                                    if (l < aviao.getLotacao_pi()) {
                                        System.out.println(pess.length);
                                        System.out.println("\nInsira o " + (l + 1) + "º piloto ");
                                        leitura.nextLine();
                                        System.out.printf("Nome: ");
                                        pi.setNome(leitura.nextLine());
                                        System.out.printf("Nacionalidade: ");
                                        pi.setNacionalidade(leitura.nextLine());
                                        System.out.printf("Idade: ");
                                        pi.setIdade(leitura.nextInt());
                                        leitura.nextLine();
                                        System.out.printf("Carta de Piloto: ");
                                        pi.setCarta_piloto(leitura.nextLine());
                                        pess[l] = pi;
                                        l++;
                                    } else {
                                        System.out.println("Os pilotos já foram todos inseridos!");
                                    }
                                    break;

                                case 3:
                                    System.out.println("");
                                    for (m = 0; m < p.length; m++) {
                                        p[m].print();
                                    }
                                    break;

                                case 4:
                                    System.out.println("");
                                    for (int j = 0; j < pess.length; j++) {
                                        pess[j].print();
                                    }
                                    pess.clone();
                                    break;
                                    

                                default:
                                    System.out.println("Escolha uma opção válida");
                                    break;
                            }
                        } while (escolha != 6);
                    }

                }
            }
        }
    }
}