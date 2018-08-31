package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Book {
    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {
        LinkedList<Book> books=new LinkedList<>();
        Book b1=new Book("God of small things",168.5f,"Arundhathi Roy");
        Book b2=new Book("Ente kadha",152.52f,"Madhavikutty");
        books.add(b1);
        books.add(b2);
        Iterator itr=books.iterator();
        while(itr.hasNext()){
            Book n=(Book) itr.next();
            System.out.println("Name of book : "+n.name+",  "+"Price :"+n.price+" ,"+"Author : "+n.author);
        }

        System.out.println("OR");
//        for (Book obj:books
//             ) {
//            System.out.println("Name of book : "+obj.name+",  "+"Price :"+obj.price+" ,"+"Author : "+obj.author);
//        }

        for (Book obj:books
             ) {
            if (books.contains(b1)){
                b1.price=180.00f;
                //System.out.println("Name of book : "+obj.name+",  "+"Price :"+obj.price+" ,"+"Author : "+obj.author);
                System.out.println(obj.price);

            }
        }

        }
    }
