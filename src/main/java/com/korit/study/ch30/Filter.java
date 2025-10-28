package com.korit.study.ch30;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    int price;
    // constructor, getters

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



public class Filter {
    public static void main(String[] args) {
///
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> num = numbers.stream()
                .filter(n -> n % 2 ==0)
                .toList();
        System.out.println(num);
///
        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");

        List<String> wordsLength = words.stream()
                .filter(w -> w.length() > 4)
                .toList();
        System.out.println(wordsLength);

///
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");

        List<String> startA = names.stream()
                .filter(a -> a.charAt(0) == 'A')
                .toList();
        System.out.println(startA);
///
        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);

        List<Integer> minus = mixedNumbers.stream()
                .filter(m -> m > 0)
                .toList();
        System.out.println(minus);


        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );

        List<Product> price = products.stream()
                .filter(p -> p.getPrice() > 50000 && p.getPrice() < 500000)
                .toList();
        System.out.println(price);

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );

        List<String> gmail = emails.stream()
                .filter(m -> m.contains("gmail.com"))
                .toList();
        System.out.println(gmail);
    }

}
