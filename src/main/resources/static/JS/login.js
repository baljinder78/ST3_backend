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
               return false
            }


        }
    };
    var data={
        "Username":uname,
        "Password":pass
    };
    xhttp.send(JSON.stringify(data));
}
