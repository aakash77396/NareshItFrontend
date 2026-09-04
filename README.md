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

``` #include<stdio.h>
    void main(){
        int a =100;
        printf("A = %d", a);
    }
```
