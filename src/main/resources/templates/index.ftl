<!DOCTYPE html>
<head lang="en">
    <title>Spring Boot Demo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>



<style>
    form {
        border: 100px solid #f1f1f1;
    }

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 17px;
        margin: 10px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 10px 17px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 40%;
    }


    .container {
        padding: 150px;
    }





    // Change styles for span and cancel button on extra small screens
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }



    }
</style>







<body>
<h1>Hey Facilitators!</h1>

<h2>When life gives you lemons be like "wtf life?"</h2>



<h2>Login Form</h2>

<!--<form action="/action_page.php"> -->


    <div class="container">
        <label><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="uname" required>

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>

        <button type="submit">Login</button>

    </div>

    <div class="container" style="background-color:#f1f1f1">

    </div>
</form>




</body>
</html>