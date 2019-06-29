/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function goGoogle()
{
    var boxEle = document.getElementById("box");
    var text;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var website = document.getElementById('website').value;
    var message = document.getElementById('message').value;
    // Bước 2: Kiểm tra dữ liệu hợp lệ hay không
    if(isNaN(username)){
        boxEle.style.backgroundColor = "red";
        boxEle.style.border = "1px solid white";
        boxEle.innerText = "This field is required";
    }
}
function goGg(){
   var x, text;
   x = document.getElementById("username").value;
   if(isNaN(x)){
       text = "This field is required";
   }
   document.getElementById("demo").innerHTML = text;
}