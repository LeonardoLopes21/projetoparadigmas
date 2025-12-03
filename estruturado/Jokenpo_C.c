#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int usuario, pc;
    char jogarNovamente = 's';

    srand(time(NULL));

    while (jogarNovamente == 's' || jogarNovamente == 'S') {

        printf("\n=== Pedra (1), Papel (2) ou Tesoura (3)? ===\n");
        printf("Digite sua escolha: ");
        scanf("%d", &usuario);

        pc = rand() % 3 + 1; 
        printf("Você escolheu: %d\n", usuario);
        printf("Computador escolheu: %d\n", pc);

        if (usuario == pc) {
            printf("Empate!\n");
        } else if ((usuario == 1 && pc == 3) ||
                   (usuario == 2 && pc == 1) ||
                   (usuario == 3 && pc == 2)) {
            printf("Você venceu!\n");
        } else {
            printf("Você perdeu!\n");
        }

        printf("\nQuer jogar de novo? (s/n): ");
        scanf(" %c", &jogarNovamente); 

    }

    printf("\nObrigado por jogar!\n");
    return 0;
}
