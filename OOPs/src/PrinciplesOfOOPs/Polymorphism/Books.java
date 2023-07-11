package PrinciplesOfOOPs.Polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Library{
    ArrayList<String> avlBooks = new ArrayList<>();
    ArrayList<String> isdBooks = new ArrayList<>();

    Library(){

    }

    Library(ArrayList<String> avlBooks){
        this.avlBooks=avlBooks;
    }

    public void addBook(String book){
        avlBooks.add(book);
    }

    public void issueBook(String book){
        avlBooks.remove(book);
        isdBooks.add(book);
    }

    public void submitBook(String book){
        isdBooks.remove(book);
        avlBooks.add(book);
    }

    public ArrayList<String> getAvlBooks() {
        return avlBooks;
    }

    public ArrayList<String> getIsdBooks() {
        return isdBooks;
    }
}

public class Books {
    public static void main(String[] args) {
        Library l1=new Library(new ArrayList<>(Arrays.asList("Atomic Habbit","Alchemist","Puran","48 laws of power")));

        l1.addBook("Garud Puran");
        System.out.println(l1.getAvlBooks());
        l1.issueBook("Alchemist");
        System.out.println(l1.getAvlBooks());
        System.out.println(l1.getIsdBooks());
    }
}
