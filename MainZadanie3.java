import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MainZadanie3 {
    private int id;
    private String name;

    public MainZadanie3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            items.add(new Item(i, "Item" + i));
        }

        List<Item> subList = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}