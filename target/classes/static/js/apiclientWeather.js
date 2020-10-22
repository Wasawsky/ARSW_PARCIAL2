apiclientWeather = (function () {

    return {
        getWeatherCity: function (city, callback) {
            $.getJSON('/weather/' + city, function (response) {
                callback(response);
            }).fail(function () {
                callback(undefined);
            })
        }
    }
})();