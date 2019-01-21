package me.yusufeka.dicodingfavoriteapp.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

public class DatabaseContract {

    public static String TABLE_NAME = "favorites";

    public static final class DictionaryColumns implements BaseColumns {

        public static String TITLE = "title";

        public static String RELEASE_DATE = "release_date";

        public static String OVERVIEW = "overview";

        public static String ADULT = "adult";

        public static String GENRES = "genres";

        public static String POSTER_PATH = "poster_path";

        public static String VOTE_AVERAGE = "vote_average";

        public static String ORIGINAL_LANGUAGE = "original_language";

    }

    public static final String AUTHORITY = "me.yusufeka.yusufdicoding1";

    public static final Uri CONTENT_URI = new Uri.Builder().scheme("content")
            .authority(AUTHORITY)
            .appendPath(TABLE_NAME)
            .build();

    public static String getColumnString(Cursor cursor, String columnName) {
        return cursor.getString( cursor.getColumnIndex(columnName) );
    }

    public static int getColumnInt(Cursor cursor, String columnName) {
        return cursor.getInt( cursor.getColumnIndex(columnName) );
    }

    public static long getColumnLong(Cursor cursor, String columnName) {
        return cursor.getLong( cursor.getColumnIndex(columnName) );
    }
}
