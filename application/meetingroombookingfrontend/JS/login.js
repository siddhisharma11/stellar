document.addEventListener("DOMContentLoaded", function () {
  const loginForm = document.getElementById("login-form");

  // Define an array of username-password pairs with Base64 encrypted usernames and passwords
  const users = [
    { username: "Admin", password: "admin", role: "Admin" }, // "Ahmad" and "123" encrypted with Base64
    { username: "Manager", password: "manager", role: "Manager" }, // "Ali" and "099" encrypted with Base64
    { username: "User", password: "user", role: "User" }, // "Uzair" and "786" encrypted with Base64

  ];

  loginForm.addEventListener("submit", function (event) {
    event.preventDefault();
    const enteredUsername = document.getElementById("username").value;
    const enteredPassword = document.getElementById("password").value;
    let flag = 0;
    users.forEach((item) => {

      if (item.username == enteredUsername && item.password == enteredPassword) {
        flag = 1;
        if (item.role == "Admin") {
          window.location.assign('admin.html');
        }
        else if (item.role == "User") {
          window.location.assign("home.html");
        }
        else {
          window.location.assign("manager.html");
        }
      }
    })
    if (flag == 0) {
      alert('Username or password incorrect');
    }

  });
});
