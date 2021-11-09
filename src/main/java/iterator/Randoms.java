package iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;

    private final int min, max;

    /*
     * Итератор по классу Randoms не имеет большого смысла сам по себе,
     * без класса Randoms, поэтому сделаем класс-итератор RandomsIterator в виде внутреннего класса
     * в классе Randoms.
     */
    class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            //по условиям задания цикл итерации должен быть бесконечный, стало быть next всегда есть
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt((max - min) + 1) + min;
        }
    }

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }
}
