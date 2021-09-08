package com.company;

enum Country {
    CANADA("CAD"){
    @Override
    void sayHello(){
        System.out.println("Hello");}
    },
    POLAND("PLN"){
        @Override
        void sayHello(){
            System.out.println("Cześć");
        }
    },
    GERMANY("EUR"){
        @Override
        void sayHello(){
            System.out.println("Hallo");
        }
    },
    ZIMKABU(){
        @Override
        void sayHello(){
            System.out.println("Lapapioooo");
        }
    },
    LAOPAPAS{
        @Override
        void sayHello(){
            System.out.println("Shakalaka");
        }
    };
    String currency;

    Country(String currency){
        this.currency = currency;
    }
    Country(){}
    boolean hasCurrency(){
        return currency != null;
    }
    abstract void sayHello();

    }
