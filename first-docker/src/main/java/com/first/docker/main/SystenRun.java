package com.first.docker.main;

/**
 * User:
 * Description:
 * Date: 2018-08-15
 * Time: 13:28
 */
public class SystenRun {

    public static void main(String[] args) {
        String host = "DOCKER_HOST";
        String docker_host = System.getenv("DOCKER_HOST");
        System.out.println(docker_host);
    }
}
