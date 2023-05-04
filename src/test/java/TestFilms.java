import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFilms {

    @Test
    public void ShouldTestFilmsAdd() {
        FilmsManager manager = new FilmsManager(5);
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");
        Films fifth = new Films("Вперед");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Films[] actual = manager.findAll();
        Films[] expected = new Films[]{first, second, third, fourth, fifth};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestFilmsEmpty() {
        FilmsManager manager = new FilmsManager(5);
        Films[] actual = manager.findAll();
        Films[] expected = new Films[]{};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastMoreMax() {
        FilmsManager manager = new FilmsManager();
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");
        Films fifth = new Films("Вперед");
        Films sixth = new Films("Шрек Навсегда");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Films[] actual = manager.findLast();
        Films[] expected = new Films[]{sixth, fifth, fourth, third, second};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastParam() {
        FilmsManager manager = new FilmsManager(6);
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");
        Films fifth = new Films("Вперед");
        Films sixth = new Films ("Шрек Навсегда");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Films[] actual = manager.findLast();
        Films[] expected = new Films[]{sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastParamFilmsLeight() {
        FilmsManager manager = new FilmsManager();
        Films first = new Films("Джентельмены");
        Films second = new Films("Отель Гранд Будапешт");
        Films third = new Films("Шрек");
        Films fourth = new Films("Лед");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Films[] actual = manager.findLast();
        Films[] expected = new Films[]{fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
}
