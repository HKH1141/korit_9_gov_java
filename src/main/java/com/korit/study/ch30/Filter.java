package com.korit.study.ch30;

import com.korit.study.ch23.CollectionMain;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
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

class Item {
    String name;
    int stock;
    boolean onSale;
    int price;
    // constructor, getters

    public Item(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
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
///     재고가 1개 이상 있고(stock > 0), 할인 중인(onSale = true) 상품만 필터링하세요. 예상 출력: [노트북, 헤드셋]
        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        List<String> item = items.stream()
                .filter(i -> i.stock > 0 && i.onSale)
                .map(i -> i.name)
                .toList();
        System.out.println(item);
///
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> num2 = numbers2.stream()
                .filter(n -> numbers2.stream().filter(num3 -> num3 == n).count() == 1)
                .toList();
        System.out.println(num2);

        List<Integer> filteringNumbers2 = new ArrayList<>();
        for (Integer n : numbers2) {
            int count = 0;
            for (Integer n2 : numbers2){
                if (n2 == n) {
                    count++;
                }
            }
            if (count == 1) {
                filteringNumbers2.add(n);
            }

        }
        System.out.println(filteringNumbers2);
///
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );

        System.out.println(LocalDate.of(2024, 1, 6).getDayOfWeek());

        List<LocalDate> filteringDates = dates.stream()
                .filter(localdate -> localdate.getDayOfWeek().name().equals("SATURDAY")
                        || localdate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();

        System.out.println(filteringDates);
    }

}
