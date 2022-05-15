package com.codegym;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b =b;
        this.c =c;
    }
    public double getter(String value){
        if (value == "a"){
            return this.a;
        }else if(value == "b"){
            return this.b;
        }else if (value == "c"){
            return this.c;
        }else{
            System.out.println("nhập vào a,b hoặc c");
            return 0;
        }

    }
    public double getDiscriminant(){
        double delta;
        delta = Math.pow(this.b,2)-4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double x1=(-this.b + Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        return x1;
    }
    public double getRoot2(){
        double x2=(-this.b - Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        return x2;
    }

}
