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

    var done = function (city) {
        
        
        console.log("seteando ciudad"+city);
    };
    

    return {
        init: function () {

        },

        setCity: function (newCity) {
            city = newCity;
        },

        setWeatherCity: function (city) {
            console.log("setapp")
            appWeather.setCity(city);
            REPOSITORY.getWeatherCity(city,callback);
        }
    }

})();