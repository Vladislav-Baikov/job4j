package ru.job4j.oop.tracker.tracker;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public final class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();
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
    public boolean replace(int id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.set(i, item);
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
    public boolean delete(int id) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                result = true;
            }
        }
        return result;
    }
    /**
     * Метод возвращает массив items без null элементов
     * @return allItems
     */
    public List<Item> findAll() {
        return this.items;
    }
    /**
     * Метод возвращает массив items без null элементов
     * @return allItems
     */
    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<Item>();
        for (Item itemI: items) {
            if (itemI.getName().equals(key)) {
                result.add(itemI);
            }
        }
        return result;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    public int generateId() {
        return (int) (random() * (int) Math.pow(10, 4));
    }
    /**
     *  Метод поиска заявки по id
     * @return Заявка.
     */
    public Item findById(int id) {
        Item result = null;
        for (Item itemI: items) {
            if (itemI.getId() == id) {
                result = itemI;
                break;
            }
        }
        return result;
    }
}