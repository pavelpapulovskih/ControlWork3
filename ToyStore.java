import java.util.Comparator;
import java.util.PriorityQueue;

class ToyStore {
    private PriorityQueue<Toy> toyQueue;

    public ToyStore() {
        toyQueue = new PriorityQueue<Toy>(Comparator.comparing(Toy::getWeight));
    }

    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    public void play() {
        while (!toyQueue.isEmpty()) {
            Toy toy = toyQueue.poll();
            System.out.println("Выпало игрушка: " + toy.getName());
        }
    }
}