package org.junit;

public class Calculation {
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x-y;
    }
    public int mul(int x, int y){
        return x*y;
    }
    public int divide(int x, int y){
        return x/y;
    }

    public boolean gt(int x, int y){
        if(x>y) return true;
        return false;
    }

    public static void main(String[] args) {

    }

}
