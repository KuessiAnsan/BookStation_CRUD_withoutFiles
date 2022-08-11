package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        char choice;
        int choixx;
        System.out.println("Hello my gee !");

        ArrayList<Book> BookList = new ArrayList<Book>();
        Book book = new Book();
        Book book1 = new Book();

        book.setTitle("Pagne Noir");
        book.setAuthor("Bernard Dadié");
        book.setPublisher("Hihihi");
        book.setCop_date(LocalDate.of(1985, 10, 24));

        book1.setTitle("La peur");
        book1.setAuthor("Guy De Maupassant");
        book1.setPublisher("Hahaha");
        book1.setCop_date(LocalDate.of(1976, 07, 14));

        BookList.add(book);
        BookList.add(book1);

        System.out.println("First of all let us show you the available books: ");

        for (Book el:
             BookList) {
            System.out.println(el);
        }


        do {
            System.out.println("1-Add some books to the list\n2-Show the list of books\n3-Delete a book");
            System.out.println("What do you want to do ?: ");
            Scanner chx = new Scanner(System.in);
            choixx = chx.nextInt();


            switch (choixx){
                case 1:
                    System.out.println("How many books do you want to add ?");
                    int nb = chx.nextInt();

                    for (int i=0; i<nb; i++){
                        System.out.println("What's the title of the book? :");
                        String title = chx.nextLine();
                        System.out.println("Who wrote the book? :");
                        String author = chx.nextLine();
                        System.out.println("Who's the publisher? :");
                        String publisher = chx.nextLine();
                        //System.out.println("What's the title of the book? :");
                        //LocalDate date = chx.next;

                        BookList.add(new Book(title, author, publisher, LocalDate.of(2001, 10, 11)));
                    }


                    break;

                case 2:
                    for (Book el:
                         BookList) {
                        System.out.println(el);
                    }
                break;

                case 3:
                    System.out.println("Which book you want to delete (Enter the position): ");
                    int del = chx.nextInt();
                    BookList.remove(del-1);
                    break;

                default:
                    System.out.println("You have to chose something !!!");

            }


            System.out.println("Wanna do something else ?(Y/y): ");
            Scanner scn = new Scanner(System.in);
            choice = scn.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }

}