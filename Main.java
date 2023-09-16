    import java.util.Scanner;
     class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Olá! Tudo bem?");
            System.out.println("Digite um número de 1 a 7 de acordo com o dia da semana: ");
            byte dia = input.nextByte();

            switch (dia){
                case 1:
                    System.out.println("Hoje é dia: " + dia + " - Domingo");
                    break;
                case 2:
                    System.out.println("Hoje é dia: " + dia + " - Segunda");
                    break;
                case 3:
                    System.out.println("Hoje é dia: " + dia + " - Terça");
                    break;
                case 4:
                    System.out.println("Hoje é dia: " + dia + " - Quarta");
                    break;
                case 5:
                    System.out.println("Hoje é dia: " + dia + " - Quinta");
                    break;
                case 6:
                    System.out.println("Hoje é dia: " + dia + " - Sexta");
                    break;
                case 7:
                    System.out.println("Hoje é dia: " + dia + " - Sabádo");
                    break;
                default:
                    System.out.println("Dia não encontrado");
            }
        }
    }