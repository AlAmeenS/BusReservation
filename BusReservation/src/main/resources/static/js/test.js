/**
 * 
 */
function clicked(){
	alert("clicked");
}

function postMethod(authentiate,url,method) {
	  authentiate = JSON.stringify(authentiate);
	  let xhttp = new XMLHttpRequest();
	  xhttp.open(method, url, true);
	  xhttp.setRequestHeader("Content-Type", "application/json");
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	     document.getElementById("demo").innerHTML = this.responseText;
	    }
	  };
	  xhttp.send(authentiate);
}

function signupFunction(event){
	event.preventDefault();
	let userName = document.getElementById("signupform").elements.namedItem("email").value;
	let password = document.getElementById("signupform").elements.namedItem("password").value;
	let authentiate = {
			userName,
			password
	};
	url = "/signup";
	method = "post";
	postMethod(authentiate,url,method);
	
}