package CodeGeneration;

import Java.SymbolTable.Type;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Simple Java program to read CSV file in Java. In this program we will read
 * list of books stored in CSV file as comma separated values.
 *
 * @author WINDOWS 8
 *
 */
public class CSVReader {

//    public static void main(String... args) {
//        List<Book> books = readBooksFromCSV("books.txt");
//
//        // let's print all the person read from CSV file
//        for (Book b : books) {
//            System.out.println(b);
//        }
//    }




    public <T> List<T>  readFromCSV(Class<T> tClass , int columns, String fileName) {
        System.out.println(tClass);
        List<T> list = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
//                Book book = createBook(attributes);
//                list.add(book);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return list;
    }

    private static Book createBook(String[] metadata) {
        String name = metadata[0];
        int price = Integer.parseInt(metadata[1]);
        String author = metadata[2];

        // create and return book of this metadata
        return new Book(name, price, author);
    }

}

class Book {
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + ", author=" + author
                + "]";
    }

}
