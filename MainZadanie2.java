import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Item1"));
        items.add(new Item(2, "Item2"));
        items.add(new Item(3, "Item3"));
        items.add(new Item(4, "Item4"));
        items.add(new Item(5, "Item5"));

        for (Item item : items) {
            item.show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}