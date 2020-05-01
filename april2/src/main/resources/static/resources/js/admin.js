"use strict"

var admin = admin ||{}

admin = (()=>{
	let init = () => {
		alert('1')
		onCreate()
	}
	let onCreate = () => {
		alert('2')
		setContentView()
		
	}
	let setCotentView = () => {
		alert('3')
	}
	return {init}
})()