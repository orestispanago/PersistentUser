package peristentuser;

import entities.User;
import java.util.List;

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
        if (user == null) {
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
        if (delete) {
            System.out.println("User with id : " + i + " deleted successfully!");
        }

        // int id is an id (PRIMARY KEY) !! WE DON'T KNOW IF IT IS A VALID ID
        // IF IT IS VALID THEN UPDATE BY USING user object as below
//        userService.updateById(id, user);

        // INSERT
        User u1 = new User();
        u1.setFirstName("Bla");
        u1.setLastName("Blabla");
        u1.setTel("002453245");
        u1.setEmail("blabla@mail.com");
        userService.insert(u1);
        
        
        // UPDATE
         User u2=userService.findById(5);
         System.out.println("Before: "+u2);
         User u3 = new User();
         u3.setFirstName("New");
         u3.setLastName("Name");
         u3.setTel("20582551");
         u3.setEmail("newname@email.com");
         userService.update(5, u3);
         System.out.println("After: "+userService.findById(5));
        

    }

}
