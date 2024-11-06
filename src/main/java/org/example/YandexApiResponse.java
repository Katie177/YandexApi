package org.example;

public class YandexApiResponse {
    public Forecasts[] forecasts;

    public Fact fact;
    class Forecasts {
        public Parts parts;
        class Parts {
            public Day day;
            class Day {
                public String temp_avg;
            }
        }
    }
    class Fact {
        public String temp;
    }
}
