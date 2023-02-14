#include <conio2.h>
#include <stdio.h>

int main()
{
	int num;
    textcolor(GREEN);
	gotoxy(10,10),printf("Digite um valor: ");
	scanf("%d", &num);
		
	clrscr();
	
	printf("Valor x dois: %d", num*2);
	
	getch();
}
