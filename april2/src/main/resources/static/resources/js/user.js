"use strict"
var user = user || {} // var는 전역을 뜻하는 표시, userd는 네임스페이스 {}는 제이슨,{}에 제이슨을 넣으면 제이슨이 된다...
user = (()=>{
	let init = () =>{
		alert('1')
		onCreate()
	}
	let onCreate = () =>{ //객체를 만듦 
		setContentView()
			$('#register_a').css('cursor','pointer').click(e=>{
			e.preventDefault()
			location.href = "/admin"
		})
		
	}
	let setContentView = () =>{ //객체가 만들어지면 보여줌 처음엔 텅빈상태
		 $('#kcdc').css({ width: '80%', height: '900px' }).addClass('border_black center')
	     $('#tr_1').css({ width: '80%', height: '50px' }).addClass('border_black center')
	     $('#menu').css({ width: '80%', height: '50px' }).addClass('border_black center')
	     $('#kcdc td').addClass('border_black', 'width_full')

	}
	return {init} //즉시실행 함수
	
})()
//람다식함수는 익명함수이기 때문에 메모리공간을 차지하지않는다.기능만 호출한다. 점만찍고 바로사라짐..넷플릭스의 원리