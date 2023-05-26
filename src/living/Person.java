package living;

import things.*;

public class Person {
    private String firstName;
    private String lastName;
    private BookBag bookBag = null;

    //---------------------------------------------------------------------------------------------------------

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BookBag getBookBag() {
        return bookBag;
    }

    public void setBookBag(BookBag bookBag) {
        this.bookBag = bookBag;
    }

    //--------------------------------------------------------------------------------------------------------

    public double totalPriceOfPossesions()
    {
        double totalPrice = 0;

        for(Object item : bookBag.getItems())
        {
            if (item instanceof Phone)
            {
                totalPrice += ((Phone) item).getPrice();
            } else if(item instanceof Book)
            {
                totalPrice += ((Book) item).getPrice();
            } else if(item instanceof PencilBag)
            {
                for (Object pen : ((PencilBag) item).getPens())
                {
                    totalPrice += ((Pen) pen).getPrice();
                }
            }
        }

        return totalPrice;
    }

}
