public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        // Создание игрушек
        Toy toy1 = new Toy("1", "Мяч", 3);
        Toy toy2 = new Toy("2", "Кукла", 2);
        Toy toy3 = new Toy("3", "Машинка", 1);
        Toy toy4 = new Toy("4", "Робот", 6);
        Toy toy5 = new Toy("5", "Шпага", 1);
        Toy toy6 = new Toy("6", "Пистолетик", 2);
        Toy toy7 = new Toy("7", "Солдатик", 1);
        Toy toy8 = new Toy("8", "Динозаврик", 4);
        Toy toy9 = new Toy("9", "Кораблик", 5);
        Toy toy10 = new Toy("10", "Поровозик", 7);

        // Добавление игрушек в магазин
        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);
        toyStore.addToy(toy4);
        toyStore.addToy(toy5);
        toyStore.addToy(toy6);
        toyStore.addToy(toy7);
        toyStore.addToy(toy8);
        toyStore.addToy(toy9);
        toyStore.addToy(toy10);

        // Розыгрыш игрушек
        toyStore.play();
    }
}