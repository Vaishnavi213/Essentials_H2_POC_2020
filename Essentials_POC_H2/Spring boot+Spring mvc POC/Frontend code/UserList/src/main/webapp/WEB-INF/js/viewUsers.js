$( document ).ready(function() {

var users = [];

     $.get("http://localhost:8081/user", function(data, status){
                       users = data;
                       users.forEach(muFun);
                     });

    function muFun(user, i){
        var url = "edituser?id="+user.id;
                   var tbrow = `
                   <tr id = `+user.id+`>
                   <th>`+user.fname+`</th>
                   <th>`+user.lname+`</th>
                   <th>`+user.gender+`</th>
                   <th>`+user.city+`</th>
                   <th><a href=`+url+`>edit</a></th>
                   <th id="delete">DELETE</th>
                   </tr>`;
                   $('tbody').append(tbrow);


    }


$('body').on('click', '#delete', function(){
 if (confirm("Do you want to delete this user")) {
   var id = $(this).parent().attr("id");
    // Ajax call for deleting
         $.ajax({
                         type: "DELETE",
                         contentType: "application/json",
                         url: "http://localhost:8081/user/"+id,
                         dataType: 'json',
                         cache: false,
                         timeout: 600000,
                         success: function (data) {
                             $('#'+id).remove();
                         },
                         error: function (e) {

                         }
                     });
  }
});


});