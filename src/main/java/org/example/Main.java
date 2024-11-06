package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String response = HttpClient.request();
        System.out.println("Температура: " + Temp.temp(response) + "° по Цельсию");
        System.out.println("Средняя температура: " + Temp.tempAvg(response) + "° по Цельсию");
    }
}