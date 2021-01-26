package manager;

import domain.PosterItem;

public class FilmManager {
    private PosterItem[] items = new PosterItem[0];

    //    добавление фильма в ленту
    public void add(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    //    список фильмов
    public PosterItem[] getAll() {
        if (items.length > 9) {
            int a = items.length - 10;
            PosterItem[] result = new PosterItem[items.length - a];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            PosterItem[] result = new PosterItem[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}