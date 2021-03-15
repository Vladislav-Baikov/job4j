package ru.job4j.oop.tracker.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Math.random;

public final class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();
    /**
     * Указатель ячейки для новой заявки.
     */
    //private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }
    /**
     * Метод заменяет заявку в хранилище
     * @param id ключ заменяемой заявки, item новая заявка
     * @return true, если замена произошла
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        item.setId(id);
        for (Item item: items) {
            if (item.getId().equals(id)) {
                items.set(item.getId(), item);
                result = true;
                break;
            }
        }
        return result;
    }
    /**
     * Метод удаляет ячйку в массиве items
     * @param id ключ удаляемой заявки
     * @return true, если удаление произошло
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                this.position--;
                result = true;
            }
        }
        return result;
    }
    /**
     * Метод возвращает массив items без null элементов
     * @return allItems
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }
    /**
     * Метод возвращает массив items без null элементов
     * @return allItems
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int j = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().contains(key)) {
                result[j] = this.items[i];
                j++;
            }
        }
        Arrays.copyOf(result, j);
        return result;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    public String generateId() {
        Integer id = (int) (random() * (int) Math.pow(10, 4));
        return id.toString();
    }
    /**
     *  Метод поиска заявки по id
     * @return Заявка.
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }
}