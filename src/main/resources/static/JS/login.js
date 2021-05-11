function login()
{
    var uname=document.getElementById("uname").value;
    var pass=document.getElementById("pass").value;
    var parent=document.getElementById("my_form");
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8080/checkuser", true);
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if(this.responseText==="false")
            {
                alert("UserInvalid");
                window.location="http://localhost:8080/Login"
                localStorage.clear();
                localStorage.setItem("user_name","hello");
                console.log(localStorage.getItem("user_name"));
               return false
            }
            else{

                 parent.setAttribute("action","/dashboard");
                  window.location="http://localhost:8080/dashboard"
                localStorage.clear();
                localStorage.setItem("user_name","hel");
                console.log(localStorage.getItem("user_name"));

                  }

        }
    };
    var data={
        "Username":uname,
        "Password":pass
    };
    xhttp.send(JSON.stringify(data));
}
