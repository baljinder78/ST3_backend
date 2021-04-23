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
                parent.setAttribute("action","#");
            }
            else if(this.responseText==="true")
            {
                parent.setAttribute("action","/dashboard");
            }

        }
    };
    var data={
        "Username":uname,
        "Password":pass
    };
    xhttp.send(JSON.stringify(data));
}

