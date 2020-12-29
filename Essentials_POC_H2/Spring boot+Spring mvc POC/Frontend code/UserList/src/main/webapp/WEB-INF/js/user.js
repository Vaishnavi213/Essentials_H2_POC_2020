$( document ).ready(function() {
    var cities = [];

     $.get("http://localhost:8081/city", function(data, status){
                       cities = data;
                       cities.forEach(muFun);
                     });

    function muFun(city, i){
           $('#city').append($('<option>').val(city.cname).text(city.cname));
    }

     $('#myForm').submit(function (e) {

        // Prevent form submission which refreshes page
        e.preventDefault();

        // Serialize data
         var user = {};
         user.fname = $('#fname').val();
         user.lname = $('#lname').val();
        user.gender = $('input[name="optradio"]:checked').val();
        user.city = $( "#city option:selected" ).val();

        // Make AJAX request
        $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "http://localhost:8081/user",
                data: JSON.stringify(user),
                dataType: 'json',
                cache: false,
                timeout: 600000,
                success: function (data) {
                },
                error: function (e) {

                }
            });

            window.location.href="http://localhost:8080/UserList-0.0.1-SNAPSHOT/";

            });


});


//    $("#city").


