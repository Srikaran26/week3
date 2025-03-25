import java.util.HashMap;
class Item {
    int id;
    String name;
    int quantity;

    Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}
class review {
    public static void main(String[] args){
        HashMap<Integer,Item> h1=new HashMap<>();
        h1.put(1,new Item(1,"Pen",2));
        h1.put(2,new Item(2,"Pencil",3));
        h1.put(3,new Item(3,"Sketch",2));
        Item[] items = h1.values().toArray(new Item[0]);
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].quantity > items[j + 1].quantity) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted by quantity:");
        for (Item item : items) {
            System.out.println(item.name + " - " + item.quantity);
        }
        String searchName = "Pen";
        boolean found = false;
        for (Item item : items) {
            if (item.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found item: " + item.name + " - " + item.quantity);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The item is not found");
        }
    }

}