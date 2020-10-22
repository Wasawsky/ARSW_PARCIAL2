var appWeather = (function () {
    var REPOSITORY = apiclientWeather;

    var city = "";
    var req;
    
    var funciones = [];
    var cinema = [];
    var callback = function (param) {
        console.log(city+param)
        if (param == undefined) {
            alert("Ciudad Invalida");
            return;
        }
        req = param;
        //searchByNameAndDate();
        //checkTable();
        //console.log(funciones);
        console.log("check callback")
    };

    

    return {
        init: function () {

        },

        setWeatherCity: function (city) {
            appWeather.setCity(city);
            REPOSITORY.getWeatherCity(city,callback);
        }
    }

})();