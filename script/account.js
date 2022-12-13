/**
 * 
 */
 
function accountCheck() {
	if(document.act.email.value.length==0) {
		alert("이메일을 입력해주세요");
		act.email.focus();
		return false;
	}
	if(document.act.pwd.value.length==0) {
		alert("비밀번호를 입력해주세요");
		act.pwd.focus();
		return false;
	}
	if(document.act.pwdcheck.value.length==0) {
		alert("비밀번호를 다시 입력해주세요");
		act.pwdcheck.focus();
		return false;
	}
	if(document.act.pwd.value != document.act.pwdcheck.value && document.act.pwdcheck.value.length !="") {
		alert("비밀번호가 틀렸습니다");
		act.pwdcheck.focus();
		return false;
	}
	if(document.act.fname.value.length==0) {
		alert("성을 입력해주세요");
		act.fname.focus();
		return false;
	}
	if(document.act.lname.value.length==0) {
		alert("이름을 입력해주세요");
		act.lname.focus();
		return false;
	}
	if(document.act.birthy.value.length!=4) {
		alert("태어난 해를 정확히 입력해주세요");
		act.birthy.focus();
		return false;
	}
	if(document.act.birthm.value=="default") {
		alert("태어난 달을 선택해주세요");
		act.birthm.focus();
		return false;
	}
	if(document.act.birthd.value.length==0) {
		alert("태어난 날을 입력해주세요");
		act.birthd.focus();
		return false;
	}
	return true;
}

function accountCheck2() {
	if(document.act.phone.value.length==0) {
		alert("전화번호를 입력해주세요");
		act.phone.focus();
		return false;
	}
	if(document.act.pwd.value.length==0) {
		alert("비밀번호를 입력해주세요");
		act.pwd.focus();
		return false;
	}
	if(document.act.pwdcheck.value.length==0) {
		alert("비밀번호를 다시 입력해주세요");
		act.pwdcheck.focus();
		return false;
	}
	if(document.act.pwd.value != document.act.pwdcheck.value && document.act.pwdcheck.value.length !="") {
		alert("비밀번호가 틀렸습니다");
		act.pwdcheck.focus();
		return false;
	}
	if(document.act.fname.value.length==0) {
		alert("성을 입력해주세요");
		act.fname.focus();
		return false;
	}
	if(document.act.lname.value.length==0) {
		alert("이름을 입력해주세요");
		act.lname.focus();
		return false;
	}
	if(document.act.birthy.value.length!=4) {
		alert("태어난 해를 정확히 입력해주세요");
		act.birthy.focus();
		return false;
	}
	if(document.act.birthm.value=="default") {
		alert("태어난 달을 선택해주세요");
		act.birthm.focus();
		return false;
	}
	if(document.act.birthd.value.length==0) {
		alert("태어난 날을 입력해주세요");
		act.birthd.focus();
		return false;
	}
	return true;
}


function test(e) {
   var number = e.value.replace(/[^0-9]/g, "");
   var phone = "";

   if (number.length < 4) {
      return number;
   } else if (number.length < 7) {
      phone += number.substr(0, 3);
      phone += "-";
      phone += number.substr(3);
   } else if (number.length < 10) {
      phone += number.substr(0, 2);
      phone += "-";
      phone += number.substr(2, 3);
      phone += "-";
      phone += number.substr(5);
   } else if (number.length < 11) {
      phone += number.substr(0, 3);
      phone += "-";
      phone += number.substr(3, 3);
      phone += "-";
      phone += number.substr(6);
   } else {
      phone += number.substr(0, 3);
      phone += "-";
      phone += number.substr(3, 4);
      phone += "-";
      phone += number.substr(7, 4);
   }

   e.value = phone;
}


function emailAdd() {
	var e = /^([\w\.\_\-])*[a-zA-Z0-9]+([\w\.\_\-])*([a-zA-Z0-9])+([\w\.\_\-])+@([a-zA-Z0-9]+\.)+[a-zA-Z0-9]{2,8}$/i;
	//이메일 글자 앞 중간 뒤에 영문+숫자 포함하여 특수문자 중 점( . ) 하이픈( - ) 언더바( _ ) 만 사용 가능하도록 하는 정규식입니다.
	if(e.test(document.act.email.value)==false) {
		alert("이메일 형식 아님");
		act.email.focus();
		return false;
	}
}

function pwdAdd() {
	var reg = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
	if(!reg.test(document.act.pwd.value)) {
		alert("비밀번호는 8자 이상의 숫자와 문자를 포함해야 합니다");
		act.pwd.value = '';
		act.pwd.focus();
		return false;
	}
}

/*
const autoHyphen = (target) => {
	target.value = target.value
	.replace(/[^0-9]/g, '')
	.replace(/^(\d{2,3})(\d{3,4})(\d{4})$/, `$1-$2-$3`); // 숫자가 아닌 모든 것은 공백으로 처리
}
*/

function passCheck() {
	if(document.act.pwd.value != document.act.pwdcheck.value && document.act.pwdcheck.value.length !="") {
		alert("비밀번호가 틀렸습니다");
		act.pwdcheck.focus();
		return false;
	}
}

function checkSelectAll(checkbox)  {
  const selectall 
    = document.querySelector('input[name="checkAll"]');
  
  if(checkbox.checked === false)  {
    selectall.checked = false;
  }
}

function selectAll(selectAll)  {
  const checkboxes 
     = document.getElementsByName('check');
  
  checkboxes.forEach((checkbox) => {
    checkbox.checked = selectAll.checked
  })
}

function checkbox() {
	if($("#check1").is(":checked")==false) {
		alert("이용 약관 동의는 필수입니다");
		return false;
	}
	if($("#check2").is(":checked")==false) {
		alert("특별 약관 동의는 필수입니다");
		return false;
	}
	if($("#check3").is(":checked")==false) {
		alert("개인정보 수집 및 이용 동의는 필수입니다");
		return false;
	}
	return true;
}

function loginCheck() {
	if(document.acf.email.value.length==0) {
		alert("이메일을 입력하세요");
		acf.email.focus();
		return false;
	}
	if(document.acf.pwd.value.length==0) {
		alert("비밀번호를 입력하세요");
		acf.pwd.focus();
		return false;
	}
	return true;
}

function loginCheck2() {
	if(document.acf.phone.value.length==0) {
		alert("전화번호를 입력하세요");
		acf.phone.focus();
		return false;
	}
	if(document.acf.pwd.value.length==0) {
		alert("비밀번호를 입력하세요");
		acf.pwd.focus();
		return false;
	}
	return true;
}