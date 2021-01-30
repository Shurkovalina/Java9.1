package manager;

import domain.PosterItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmManagerTest {

    @Test
    void numberIsMoreThanTen() {
        FilmManager manager = new FilmManager();
        PosterItem poster1 = new PosterItem("poster1");
        PosterItem poster2 = new PosterItem("poster2");
        PosterItem poster3 = new PosterItem("poster3");
        PosterItem poster4 = new PosterItem("poster4");
        PosterItem poster5 = new PosterItem("poster5");
        PosterItem poster6 = new PosterItem("poster6");
        PosterItem poster7 = new PosterItem("poster7");
        PosterItem poster8 = new PosterItem("poster8");
        PosterItem poster9 = new PosterItem("poster9");
        PosterItem poster10 = new PosterItem("poster10");
        PosterItem poster11 = new PosterItem("poster11");
        PosterItem poster12 = new PosterItem("poster12");
        PosterItem poster13 = new PosterItem("poster13");
        PosterItem poster14 = new PosterItem("poster14");

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);
        manager.add(poster9);
        manager.add(poster10);
        manager.add(poster11);
        manager.add(poster12);
        manager.add(poster13);
        manager.add(poster14);

        PosterItem[] actual = manager.limit();
        PosterItem[] expected = new PosterItem[]
                {poster14, poster13, poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5};

        assertArrayEquals(expected, actual);
    }

    @Test
    void numberIsMoreLessTen() {
        FilmManager manager = new FilmManager();
        PosterItem poster1 = new PosterItem("poster1");
        PosterItem poster2 = new PosterItem("poster2");
        PosterItem poster3 = new PosterItem("poster3");

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);

        PosterItem[] actual = manager.limit();
        PosterItem[] expected = new PosterItem[]{poster3, poster2, poster1};

        assertArrayEquals(expected, actual);
    }

}