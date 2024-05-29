<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>zootopia</title>

<!-- 구글 웹폰트 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/header_footer.css">
<link rel="stylesheet" href="css/common.css">
<script src="script/common.js"></script>
<script src="script/jquery-3.7.1.min.js"></script>
</head>
<body>

<header>
<div class="header-container">
	<div class="logo-menu">
		<div class="logo">
			<a href="zootopia.do?command=main">Zootopia</a>
		</div>
		<nav class="navigation">
			<ul>
				<li><a href="zootopia.do?command=contest">콘테스트</a></li>
				<li><a href="zootopia.do?command=free">자유게시판</a></li>
				<li><a href="zootopia.do?command=qna">Q&A</a></li>
			</ul>
		</nav>
	
	</div>
	
	<div class="login-menu">
		<div class="login">
			<a href="zootopia.do?command=loginform">Login</a>
		</div>
		<div class="logout displaynone">
			<a href="zootopia.do?command=mypage">닉네임(아이디)님</a>
			<a href="zootopia.do?command=logout">Logout</a>
		</div>
	
	</div>
</div>
</header>

<div class="wrapper">
<div id="content">