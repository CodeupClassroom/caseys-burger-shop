# Adding JDBC Functionality

In this branch, we will be changing the way our Burger info is stored. Rather than storing it in an **ArrayList**, we are going to be storing it in a new database, so that the burger info can persist between restarts of our server.

## Tasks
1. Create a **Config.java** file inside your **model** folder that will hold your credentials needed to connect to a local database (define the Connection _outside_ of the constructor, just like you did in the curriculum exercises).
2. In the **BurgersDao** constructor, create a connection to your MySQL Server using JDBC. (This is where we previously instantiated all of our burger objects. Keep that code there, for now.)
3. Write an **all()** method in your BurgersDao that will select all existing burger entries in the burgers DB table and return them as a List of Burger objects.
4. Write an **insert()** method in your BurgersDao that will take in a Burger object and insert it into the proper database table. This method should return the **Long id** of the newly added Burger.
5. Write a **getBurger()** method that takes in a **Long id** as an argument, and returns a **Burger** object at the provided index **id**.

`Now that you have the necessary methods, go up to your **BurgersDao** constructor and rewrite the creation of the dummy burgers to insert them into the MySQL database, rather than storing them in an ArrayList.` 

This is essentially the same thing you did for the JDBC curriculum exercises, so once you get the **BurgerDao** all swapped out for JDBC,  you can do the same for the **IngredientsDao** and **SodasDao**, so that our entire application is using MySQL instead of volatile ArrayLists.