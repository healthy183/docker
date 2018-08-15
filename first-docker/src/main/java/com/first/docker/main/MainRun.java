package com.first.docker.main;

/**
 * User:
 * Description:
 * Date: 2018-08-11
 * Time: 15:34
 */
public class MainRun {

    public static void main(String[] args) {
        System.out.println("tom!");
        while(true){
            System.out.println("wait");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }
}
