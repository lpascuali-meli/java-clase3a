package meli.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona per1 = new Persona("Messi", 4000000);
        Persona per2 = new Persona("Xavi", 5000000);
        Persona per3 = new Persona("Iniesta", 60000000);
        Persona per4 = new Persona("Puyol", 4000001);
        Persona[] arr = {per1, per2, per3, per4};
        SortUtil.ordenar(arr);
        System.out.println(Arrays.toString(arr));

        Celular cel1 = new Celular(123, "Messi");
        Celular cel2 = new Celular(456, "Xavi");
        Celular cel3 = new Celular(789, "Iniesta");
        Celular cel4 = new Celular(451, "Puyol");
        Celular[] arr2 = {cel1, cel2, cel3, cel4};
        SortUtil.ordenar(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
