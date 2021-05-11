function fun()
{

    document.getElementById("try").innerHTML=localStorage.getItem("user_name");
    console.log(localStorage.getItem("user_name"));
    console.log("hell");
}

function adddetail()
{

     
        // var name=document.getElementById("name").value;
        // var pass=document.getElementById("pass").value;
        // var parent=document.getElementById("my_form");
        // var xhttp = new XMLHttpRequest();
        // xhttp.open("POST", "http://localhost:8080/addnumber", true);
        // xhttp.onreadystatechange = function() {
        //     if (this.readyState == 4 && this.status == 200) {
        //         if(this.responseText==="false")
        //         {
        //             alert("UserInvalid");
        //             return false
        //         }
        //
        //
        //     }
        // };
        // var data={
        //     "Username":uname,
        //     "Password":pass
        // };
        // xhttp.send(JSON.stringify(data));
    }
