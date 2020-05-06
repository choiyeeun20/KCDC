"use strict"

var lostVue = {
		lostDetail : ()=>{
			return `<table id="register_t">
			<tr>
			<td rowspan="5"><img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQzAevD8eJKxxRX4Kqb67th65ebHEmIjkACyhElI7mGUmAru6Vo&usqp=CAU"></td>
			<td id="text_index"><a>분실물 ID</a></td>
			<td id="text_input"><span id="id" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>습득물품명</a></td>
			<td><span id="name" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>습득일자</a></td>
			<td><span id="date" style="width:250px;height:40px"></td>
		</tr>
		<tr>
			<td><a>습득물분류</a></td>
			<td><span id="category" style="width:250px;height:40px"></td>
		
		<tr>
			<td><a>습득물위치</a></td>
			<td><span id="location" style="width:250px;height:40px"></td>
		</tr>
			
	</table>`
			
		},
		lostList :()=>{
			return `<table id="lostList">
                        <tr>
                            <td>
                                <a id="number">No.</a>
                            </td>
                            <td>
                                <a id="id">분실물아이디</a>
                            </td>
                             <td>
                                <a id="name">습득물품명</a>
                            </td>
                           <td>
                                <a id="date">습득일자</a>
                            </td>
                            <td>
                                <a id="category">습득물분류</a>
                            </td>
                            <td>
                                <a id="location">습득위치</a>
                            </td>
                        </tr>
                        
                    </table>`
		}
}