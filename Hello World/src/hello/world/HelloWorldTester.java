/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import static java.time.Clock.system;

/**
 *
 * @author hawu
 */
public class HelloWorldTester {
    public static void main(String[] args) {
        {
        HelloWorld world = new HelloWorld("World");
        String greeting = world.sayHello();
        System.out.println(greeting);
        }
    }
}
