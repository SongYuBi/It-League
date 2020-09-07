<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
   #headWrapper {
      width:100%;
   }
#bar {
  margin-left:10px;
  margin-right:10px;
}
.btns {
   position:static;
   margin-left:1400px;
   width:300px;
  
}
.loginBtns {
   float:left;
}
.menu{
  float:left;
}
#logo {
  margin: 0 auto;
  padding:0;
}
.eventtext{
  width:70%;
  height:190px;
}
.maintext {
   float:left;
}
#announce {
   background-color:#13264B;
   color: white;
   border-radius: 100px;
}
.nav {
   display:inline-block;
}
#footer {
   width: 100%;
   height: 500px;
   background-color:#111B39;
}


    </style>
</head>
<header>
   <br><br>
   <div id="headWrapper" align="center">
      <div id="logo">
         <img src="/semi/resources/image/chu/logo.png" width="400px" height="150px">  
      </div>     
       <div class="btns" style="font-size:20px; color: gray; font-weight: 600;">
         <div class= "loginBtns" id="loginBtn" onclick="login();"><label>로그인 </label> </div>
         <div class= "loginBtns" id="bar"><label>|</label></div>
         <div class= "loginBtns" id="memberJoinBtn" onclick="memberJoin();"><label> 회원가입</label> </div>
      </div>
   </div>
   <br clear="both"> 
</header>
    
<br><br> 

<hr style="height: 3px; background: black;">
  <body>
  <div class="wrap" align="center">
        <div class="nav" >
           <div class="menu" style="font-weight:900; font-size: 50px ; margin:0 auto ; margin-top:40px "> 이벤트</div>
             <div class="maintext" style="line-height: 160px; margin-left:30px; font-size: 25px; font-weight: 600; color:#707070" > 풍성한 이벤트 ! 즐거운 잇츠리그</div>
             <a href="/test.html" target="_blank">
             <div class="goback" style="margin-left:1230px; margin-top: 68px; font-size: 20px; font-weight: 600; color:gray"><label>목록으로가기</label></div>
             </a>
            </div>
            
    </div>
      
     <br clear="both"> 

  <hr width="1440px" style="margin-top: -40px;">
 <br>
<body>
    <div id="eventex" align="center">
        <img src="/semi/resources/image/chu/event1.jpg" width="1440px" height="2500px">
      </div>
</body>

<br><br><br>
<footer>
  <div id="footer" align="center">
     <img src="/semi/resources/image/chu/footer.png" width="1500px" height="500px">
   </div>
</footer>
</html>