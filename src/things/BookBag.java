package things;

import living.Person;

import java.util.ArrayList;

public class BookBag {
    private Person owner;

    final ArrayList items;

    public BookBag(Person owner) {
        this.owner = owner;
        items = new ArrayList<>();

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public ArrayList getItems() {
        return items;
    }

    public void listItems()
    {

    }

    public void displayItems()
    {
        for(Object item : items)
        {
            if (item instanceof Phone)
            {
                ((Phone) item).displayInfo();
            } else if(item instanceof Book)
            {
                ((Book) item).displayInfo();
            } else if(item instanceof PencilBag)
            {
                ((PencilBag) item).displayContains();
            }
        }
    }
}
