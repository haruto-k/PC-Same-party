#ifndef _STACK
#define _STACK

#include <stdio.h>

#define SIZE 50

void init(void);
void display(void);
void push(int n);
int pop(void);
int isFull(void);
int isEmpty(void);

#endif
