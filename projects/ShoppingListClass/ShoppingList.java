public class ShoppingList {
    private String items;

    public ShoppingList() {
        items = "";
    }

    public ShoppingList(String itemString) {
        items = itemString;
    }

    public void addItem(String name) {
        if (!items.contains(name)) {
            items += items.length() == 0 ? name : ", " + name;
        }
    }

    public void removeItem(String name) {
        int index = items.indexOf(name);
        if (index >= 0) {
            index = index > 0 ? index-2 : index;
            items = items.substring(0, index) + items.substring(index+name.length() + 2);
        }
    }

    public String toString() {
        return items;
    }
}
