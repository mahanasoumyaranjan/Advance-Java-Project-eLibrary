function validate(){
	const id = document.getElementById("id").value;
	const name = document.getElementById("name").value;
	const email = document.getElementById("email").value;
	const password = document.getElementById("password").value;
	if(id<100 || id>1000){
		alert("id should be in between 100 and 1000");
		return false;
	}
	if(name == ""){
		alert("name should not be empty");
		return false;
	}
	let atPos = email.indexOf('@');
	if(atPos<=0){
		alert("enter a valid email");
		return false;
	}
	if(password.length<6 || password.length>15){
		alert("password length in between 6 to 15 characters");
		return false;
	}
}