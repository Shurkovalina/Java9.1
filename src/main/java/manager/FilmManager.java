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

    //    список фильмов с лимитом
    public PosterItem[] limit() {
        int limit = 10; //выставляем лимит
        int ost = items.length - limit; //считаем, сколько фильмов мы не добавляем
        PosterItem[] result = new PosterItem[items.length - ost];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    //    список фильмов без лимита
    public PosterItem[] noLimit() {
        PosterItem[] result = new PosterItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}