<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
 <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
     <link rel="stylesheet" href="<c:url value="/css/editUser.css" />">
  <script src="<c:url value="/js/editUser.js" />"></script>
    <meta charset="UTF-8">
    <title>MVC</title>
</head>
<body>
   <nav class="navbar navbar-inverse">
               <div class="container-fluid">
                   <div class="navbar-header">
                       <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                           <span class="icon-bar"></span>
                           <span class="icon-bar"></span>
                           <span class="icon-bar"></span>
                       </button>
                       <a class="navbar-brand" href="http://localhost:8080/UserList-0.0.1-SNAPSHOT/">User Information</a>
                   </div>
               </div>
        </nav>

         <h1 class="container text-center">
             Edit User
             </h1>

            <form id="myForm">
              <div class="form-group">
                <label for="fname">First Name: </label>
                <input type="text" class="form-control" id="fname" placeholder="First Name">
              </div>
              <div class="form-group">
                <label for="lname">Last Name</label>
                <input type="text" class="form-control" id="lname" placeholder="Last Name">
              </div>
              <div class="form-group" >
                  <label for="gender">Gender</label>
                  <div class="radio">
                    <label><input type="radio" name="optradio" id="male" value = "male">Male</label>
                  </div>
                  <div class="radio">
                    <label><input type="radio" name="optradio" id ="female" value = "female">Female</label>
                  </div>
              </div>
              <div class="form-group">
              <label for="city">Select list:</label>
                    <select class="form-control" id="city" style="max-width:30%;">
                    </select>
              </div>
              <button type="submit" class="btn btn-success">Submit</button>
            </form>
</body>
</html>