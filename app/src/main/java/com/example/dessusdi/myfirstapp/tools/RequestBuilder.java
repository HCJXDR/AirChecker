package com.example.dessusdi.myfirstapp.tools;

/**
 * Created by dessusdi on 10/02/2017.
 * DESSUS Dimitri
 */
public abstract class RequestBuilder {
    public static String buildAirQualityURL(int identifier) {
        return Constants.Url.AIR_QUALITY_BASE_URL.replace("%%CITY_ID%%", "@" + identifier);
    }

    public static String buildCityIdURL(String search) {
        String urlStr = Constants.Url.CITY_SEARCH_BASE_URL;
        urlStr = urlStr.replace("%%TOKEN%%", Constants.Url.TOKEN);
        urlStr += search;
        return urlStr;
    }

    public static String buildCitiesAroundPositionURL(double latitude, double longitude) {
        String urlStr = Constants.Url.CITY_POSITION_BASE_URL;
        urlStr = urlStr.replace("%%TOKEN%%", Constants.Url.TOKEN);
        urlStr = urlStr.replace("%%LAT%%", String.valueOf(latitude));
        urlStr = urlStr.replace("%%LNG%%", String.valueOf(longitude));
        return urlStr;
    }

    public static String buildCityInformationURL(String city) {
        return Constants.Url.CITY_INFORMATION_BASE_URL.concat(city);
    }

    public static String buildCityImageURL(String city) {
        return Constants.Url.CITY_IMAGE_BASE_URL.concat(city);
    }
}
