### Pascal Casing
- No space in the sentance.
- first letter of each word should be capital.
- Sentense should not start with digits.
- we can use only _ and $ symbol. No other sysbols are allowed.
- Sentense can contain digits.
```     Ex: English- Dog Loves to play
        Pascal- DogLovesToPlay
```

### Camel Casing
- No space in the sentance.
- first letter of first word will be small and first letter of next first letter of  each word should be capital.
- Sentense should not start with digits.
- we can use only _ and $ symbol. No other sysbols are allowed.
- Sentense can contain digits.
```     Ex: English- Dog Loves to play
        Camel- dogLovesToPlay
```

### What type of data can be used to write C code?
- Digits
- Characters (uppercase, Lowercase, Symbols)

### What is Data Types ?
- It is a pre-defined word/keyword used to describe the tye of the data or value.
- Ex: int, float, double, char, String, etc...
```
Types:  (1) Primitive Datatypes : byte, short, int, long, float, double, char, boolean 
            int ------------------------integers-----------------------" %d "
            double ---------------------decimal point numbers----------" %1f "
            float ---------------------decimal point numbers-----------" %f "
            char ---------------------Single characters----------------" %c "

        (2) Non - Primitive Datatypes
             String -------------------group of characters--------------" %s "

```

### What is variable?
- It is a memory-block used to store the data.
``` 1. Variable declaration: It is a process of reserving a small memory to store the data in it.
        Syntax: datatype variableName;
        Ex:  int    a;
             double b;

    2. Variable initialization: It is the process of initializing/ assigning value into the already created memory.
        Syntax: variableName = data;
        Ex: int a = 100;
```
- Can we do both(variable declaration and intitialization) in single line? - Yes, int a = 100;
- variable name follow camel casing.

```text #include<stdio.h>
    void main(){
        int a =100;
        printf("A = %d", a);
    }
```

### How to store and print double value in a variable:

```text
#include<Stdio.h>
void main(){
    double height = 5.8;
    printf("My height = %.2lf",height);
}

```

### How to store and print float value in a variable:

```text
#include<Stdio.h>
void main(){
    float height = 5.8f;
    printf("My height = %.2f",height);
}

```

### How to store and print char value in a variable:

```text
#include<Stdio.h>
void main(){
    char grade = 'A';
    printf("My 10th class grade = %c",grade);
}

```

### How to store and print String value in a variable:

```text
#include<Stdio.h>
void main(){
    char name[30] = "Aakash";
    printf("My name is: %s",name);
}

```
### How to read data from user during running the program.
- printf() -> is used to print the data.
- scanf()  -> is used to read data from user.

```text
- WAPTP sum of two integers. read two integers from user.

#include<Stdio.h>
void main(){
    int a,b;
    printf("Enter first number: ");
    scanf("%d",&a);

    printf("Enter second number: ");
    scanf("%d",&b);

    printf("Sum = %d ",a+b);    
}

- WAPTP Intrest of princple Amount
#include<stdio.h>
void main(){
    double p,r,t;
    printf("Enter principle amount:");
    scanf("%lf",&p);
    printf("Enter rate of intrest:");
    scanf("%lf",&r);
    printf("Enter time period in years:");
    scanf("%lf",&t);

    double intrest = (p*t*r)/100;
    printf("Principle Amount = %.2lf\n",p);
    printf("Intrest Amount = %.2lf\n",intrest);
    printf("Total Amount = %.2lf\n", p + intrest);
}

```
--- 

### Control statement
```text
- These are the pre-defined statements used to control the execution flow of a program.
    - decision making statements/conditional statements
    1: if                                       if(condition:true){...}
    2: if-else                                  if(condition:true){...}else{condition:false}
    3: if-else-if / if-else-ladder              if(condition:true){...}else if(condition:true){...}
                                                else{condition:false}
    4: switch                                   switch(expresition){ case 1: printf( " " );
                                                                      case 2: printf{...}};
                                                                      default: printf{...};
    - if no any break then executes all next cases including default;
    - if you have multiple line of codes in case, then you can use blocks. case 1: {...}
    - case values may be int,char or String
    - case values cannot be decimal point & boolean values
    - all the case values must be of the same data type.
    - 

    - looping statements
    1: for loop
    2: while loop
    3: do-while loop

    - jumping statements
    1: break
    2: continue

```
---
### Loops
- Loop - loop is a pre defined statements used to execute same set of lines repeatedly.

```text
- for loop:
    syntax:
    for(variable declaration & initialization; condtion; update){...}

   case 1: if no i++ or i-- and first condition is satisfied then loop will be infinite
   case 2: if first condition will fail then not entered in for loop inside.
   case 3: if no condition(like i<n) then loop will infinite
   case 4: condition is boolean value true then loop will infinite
   case 5: condition is boolean value false then loop will not exexute


``` 
### perfect number
- sum of all positive factor excluding n equal to n.
```text
#include<stdio.h>
void main(){
    printf("Enter any number: ");
    int num;
    scanf("%d",&num);
    int sum =0;
    for(int i=1;i<num;i++){
        if(num % i ==0){
            sum +=i;
        }
    }
    if(sum == num){
        printf("Perfect number\n");
    }else printf("Not a perfect number\n");
}
```




