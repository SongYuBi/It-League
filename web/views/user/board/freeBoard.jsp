<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en"> 
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="js/jquery-3.1.1.js"></script>
    <script src="js/bootstrap.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
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
#footer {
   width: 100%;
   height: 500px;
   background-color:#111B39;
}
.maintext {
   float:left;
}
.wrap {
    display: inline-block;
}
select {
width: 200px;
padding: .8em .5em;
border: 1px solid #999;
font-family: inherit;
margin-top:10px;
}


.checkbox-container input[type="checkbox"] {
width: 1px;
height: 1px;
padding: 0;
margin-left:1150px;
overflow: hidden;
clip:rect(0,0,0,0);
border: 0
}
.checkbox-container input[type="checkbox"] + label:before {
content: ' ';
display: inline-block;
width: 20px;
height: 20px;
line-height: 20px;
margin: -5px 8px 0 0;
text-align: center;
vertical-align: middle;
background: #fafafa;
border: 1px solid #cacece;
border-radius: 3px;
box-shadow: 0px 1px 2px rgba(0,0,0,0.05), inset 0px -15px 10px -12px rgba(0,0,0,0.05);
}
.checkbox-container input[type="checkbox"] + label:active:before,
.checkbox-container input[type="checkbox"]:checked + label:active:before {
        box-shadow: 0px 1px 2px rgba(0,0,0,0.05), inset 0px 1px 3px rgba(0,0,0,0.1);
}


.checkbox-container input[type="checkbox"]:checked + label:before {
content: '\2713';
color: #314ca2;
text-shadow: 1px 1px white;
background: #f1f4ff;
border-color: #adb8c0;
box-shadow: 0px 1px 2px rgba(0,0,0,0.05), inset 0px -15px 10px -12px rgba(0,0,0,0.05);
}
.checkbox-container {
    float:left; 
    padding-right: 30px;
    padding-top: 16px;
}
    </style>
</head>
<header>
    <br><br>
    <div id="headWrapper" align="center">
       <div id="logo">
          <img  src="/semi/resources/image/chu/logo.png" width="400px" height="150px">  
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
    <div class="menu" align="center" style="font-weight:900; font-size: 50px ; margin:0 auto ; margin-top:40px ">자유게시판</div> 
    <br clear="both"> 
    
    <div class="wrap" align="right" style="margin:0 auto ;">
        <div class="checkbox-container">
        <input type="checkbox" id="a"> <label for="a" style="font-size: 20px; " >공지 숨기기</label>
    </div>
        <select>
            <option>10개씩 보기</option>
            <option>15개씩 보기</option>
            <option>20개씩 보기</option>
        </select>
    </div>
    <br clear="both"> 
   <hr width="1440px" style="margin-top: 19px; height: 1px; background: gray;">
   <div class="container">
   <table class="table table-hover">
        <thead>
            <tr>
                <th>글번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>날짜</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>00001</td>
                <td>
                가입인사입니다.</td>
                <td>인생이쓰다</td>
                <td>2020.09.05</td>
            </tr>
        </tbody>
        <tbody>
            <tr>
                <td>00001</td>
                <td>가입인사입니다.</td>
                <td>인생이쓰다</td>
                <td>2020.09.05</td>
            </tr>
        </tbody>
        <tbody>
            <tr>
                <td>00001</td>
                <td>가입인사입니다.</td>
                <td>인생이쓰다</td>
                <td>2020.09.05</td>
            </tr>
        </tbody>

    </table>
<hr>
<a class="btn btn-default pull-right" href="post00001.html">글쓰기</a>

<div class="text-center">
    <ul class="pagination">
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
    </ul>
</div>
</div>
</body>
<br><br><br>
<footer>
  <div id="footer" align="center">
     <img src="/semi/resources/image/chu/footer.png" width="1500px" height="500px">
   </div>
</footer>
</html>