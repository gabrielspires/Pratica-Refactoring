import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void statement() {
        Movie movie1 = new Movie("Avengers: Endgame", 1);
        Movie movie2 = new Movie("Avatar", 2);
        Movie movie3 = new Movie("Matrix", 0);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 1);
        Rental rental3 = new Rental(movie3, 5);

        Customer customer1 = new Customer("Jeff");
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        customer1.addRental(rental3);

        assertEquals(customer1.statement(), "Rental Record for Jeff\n" +
                "\tAvengers: Endgame\t9.0\n" +
                "\tAvatar\t1.5\n" +
                "\tMatrix\t6.5\n" +
                "Amount owed is 17.0\n" +
                "You earned 4 frequent renter points");
    }
}