<html>
	<body>
		<style>
			body{
				display: flex;
				justify-content:center;
				align-content: center;
			}
			form{
				display: flex;
				flex-direction: column;
				width : 250px;
			}
		</style>
		<form action="validate" >
		<label>User Name : </label> 
		<input type="text" name="name" placeholder="UserName"> <br>
		<label>Password : </label> 
		<input type="password" name="password" placeholder="Password"> <br>
		<input type="submit" value="Login" style="color:blue">
		</form>
	</body>
</html>