package com.company;

public class Main {

    public static void main(String[] args) {

	System.out.println("Hello World");
	System.out.println("Hello <EPAM>"); //Создаем конфликт для операции pull
	System.out.println("Hello pull");  // Строка изменена через браузер
	System.out.println("Hello <EPAM>");
	int newFeature1 = 10; // commit one for rebase
	int newFeature2 = 20; // commit two for rebase
	boolean xy = false; // commit for revert
    }
}
