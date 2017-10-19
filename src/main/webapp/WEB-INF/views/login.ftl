<#import "/spring.ftl" as spring/>

<head>
    <meta charset="UTF-8">
    <title>Car Service login portal</title>
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="static/style.css">

</head>

<body>


<h2>${message!""}</h2>


<h2 style="color: red">
${errorMessage!""}
</h2>

<ul class="tab-group">
    <li class="tab active"><a href="/register">Sign Up</a></li>
    <!--<li class="tab"><a href="/login">Log In</a></li> -->
</ul>




<style>
    form {
        width: 50%;
        margin: auto;

    }

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    button:hover {
        opacity: 0.8;
    }





    .container {
        height: 100%;
        padding-top: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }

    }
</style>


<h2>Car Service Login Form</h2>


<div class="container" style="background-color: #e7e7e7">

    <div class="form">
        <form action="/login" method="post" id="loginForm" name="loginForm">
        <label for="username"><b>Username</b></label>
            <input type="text" name="username" id="username" placeholder="Enter Username" autocomplete="off" required/>
            <label for="password"><b>Password</b></label>
            <input type="password" name="password" id="password" placeholder="Enter Password"required/>
            <button type="submit">Login</button>
        </form>
    </div>



    </div>







