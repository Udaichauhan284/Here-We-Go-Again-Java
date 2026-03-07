public class AggregationExample {
    public static void main(String[] args){
        /*Aggregation -> Represents a "has-a" relationship between objects.
                        One object contains another object as part of its structure.
                        but the contained object/s can exist independently

                        example: library object and book object, library is dependent on books, but they both can be present
                        independently
        */

        Book b1 = new Book("The Insight", 201);
        Book b2 = new Book("Power of Mind", 150);
        Book b3 = new Book("How To Win", 450);

        Book[] books = {b1, b2, b3};
        //use of for loop
        for(Book book : books){
            System.out.println("The Book: " + book.displayInfo());
        }

        //now here the aggregation will come in place
        Library library = new Library("Peace Home", 1997, books); //now library object has books object array
        library.displayInfo();
    }
}

class Book{
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title+" "+this.pages+" pages";
    }
}

class Library{
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The "+this.year+" "+this.name);
        System.out.println("Book Available");
        for(Book book : books){
            System.out.println("The Books: "+book.displayInfo());
        }
    }
}
