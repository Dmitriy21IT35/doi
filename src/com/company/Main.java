package com.company;

class Produc{
    interface Product{
    }
}
class Use{
    interface User{
    }}
public class Main {
public class Product implements Produc.Product {
    String name;
    String price;
    String rating;

    public  void name() {
        System.out.println ("Название продукта");
    }
    public void price(){
        System.out.println ("Цена");
    }
    public void rating(){
        System.out.println ("Рейтинг");
    }
}
static class Сar extends Produc {
    String name;
    String price;
    String rating;

    public Сar(String name, String price, String rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public void name() {
        System.out.println ("Toyota Tundra\n");
    }

    public void price() {
        System.out.println ("7.000.000\n");
    }

    public void rating() {
        System.out.println ("№3\n");
    }
}
    static class Bike extends Produc {
        String name;
        String price;
        String rating;

        public Bike(String name, String price, String rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public void name() {
            System.out.println ("Yamaha YZ250F\n");
        }

        public void price() {
            System.out.println ("724.000n\n");
        }

        public void rating() {
            System.out.println ("№3\n");

        }
    }
    static class Speedboat extends Produc {
        String name;
        String price;
        String rating;

        public Speedboat(String name, String price, String rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public void name() {
            System.out.println ("VOYAGER 700 CABIN\n");
        }

        public void price() {
            System.out.println ("2.890.000\n");
        }

        public void rating() {
            System.out.println ("№3\n");

        }
    }
public class User implements Use.User{
    private String login;
    private String password;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
    public void login() {
        System.out.println ("Alexey Nikolaevich Krutoy\n");
    }

    public void password() {
        System.out.println ("Saline\n");
    }


    //????Создать три класса реализующий интерфейс "Пользователь" и объект класса
public class UserFind implements Use.User {
        public User find(String login, String password) {
            return null;
        }
        public String save(User user) {
            return null;
        }
        
        public class UserKing implements Use.User {
            public User King(String login, String password) {
                return null;
            }
            public String save(User user) {
                return null;
            }

            public class UserDiablo implements Use.User {
                public User Diablo(String login, String password) {
                    return null;
                }
                public String save(User user) {
                    return null;
                }
            }
        }
    }





    public static void main(String[] args) {

    }
}

