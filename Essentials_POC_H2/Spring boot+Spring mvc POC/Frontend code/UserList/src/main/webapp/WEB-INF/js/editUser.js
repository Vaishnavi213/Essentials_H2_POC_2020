$(document).ready(function () {

$.get("http://localhost:8081/city", function(data, status){
                       cities = data;
                       cities.forEach(muFun1);
                     });

    function muFun1(city, i){
           $('#city').append($('<option>').val(city.cname).text(city.cname));
    }

var url_string =  window.location.href
        var url = new URL(url_string);
        var c = url.searchParams.get("id");

 $.get("http://localhost:8081/user/"+c, function(data, status){
                        var radio = "#"+data.gender;
                        $('#fname').val(data.fname);
                        $("#lname").val(data.lname);
                        $(radio).prop("checked", true);
                        $('#city').val(data.city);
                     });



//Ajax call
$('#myForm').submit(function (e) {

    e.preventDefault();
         var user = {};
         user.fname = $('#fname').val();
         user.lname = $('#lname').val();
        user.gender = $('input[name="optradio"]:checked').val();
        user.city = $( "#city option:selected" ).val();


        // Make AJAX request
        $.ajax({
                type: "PUT",
                contentType: "application/json",
                url: "http://localhost:8081/user/"+c,
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