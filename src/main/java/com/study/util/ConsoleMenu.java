package com.study.util;

import com.study.dao.*;
import com.study.entity.*;
import org.aspectj.weaver.ast.Or;
import org.springframework.cglib.core.Local;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsoleMenu {

    private ConsoleMenu() {
    }

    public static void mainMenu() {
        System.out.println("Main Menu");

        System.out.println("1. Customers");
        System.out.println("2. Books");
        System.out.println("3. Writers");
        System.out.println("4. Contracts");
        System.out.println("5. Book-authors");
        System.out.println("6. Orders");
        System.out.println("0. Exit");
        System.out.println("Choose an option:");
    }

    //Customers
    public static void menuCustomers() {
        System.out.println("Customers");
        System.out.println("1. Show all customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Find customer by field");
        System.out.println("0. Exit");
    }

    public static void customersEdit() {
        System.out.println("Choose option to edit:");
        System.out.println("1. Customer name");
        System.out.println("2. Customer address");
        System.out.println("3. Customer phone");
        System.out.println("4. Customer contract person");
        System.out.println("0. Exit");
    }

    public static void customersFind() {
        System.out.println("Choose option to find by:");
        System.out.println("1. Customer name");
        System.out.println("2. Customer address");
        System.out.println("3. Customer phone");
        System.out.println("4. Customer contract person");
        System.out.println("0. Exit");
    }

    //Books
    public static void menuBooks() {
        System.out.println("Books");
        System.out.println("1. Show books");
        System.out.println("2. Add new book");
        System.out.println("3. Edit book");
        System.out.println("4. Delete book");
        System.out.println("5. Find book by field");
        System.out.println("0. Exit");
    }

    public static void booksEdit() {
        System.out.println("Choose option to edit:");
        System.out.println("1. Book title");
        System.out.println("2. Book print run");
        System.out.println("3. Book publication date");
        System.out.println("4. Book cost price");
        System.out.println("5. Book selling price");
        System.out.println("6. Book royalty");
        System.out.println("0. Exit");
    }

    public static void booksFind() {
        System.out.println("Choose option to find by:");
        System.out.println("1. Book title");
        System.out.println("2. Book print run");
        System.out.println("3. Book publication date");
        System.out.println("4. Book cost price");
        System.out.println("5. Book selling price");
        System.out.println("6. Book royalty");
        System.out.println("0. Exit");
    }

    //Writers
    public static void menuWriters() {
        System.out.println("Writers");
        System.out.println("1. Show all writers");
        System.out.println("2. Add new writer");
        System.out.println("3. Edit writer");
        System.out.println("4. Delete writer");
        System.out.println("5. Find writer by field");
        System.out.println("0. Exit");
    }

    public static void writersEdit() {
        System.out.println("Choose option to edit:");
        System.out.println("1. Writer passport number");
        System.out.println("2. Writer last name");
        System.out.println("3. Writer first name");
        System.out.println("4. Writer middle name");
        System.out.println("5. Writer address");
        System.out.println("6. Writer phone");
        System.out.println("0. Exit");
    }

    public static void writersFind() {
        System.out.println("Choose option to find by:");
        System.out.println("1. Writer passport number");
        System.out.println("2. Writer last name");
        System.out.println("3. Writer first name");
        System.out.println("4. Writer middle name");
        System.out.println("5. Writer address");
        System.out.println("6. Writer phone");
        System.out.println("0. Exit");
    }

    //Contracts
    public static void menuContracts() {
        System.out.println("Contracts");
        System.out.println("1. Show all contracts");
        System.out.println("2. Add new contract");
        System.out.println("3. Edit contract");
        System.out.println("4. Delete contract");
        System.out.println("5. Find contract by field");
        System.out.println("0. Exit");
    }

    public static void contractsEdit() {
        System.out.println("Choose option to edit:");
        System.out.println("1. Writer");
        System.out.println("2. Contract date");
        System.out.println("3. Contract duration");
        System.out.println("4. Contract is terminated");
        System.out.println("5. Termination date");
        System.out.println("0. Exit");
    }

    public static void contractsFind() {
        System.out.println("Choose option to find by:");
        System.out.println("1. Contract date");
        System.out.println("2. Contract duration");
        System.out.println("3. Contract is terminated");
        System.out.println("4. Termination date");
        System.out.println("5. Writer last name");
        System.out.println("6. Writer first name");
        System.out.println("7. Writer phone");
        System.out.println("0. Exit");
    }

    //BookAuthors
    public static void menuBookAuthors() {
        System.out.println("Book-authors");
        System.out.println("1. Show all book-authors");
        System.out.println("2. Add new book-author");
        System.out.println("3. Edit book-author");
        System.out.println("4. Delete book-author");
        System.out.println("5. Find book-author by field");
        System.out.println("0. Exit");
    }

    public static void bookAuthorsEdit() {
        System.out.println("Choose option to edit:");
        System.out.println("1. Book");
        System.out.println("2. Author");
        System.out.println("0. Exit");
    }

    public static void bookAuthorsFind() {
        System.out.println("Choose option to find by:");
        System.out.println("1. Book title");
        System.out.println("2. Book publication date");
        System.out.println("3. Book selling price");
        System.out.println("4. Author last name");
        System.out.println("5. Author first name");
        System.out.println("6. Author phone");
        System.out.println("0. Exit");
    }

    //Orders
    public static void menuOrders() {
        System.out.println("Orders");
        System.out.println("1. Show all orders");
        System.out.println("2. Add new order");
        System.out.println("3. Edit order");
        System.out.println("4. Delete order");
        System.out.println("5. Find order by field");
        System.out.println("0. Exit");
    }

    public static void ordersEdit() {
        System.out.println("Choose option to edit:");
        System.out.println("1. Order date");
        System.out.println("2. Order completion date");
        System.out.println("3. Order book");
        System.out.println("4. Order customer");
        System.out.println("5. Order quantity");
        System.out.println("0. Exit");
    }

    public static void ordersFind() {
        System.out.println("Choose option to find by:");
        System.out.println("1. Order date");
        System.out.println("2. Order completion date");
        System.out.println("3. Order quantity");
        System.out.println("4. Book title");
        System.out.println("5. Book publication date");
        System.out.println("6. Book selling price");
        System.out.println("7. Customer name");
        System.out.println("8. Customer phone");
        System.out.println("9. Customer contact person");
        System.out.println("0. Exit");
    }

    public static String write() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static Integer toInt() throws IOException {
        return Integer.parseInt(write());
    }

    public static Float toFloat() throws IOException {
        return Float.parseFloat(write());
    }

    public static void startMenu() throws IOException {

        CustomersDao customersMapper = new CustomersDao();
        BooksDao booksMapper = new BooksDao();
        WritersDao writersMapper = new WritersDao();
        ContractsDao contractsMapper = new ContractsDao();
        BookAuthorsDao bookAuthorsMapper = new BookAuthorsDao();
        OrdersDao ordersMapper = new OrdersDao();

        boolean ff = true;
        int mainMenuF;
        int localMenuF;

        while (ff) {
            mainMenu();
            try {
                mainMenuF = toInt();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            switch (mainMenuF) {
                case 1: { // Customers
                    boolean insideMenu = true;
                    while (insideMenu) {
                        menuCustomers();
                        try {
                            localMenuF = toInt();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        switch (localMenuF) {
                            case 1: { // Show all customers
                                var customersList = customersMapper.getAll();
                                for (int i = 0; i < customersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + customersList.get(i).toString());
                                }
                                break;
                            }

                            case 2: { // Add new customer
                                Customers customers = new Customers();

                                System.out.print("Enter customer name: ");
                                customers.setName(write());

                                System.out.print("Enter customer address: ");
                                customers.setAddress(write());

                                System.out.print("Enter customer phone: ");
                                customers.setPhone(write());

                                System.out.print("Enter customer contact person: ");
                                customers.setContact_person(write());

                                customersMapper.saveOrUpdate(customers);
                                break;
                            }

                            case 3: { // Edit customer
                                var customersList = customersMapper.getAll();
                                for (int i = 0; i < customersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + customersList.get(i).toString());
                                }
                                System.out.print("Choose customer to edit (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                Customers customersEdit = customersList.get(id - 1);
                                boolean editF = true;
                                while (editF) {
                                    customersEdit();
                                    int editK = toInt();
                                    switch (editK) {
                                        case 1: { // Edit name
                                            System.out.print("Enter customer name: ");
                                            customersEdit.setName(write());
                                            break;
                                        }

                                        case 2: { // Edit address
                                            System.out.print("Enter customer address: ");
                                            customersEdit.setAddress(write());
                                            break;
                                        }

                                        case 3: { // Edit phone
                                            System.out.print("Enter customer phone: ");
                                            customersEdit.setPhone(write());
                                            break;
                                        }

                                        case 4: { // Edit contact person
                                            System.out.print("Enter customer contact person: ");
                                            customersEdit.setContact_person(write());
                                            break;
                                        }

                                        default: {
                                            editF = false;
                                            break;
                                        }
                                    }
                                }
                                customersMapper.saveOrUpdate(customersEdit);
                                break;
                            }

                            case 4: { // Delete customer
                                var customersList = customersMapper.getAll();
                                for (int i = 0; i < customersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + customersList.get(i).toString());
                                }
                                System.out.print("Choose customer to delete (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                customersMapper.delete(customersList.get(id - 1));
                                break;
                            }

                            case 5: { // Find customer
                                boolean isFind = true;
                                while (isFind) {
                                    customersFind();
                                    int infoKey = toInt();
                                    switch (infoKey) {
                                        case 1: { // Find by name
                                            System.out.print("Enter customer name: ");
                                            var customerFound = customersMapper.findByName(write());
                                            for (Customers customers : customerFound) {
                                                System.out.println(customers.toString());
                                            }
                                            break;
                                        }

                                        case 2: { // Find by address
                                            System.out.print("Enter customer address: ");
                                            var customerFound = customersMapper.findByAddress(write());
                                            for (Customers customers : customerFound) {
                                                System.out.println(customers.toString());
                                            }
                                            break;
                                        }

                                        case 3: { // Find by phone
                                            System.out.print("Enter customer phone: ");
                                            var customerFound = customersMapper.findByPhone(write());
                                            for (Customers customers : customerFound) {
                                                System.out.println(customers.toString());
                                            }
                                            break;
                                        }

                                        case 4: { // Find by contact person
                                            System.out.print("Enter customer contact person: ");
                                            var customerFound = customersMapper.findByContactPerson(write());
                                            for (Customers customers : customerFound) {
                                                System.out.println(customers.toString());
                                            }
                                            break;
                                        }

                                        default: {
                                            isFind = false;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            case 0: { // Exit
                                insideMenu = false;
                                break;
                            }

                            default: {
                                System.out.println("Choose an existing option, please.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: { // Books
                    boolean insideMenu = true;
                    while (insideMenu) {
                        menuBooks();
                        try {
                            localMenuF = toInt();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        switch (localMenuF) {
                            case 1: { // Show all books
                                var booksList = booksMapper.getAll();
                                for (int i = 0; i < booksList.size(); i++) {
                                    System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                }
                                break;
                            }

                            case 2: { // Add parking
                                Books books = new Books();

                                System.out.print("Enter book title: ");
                                books.setTitle(write());

                                System.out.print("Enter book print run: ");
                                books.setPrint_run(toInt());

                                System.out.print("Enter book publication date (YYYY-MM-DD): ");
                                books.setPublication_date(LocalDate.parse(write()));

                                System.out.print("Enter book cost price: ");
                                books.setCost_price(toFloat());

                                System.out.print("Enter book selling price: ");
                                books.setSelling_price(toFloat());

                                System.out.print("Enter book royalty: ");
                                books.setRoyalty(toFloat());

                                booksMapper.saveOrUpdate(books);
                                break;
                            }

                            case 3: { // Edit book
                                var booksList = booksMapper.getAll();
                                for (int i = 0; i < booksList.size(); i++) {
                                    System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                }
                                System.out.print("Choose book to edit (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                Books bookEdit = booksList.get(id - 1);
                                boolean editF = true;
                                while (editF) {
                                    booksEdit();
                                    int editK = toInt();
                                    switch (editK) {
                                        case 1: { // Edit book title
                                            System.out.print("Enter book title: ");
                                            bookEdit.setTitle(write());
                                            break;
                                        }

                                        case 2: { // Edit print run
                                            System.out.print("Enter print run: ");
                                            bookEdit.setPrint_run(toInt());
                                            break;
                                        }

                                        case 3: { // Edit publication date
                                            System.out.print("Enter publication date (YYYY-MM-DD): ");
                                            bookEdit.setPublication_date(LocalDate.parse(write()));
                                            break;
                                        }

                                        case 4: { // Edit cost price
                                            System.out.print("Enter cost price: ");
                                            bookEdit.setCost_price(toFloat());
                                            break;
                                        }

                                        case 5: { // Edit selling price
                                            System.out.print("Enter selling price: ");
                                            bookEdit.setSelling_price(toFloat());
                                            break;
                                        }

                                        case 6: { // Edit royalty
                                            System.out.print("Enter royalty: ");
                                            bookEdit.setRoyalty(toFloat());
                                            break;
                                        }

                                        default: {
                                            editF = false;
                                            break;
                                        }
                                    }
                                }
                                booksMapper.saveOrUpdate(bookEdit);
                                break;
                            }

                            case 4: { // Delete parking
                                var booksList = booksMapper.getAll();
                                for (int i = 0; i < booksList.size(); i++) {
                                    System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                }
                                System.out.print("Choose book to delete (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                booksMapper.delete(booksList.get(id - 1));
                                break;
                            }

                            case 5: { // Find parking
                                boolean isFind = true;
                                while (isFind) {
                                    booksFind();
                                    int infoKey = toInt();
                                    switch (infoKey) {
                                        case 1: { // Find by book title
                                            System.out.print("Enter book title: ");
                                            var bookFound = booksMapper.findByTitle(write());
                                            for (Books books : bookFound) {
                                                System.out.println(books.toString());
                                            }
                                            break;
                                        }

                                        case 2: { // Find by print run
                                            System.out.print("Enter print run: ");
                                            var bookFound = booksMapper.findByPrintRun(toInt());
                                            for (Books books : bookFound) {
                                                System.out.println(books.toString());
                                            }
                                            break;
                                        }

                                        case 3: { // Find by publication date
                                            System.out.print("Enter publication date (YYYY-MM-DD): ");
                                            var bookFound = booksMapper.findByPublicationDate(LocalDate.parse(write()));
                                            for (Books books : bookFound) {
                                                System.out.println(books.toString());
                                            }
                                            break;
                                        }

                                        case 4: { // Find by cost price
                                            System.out.print("Enter cost price: ");
                                            var bookFound = booksMapper.findByCostPrice(toFloat());
                                            for (Books books : bookFound) {
                                                System.out.println(books.toString());
                                            }
                                            break;
                                        }

                                        case 5: { // Find by selling price
                                            System.out.print("Enter selling price: ");
                                            var bookFound = booksMapper.findBySellingPrice(toFloat());
                                            for (Books books : bookFound) {
                                                System.out.println(books.toString());
                                            }
                                            break;
                                        }

                                        case 6: { // Find by royalty
                                            System.out.print("Enter royalty: ");
                                            var bookFound = booksMapper.findByRoyalty(toFloat());
                                            for (Books books : bookFound) {
                                                System.out.println(books.toString());
                                            }
                                            break;
                                        }

                                        default: {
                                            isFind = false;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            case 0: { // Exit
                                insideMenu = false;
                                break;
                            }

                            default: {
                                System.out.println("Choose an existing option, please.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: { // Writers
                    boolean insideMenu = true;
                    while (insideMenu) {
                        menuWriters();
                        try {
                            localMenuF = toInt();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        switch (localMenuF) {
                            case 1: { // Show all writers
                                var writersList = writersMapper.getAll();
                                for (int i = 0; i < writersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                }
                                break;
                            }

                            case 2: { // Add writer
                                Writers writer = new Writers();

                                System.out.print("Enter writer passport number: ");
                                writer.setPassport_num(toInt());

                                System.out.print("Enter writer last name: ");
                                writer.setLast_name(write());

                                System.out.print("Enter writer first name: ");
                                writer.setFirst_name(write());

                                System.out.print("Enter writer middle name : ");
                                writer.setMiddle_name(write());

                                System.out.print("Enter writer address: ");
                                writer.setAddress(write());

                                System.out.print("Enter writer phone: ");
                                writer.setPhone(write());

                                writersMapper.saveOrUpdate(writer);
                                break;
                            }

                            case 3: { // Edit writers
                                var writersList = writersMapper.getAll();
                                for (int i = 0; i < writersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                }
                                System.out.print("Choose writer to edit (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                Writers writersEdit = writersList.get(id - 1);
                                boolean editF = true;
                                while (editF) {
                                    writersEdit();
                                    int editK = toInt();
                                    switch (editK) {
                                        case 1: { // Edit passport number
                                            System.out.print("Enter passport number: ");
                                            writersEdit.setPassport_num(toInt());
                                            break;
                                        }

                                        case 2: { // Edit last name
                                            System.out.print("Enter last name: ");
                                            writersEdit.setLast_name(write());
                                            break;
                                        }

                                        case 3: { // Edit first name
                                            System.out.print("Enter first name: ");
                                            writersEdit.setFirst_name(write());
                                            break;
                                        }

                                        case 4: { // Edit middle name
                                            System.out.print("Enter middle name: ");
                                            writersEdit.setMiddle_name(write());
                                            break;
                                        }

                                        case 5: { // Edit address
                                            System.out.print("Enter address: ");
                                            writersEdit.setAddress(write());
                                            break;
                                        }

                                        case 6: { // Edit phone
                                            System.out.print("Enter phone: ");
                                            writersEdit.setPhone(write());
                                            break;
                                        }

                                        default: {
                                            editF = false;
                                            break;
                                        }
                                    }
                                }
                                writersMapper.saveOrUpdate(writersEdit);
                                break;
                            }

                            case 4: { // Delete writer
                                var writersList = writersMapper.getAll();
                                for (int i = 0; i < writersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                }
                                System.out.print("Choose writer to delete (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                writersMapper.delete(writersList.get(id - 1));
                                break;
                            }

                            case 5: { // Find writer
                                boolean isFind = true;
                                while (isFind) {
                                    writersFind();
                                    int infoKey = toInt();
                                    switch (infoKey) {
                                        case 1: { // Find by passport number
                                            System.out.print("Enter passport number: ");
                                            var writerFound = writersMapper.findByPassportNum(toInt());
                                            for (Writers writers : writerFound) {
                                                System.out.println(writers.toString());
                                            }
                                            break;
                                        }

                                        case 2: { // Find by last name
                                            System.out.print("Enter last name: ");
                                            var writerFound = writersMapper.findByLastName(write());
                                            for (Writers writers : writerFound) {
                                                System.out.println(writers.toString());
                                            }
                                            break;
                                        }

                                        case 3: { // Find by first name
                                            System.out.print("Enter first name: ");
                                            var writerFound = writersMapper.findByFirstName(write());
                                            for (Writers writers : writerFound) {
                                                System.out.println(writers.toString());
                                            }
                                            break;
                                        }

                                        case 4: { // Find by middle name
                                            System.out.print("Enter middle name: ");
                                            var writerFound = writersMapper.findByMiddleName(write());
                                            for (Writers writers : writerFound) {
                                                System.out.println(writers.toString());
                                            }
                                            break;
                                        }

                                        case 5: { // Find by address
                                            System.out.print("Enter address: ");
                                            var writerFound = writersMapper.findByAddress(write());
                                            for (Writers writers : writerFound) {
                                                System.out.println(writers.toString());
                                            }
                                            break;
                                        }

                                        case 6: { // Find by phone
                                            System.out.print("Enter phone: ");
                                            var writerFound = writersMapper.findByPhone(write());
                                            for (Writers writers : writerFound) {
                                                System.out.println(writers.toString());
                                            }
                                            break;
                                        }

                                        default: {
                                            isFind = false;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            case 0: { // Exit
                                insideMenu = false;
                                break;
                            }

                            default: {
                                System.out.println("Choose an existing option, please.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: { // Contracts
                    boolean insideMenu = true;
                    while (insideMenu) {
                        menuContracts();
                        try {
                            localMenuF = toInt();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        switch (localMenuF) {
                            case 1: { // Show contracts
                                var contractsList = contractsMapper.getAll();
                                for (int i = 0; i < contractsList.size(); i++) {
                                    System.out.println((i + 1) + ". " + contractsList.get(i).toString());
                                }
                                break;
                            }

                            case 2: { // Add contract
                                Contracts contracts = new Contracts();

                                System.out.print("Enter contract date (YYYY-MM-DD): ");
                                contracts.setContract_date(LocalDate.parse(write()));

                                System.out.print("Enter contract duration (years): ");
                                contracts.setContract_duration(toInt());

                                System.out.print("Is the contract terminated? (1 for Yes, 0 for No): ");
                                int isTerminatedInput = toInt();
                                while (isTerminatedInput != 0 && isTerminatedInput != 1) {
                                    System.out.print("Invalid input. Please enter 1 for Yes or 0 for No: ");
                                    isTerminatedInput = toInt();
                                }
                                contracts.setIs_terminated(isTerminatedInput == 1);

                                if (contracts.getIs_terminated()) {
                                    System.out.print("Enter termination date (YYYY-MM-DD): ");
                                    contracts.setTermination_date(LocalDate.parse(write()));
                                } else {
                                    contracts.setTermination_date(null);
                                }

                                var writersList = writersMapper.getAll();
                                for (int i = 0; i < writersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                }
                                System.out.print("Select writer: ");
                                var writer = writersList.get(toInt() - 1);
                                contracts.setWriter(writer);

                                contractsMapper.saveOrUpdate(contracts);
                                break;
                            }

                            case 3: { // Edit contract
                                var contractsList = contractsMapper.getAll();
                                for (int i = 0; i < contractsList.size(); i++) {
                                    System.out.println((i + 1) + ". " + contractsList.get(i).toString());
                                }
                                System.out.print("Choose contract to edit (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                Contracts contractsEdit = contractsList.get(id - 1);
                                boolean editF = true;
                                while (editF) {
                                    contractsEdit();
                                    int editK = toInt();
                                    switch (editK) {
                                        case 1: { // Edit contract date
                                            System.out.print("Enter contract date (YYYY-MM-DD): ");
                                            contractsEdit.setContract_date(LocalDate.parse(write()));
                                            break;
                                        }

                                        case 2: { // Edit contract duration
                                            System.out.print("Enter contract duration: ");
                                            contractsEdit.setContract_duration(toInt());
                                            break;
                                        }

                                        case 3: { // Edit is terminated
                                            System.out.print("Enter is terminated (1 for Yes, 0 for No): ");
                                            int isTerminatedInput = toInt();
                                            while (isTerminatedInput != 0 && isTerminatedInput != 1) {
                                                System.out.print("Invalid input. Please enter 1 for Yes or 0 for No: ");
                                                isTerminatedInput = toInt();
                                            }
                                            contractsEdit.setIs_terminated(isTerminatedInput == 1);
                                            break;
                                        }

                                        case 4: { // Edit termination date
                                            System.out.print("Enter termination date (YYYY-MM-DD): ");
                                            contractsEdit.setTermination_date(LocalDate.parse(write()));
                                            break;
                                        }

                                        case 5: { // Edit writer
                                            var writersList = writersMapper.getAll();
                                            for (int i = 0; i < writersList.size(); i++) {
                                                System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                            }
                                            System.out.print("Select writer: ");
                                            var writer = writersList.get(toInt() - 1);
                                            contractsEdit.setWriter(writer);
                                            break;
                                        }

                                        default: {
                                            editF = false;
                                            break;
                                        }
                                    }
                                }
                                contractsMapper.saveOrUpdate(contractsEdit);
                                break;
                            }

                            case 4: { // Delete contract
                                var contractsList = contractsMapper.getAll();
                                for (int i = 0; i < contractsList.size(); i++) {
                                    System.out.println((i + 1) + ". " + contractsList.get(i).toString());
                                }
                                System.out.print("Choose contract to delete (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                contractsMapper.delete(contractsList.get(id - 1));
                                break;
                            }

                            case 5: { // Find contract
                                boolean isFind = true;
                                while (isFind) {
                                    contractsFind();
                                    int infoKey = toInt();
                                    switch (infoKey) {
                                        case 1: { // Find contract date
                                            System.out.print("Enter contract date (YYYY-MM-DD): ");
                                            var contractFound = contractsMapper.findByContactDate(LocalDate.parse(write()));
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        case 2: { // Find by contract duration
                                            System.out.print("Enter contract duration: ");
                                            var contractFound = contractsMapper.findByContractDuration(toInt());
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        case 3: { // Find by is terminated
                                            System.out.print("Enter is terminated (1 for Yes, 0 for No): ");
                                            int isTerminatedInput = toInt();
                                            while (isTerminatedInput != 0 && isTerminatedInput != 1) {
                                                System.out.print("Invalid input. Please enter 1 for Yes or 0 for No: ");
                                                isTerminatedInput = toInt();
                                            }
                                            var contractFound = contractsMapper.findByIsTerminated(isTerminatedInput == 1);
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        case 4: { // Find by termination date
                                            System.out.print("Enter termination date (YYYY-MM-DD): ");
                                            var contractFound = contractsMapper.findByTerminationDate(LocalDate.parse(write()));
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        case 5: { // Find by writer last name
                                            System.out.print("Enter writer last name: ");
                                            var contractFound = contractsMapper.findByWriterLastName(write());
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        case 6: { // Find by writer first name
                                            System.out.print("Enter writer first name: ");
                                            var contractFound = contractsMapper.findByWriterFirstName(write());
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        case 7: { // Find by writer phone
                                            System.out.print("Enter writer phone: ");
                                            var contractFound = contractsMapper.findByWriterPhone(write());
                                            for (Contracts contracts : contractFound) {
                                                System.out.println(contracts.toString());
                                            }
                                            break;
                                        }

                                        default: {
                                            isFind = false;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            case 0: { // Exit
                                insideMenu = false;
                                break;
                            }

                            default: {
                                System.out.println("Choose an existing option, please.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 5: { // Book authors
                    boolean insideMenu = true;
                    while (insideMenu) {
                        menuBookAuthors();
                        try {
                            localMenuF = toInt();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        switch (localMenuF) {
                            case 1: { // Show all book-authors
                                var bookAuthorsList = bookAuthorsMapper.getAll();
                                for (int i = 0; i < bookAuthorsList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bookAuthorsList.get(i).toString());
                                }
                                break;
                            }

                            case 2: { // Add book-author
                                BookAuthors bookAuthors = new BookAuthors();

                                var booksList = booksMapper.getAll();
                                for (int i = 0; i < booksList.size(); i++) {
                                    System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                }
                                System.out.print("Select book: ");
                                var book = booksList.get(toInt() - 1);
                                bookAuthors.setBook(book);

                                var writersList = writersMapper.getAll();
                                for (int i = 0; i < writersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                }
                                System.out.print("Select author: ");
                                var writer = writersList.get(toInt() - 1);
                                bookAuthors.setWriter(writer);

                                bookAuthorsMapper.saveOrUpdate(bookAuthors);
                                break;
                            }

                            case 3: { // Edit book-authors
                                var bookAuthorsList = bookAuthorsMapper.getAll();
                                for (int i = 0; i < bookAuthorsList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bookAuthorsList.get(i).toString());
                                }
                                System.out.print("Choose book-author to edit (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                BookAuthors bookAuthorsEdit = bookAuthorsList.get(id - 1);
                                boolean editF = true;
                                while (editF) {
                                    bookAuthorsEdit();
                                    int editK = toInt();
                                    switch (editK) {
                                        case 1: { // Edit book
                                            var booksList = booksMapper.getAll();
                                            for (int i = 0; i < booksList.size(); i++) {
                                                System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                            }
                                            System.out.print("Select book: ");
                                            var book = booksList.get(toInt() - 1);
                                            bookAuthorsEdit.setBook(book);
                                            break;
                                        }

                                        case 2: { // Edit writer
                                            var writersList = writersMapper.getAll();
                                            for (int i = 0; i < writersList.size(); i++) {
                                                System.out.println((i + 1) + ". " + writersList.get(i).toString());
                                            }
                                            System.out.print("Select author: ");
                                            var writer = writersList.get(toInt() - 1);
                                            bookAuthorsEdit.setWriter(writer);
                                            break;
                                        }

                                        default: {
                                            editF = false;
                                            break;
                                        }
                                    }
                                }
                                bookAuthorsMapper.saveOrUpdate(bookAuthorsEdit);
                                break;
                            }

                            case 4: { // Delete book-author
                                var bookAuthorsList = bookAuthorsMapper.getAll();
                                for (int i = 0; i < bookAuthorsList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bookAuthorsList.get(i).toString());
                                }
                                System.out.print("Choose book-author to delete (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                bookAuthorsMapper.delete(bookAuthorsList.get(id - 1));
                                break;
                            }

                            case 5: { // Find book-author
                                boolean isFind = true;
                                while (isFind) {
                                    bookAuthorsFind();
                                    int infoKey = toInt();
                                    switch (infoKey) {
                                        case 1: { // Find book title
                                            System.out.print("Enter book title: ");
                                            var bookAuthorFound = bookAuthorsMapper.findByBookTitle(write());
                                            for (BookAuthors bookAuthors : bookAuthorFound) {
                                                System.out.println(bookAuthors.toString());
                                            }
                                            break;
                                        }

                                        case 2: { // Find book publication date
                                            System.out.print("Enter book publication date (YYYY-MM-DD): ");
                                            var bookAuthorFound = bookAuthorsMapper.findByBookPublicationDate(LocalDate.parse(write()));
                                            for (BookAuthors bookAuthors : bookAuthorFound) {
                                                System.out.println(bookAuthors.toString());
                                            }
                                            break;
                                        }

                                        case 3: { // Find book selling price
                                            System.out.print("Enter book selling price: ");
                                            var bookAuthorFound = bookAuthorsMapper.findByBookSellingPrice(toFloat());
                                            for (BookAuthors bookAuthors : bookAuthorFound) {
                                                System.out.println(bookAuthors.toString());
                                            }
                                            break;
                                        }

                                        case 4: { // Find writer last name
                                            System.out.print("Enter writer last name: ");
                                            var bookAuthorFound = bookAuthorsMapper.findByAuthorLastName(write());
                                            for (BookAuthors bookAuthors : bookAuthorFound) {
                                                System.out.println(bookAuthors.toString());
                                            }
                                            break;
                                        }

                                        case 5: { // Find writer first name
                                            System.out.print("Enter writer first name: ");
                                            var bookAuthorFound = bookAuthorsMapper.findByAuthorFirstName(write());
                                            for (BookAuthors bookAuthors : bookAuthorFound) {
                                                System.out.println(bookAuthors.toString());
                                            }
                                            break;
                                        }

                                        case 6: { // Find writer phone
                                            System.out.print("Enter writer phone: ");
                                            var bookAuthorFound = bookAuthorsMapper.findByAuthorPhone(write());
                                            for (BookAuthors bookAuthors : bookAuthorFound) {
                                                System.out.println(bookAuthors.toString());
                                            }
                                            break;
                                        }

                                        default: {
                                            isFind = false;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            case 0: { // Exit
                                insideMenu = false;
                                break;
                            }

                            default: {
                                System.out.println("Choose an existing option, please.");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 6: { // Orders
                    boolean insideMenu = true;
                    while (insideMenu) {
                        menuOrders();
                        try {
                            localMenuF = toInt();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        switch (localMenuF) {
                            case 1: { // Show orders
                                var ordersList = ordersMapper.getAll();
                                for (int i = 0; i < ordersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + ordersList.get(i).toString());
                                }
                                break;
                            }

                            case 2: { // Add order
                                Orders orders = new Orders();

                                System.out.print("Enter order date (YYYY-MM-DD): ");
                                orders.setOrder_date(LocalDate.parse(write()));

                                System.out.print("Enter completion date (YYYY-MM-DD): ");
                                orders.setCompletion_date(LocalDate.parse(write()));

                                System.out.print("Enter quantity: ");
                                orders.setQuantity(toInt());

                                var booksList = booksMapper.getAll();
                                for (int i = 0; i < booksList.size(); i++) {
                                    System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                }
                                System.out.print("Select book: ");
                                var book = booksList.get(toInt() - 1);
                                orders.setBook(book);

                                var customersList = customersMapper.getAll();
                                for (int i = 0; i < customersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + customersList.get(i).toString());
                                }
                                System.out.print("Select customer: ");
                                var customer = customersList.get(toInt() - 1);
                                orders.setCustomer(customer);

                                ordersMapper.saveOrUpdate(orders);
                                break;
                            }

                            case 3: { // Edit order
                                var ordersList = ordersMapper.getAll();
                                for (int i = 0; i < ordersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + ordersList.get(i).toString());
                                }
                                System.out.print("Choose order to edit (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                Orders ordersEdit = ordersList.get(id - 1);
                                boolean editF = true;
                                while (editF) {
                                    ordersEdit();
                                    int editK = toInt();
                                    switch (editK) {
                                        case 1: { // Edit date
                                            System.out.print("Enter order date (YYYY-MM-DD): ");
                                            ordersEdit.setOrder_date(LocalDate.parse(write()));
                                            break;
                                        }

                                        case 2: { // Edit completion date
                                            System.out.print("Enter completion date (YYYY-MM-DD): ");
                                            ordersEdit.setCompletion_date(LocalDate.parse(write()));
                                            break;
                                        }

                                        case 3: { // Edit quantity
                                            System.out.print("Enter quantity: ");
                                            ordersEdit.setQuantity(toInt());
                                            break;
                                        }

                                        case 4: { // Edit parking
                                            var booksList = booksMapper.getAll();
                                            for (int i = 0; i < booksList.size(); i++) {
                                                System.out.println((i + 1) + ". " + booksList.get(i).toString());
                                            }
                                            System.out.print("Select book: ");
                                            var book = booksList.get(toInt() - 1);
                                            ordersEdit.setBook(book);
                                            break;
                                        }

                                        case 5: { // Edit room
                                            var customersList = customersMapper.getAll();
                                            for (int i = 0; i < customersList.size(); i++) {
                                                System.out.println((i + 1) + ". " + customersList.get(i).toString());
                                            }
                                            System.out.print("Select customer: ");
                                            var customer = customersList.get(toInt() - 1);
                                            ordersEdit.setCustomer(customer);
                                            break;
                                        }

                                        default: {
                                            editF = false;
                                            break;
                                        }
                                    }
                                }
                                ordersMapper.saveOrUpdate(ordersEdit);
                                break;
                            }

                            case 4: { // Delete order
                                var ordersList = ordersMapper.getAll();
                                for (int i = 0; i < ordersList.size(); i++) {
                                    System.out.println((i + 1) + ". " + ordersList.get(i).toString());
                                }
                                System.out.print("Choose order to delete (0 to exit): ");
                                int id = toInt();
                                if (id == 0) break;
                                ordersMapper.delete(ordersList.get(id - 1));
                                break;
                            }

                            case 5: { // Find order
                                boolean isFind = true;
                                while (isFind) {
                                    ordersFind();
                                    int infoKey = toInt();
                                    switch (infoKey) {
                                        case 1: { // Find by order date
                                            System.out.print("Enter order date (YYYY-MM-DD): ");
                                            var orderFound = ordersMapper.findByOrderDate(LocalDate.parse(write()));
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 2: { // Find by completion date
                                            System.out.print("Enter completion date (YYYY-MM-DD): ");
                                            var orderFound = ordersMapper.findByOrderCompletionDate(LocalDate.parse(write()));
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 3: { // Find by order quantity
                                            System.out.print("Enter order quantity: ");
                                            var orderFound = ordersMapper.findByOrderQuantity(toInt());
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 4: { // Find by book title
                                            System.out.print("Enter book title: ");
                                            var orderFound = ordersMapper.findByBookTitle(write());
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 5: { // Find by book publication date
                                            System.out.print("Enter book publication date (YYYY-MM-DD): ");
                                            var orderFound = ordersMapper.findByBookPublicationDate(LocalDate.parse(write()));
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 6: { // Find by book selling price
                                            System.out.print("Enter book selling price: ");
                                            var orderFound = ordersMapper.findByBookSellingPrice(toFloat());
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 7: { // Find by customer name
                                            System.out.print("Enter customer name: ");
                                            var orderFound = ordersMapper.findByCustomerName(write());
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 8: { // Find by customer phone
                                            System.out.print("Enter date of issue (YYYY-MM-DD): ");
                                            var orderFound = ordersMapper.findByCustomerPhone(write());
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        case 9: { // Find by customer contact person
                                            System.out.print("Enter customer contact person: ");
                                            var orderFound = ordersMapper.findByCustomerContactPerson(write());
                                            for (Orders orders : orderFound) {
                                                System.out.println(orders.toString());
                                            }
                                            break;
                                        }

                                        default: {
                                            isFind = false;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            case 0: { // Exit
                                insideMenu = false;
                                break;
                            }

                            default: {
                                System.out.println("Choose an existing option, please.");
                                break;
                            }
                        }
                    }
                    break;
                }


                case 0: {
                    ff = false;
                    break;
                }
                default: {
                    System.out.println("choose existing option, please");
                    break;
                }

            }
        }
    }

}
