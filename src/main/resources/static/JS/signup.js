function signup(){

    var uname=document.getElementById("uname").value;
    var email=document.getElementById("email").value;
    var pass=document.getElementById("pass").value;
    var ph_no=document.getElementById("ph_no").value;
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8080/sign", true);
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if(this.responseText==="false")
            {
                alert("Done");
            }

        }
    };
    var data={
        "Username":uname,
        "Email":email,
        "Password":pass,
        "Phone_number":ph_no
    };
    xhttp.send(JSON.stringify(data));
}