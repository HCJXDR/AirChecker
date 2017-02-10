package com.example.dessusdi.myfirstapp.tools;

import android.provider.BaseColumns;

/**
 * Created by dessusdi on 10/02/2017.
 * DESSUS Dimitri
 */
public final class Constants {
    public final class Url {
        public static final String TOKEN    = "c71fbbfd99ef2c934f9d7d737be9e1e70ff03a9c";
        public static final String CITY_SEARCH_BASE_URL = "http://api.waqi.info/search/?token=%%TOKEN%%&keyword=";
        public static final String AIR_QUALITY_BASE_URL = "https://api.waqi.info/api/feed/%%CITY_ID%%/obs.en.json";

        private Url() {}
    }

    // This part was used for manual persistance SQLite (now remplaced by Sugar ORM)
    public static class Database implements BaseColumns {

        public static final int DATABASE_VERSION    = 1;
        public static final String DATABASE_NAME    = "waqi.db";
        public static final String TABLE_NAME       = "AIR_QUALITY";
        public static final String COLUMN_CITY_ID   = "identifier";

        private Database() {}
    }

    private Constants() {}
}