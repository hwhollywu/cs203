/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;
/**
 *
 * @author hawu
 */
public class HelloWorld {
    /**
     * @param args the command line arguments
     */
    public HelloWorld(String aName)
    {
        name = aName;
    }
    public String sayHello()
    {
        return "Hello," + name + "!";
    }
    private String name;

    
}
