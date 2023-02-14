//
// Created by gabri on 14/02/2023.
//

struct pilha {
    int info;
    struct pilha * prox;
};
typedef struct pilha Pilha;

struct fila{
    int info;
    struct fila * prox;
};
typedef struct fila Fila;

struct stringdin{
    char letra;
    struct stringdin * prox;
};
typedef struct stringdin StrDin;

void init (Pilha* *p){
    *p = NULL;
}

char isEmpty(Pilha *p){
    return p==NULL;
}

int top (Pilha *p){
    if(!isEmpty(p))
        return p->info;
    return -1;
}

void push (Pilha* *p, int x){
    Pilha *nova = (Pilha*)malloc(sizeof(Pilha));
    nova->info = x;
    nova->prox = *p;
    *p = nova;
}

void pop(Pilha* *p, int *x){
    Pilha *aux;
    if(!isEmpty(*p)){
        aux = *p;
        *x = (*p)->info;
        *p = (*p)->prox;
        free(aux);
    }
    else
        *x = -1;
}

void enqueue(Fila* *p, int x){
    Fila *aux = (Fila*)malloc(sizeof (Fila));
    Fila *nova = (Fila*)malloc(sizeof (Fila));
    nova->info = x;
    nova->prox = NULL;
    if(isEmpty(*p))
        *p = nova;
    else{
        aux = *p;
        while(aux->prox!=NULL)
            aux = aux->prox;
        aux->prox = nova;
    }
}

void reinicia(StrDin* *str){
    StrDin *aux;
    while(*str!=NULL){
        aux = *str;
        *str = (*str)->prox;
        free(aux);
    }
}

void reiniciaRecursivo(StrDin* *str) {
    if (*str != NULL){
        reiniciaRecursivo(&(*str)->prox);
        free(*str);
        *str = NULL;
    }
}