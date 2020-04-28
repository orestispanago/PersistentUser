/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peristentuser;

import entities.User;
import java.util.List;

/**
 *
 * @author mac
 */
public class PeristentUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            findById(int id)
            findAll()
            save(User user) // insert into
            update(int id, User user)
            deleteById(int id)
        
        */
        services.UserImpl userService = new services.UserImpl();
        User user = userService.findById(5);
        if(user == null) {
            System.out.println("Oh!!! Something is not found!!");
        } else {
            System.out.println(user);
        }
        
        List<User> users = userService.findAll();
//        for(User user1 : users) {
//            System.out.println(user1);
//        }
        
        int i = 1;
        boolean delete = userService.deleteById(i);
        if(delete)
            System.out.println("User with id : " + i + " deleted successfully!");
        
        // int id is an id (PRIMARY KEY) !! WE DON'T KNOW IF IT IS A VALID ID
        // IF IT IS VALID THEN UPDATE BY USING user object as below
        userService.updateById(id, user);
    }
    
}
