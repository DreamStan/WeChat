/**
 * Created by Eminem on 2017/10/15.
 */
$(function () {
    $("#busName").val($(".busName").text())
    var busName = $(".busName").text()
    $("#busSer").val($(".busSer").text())
    var busSer = $(".busSer").text()
    $("#busFixedtelephone").val($(".busFixedtelephone").text())
    var busFixedtelephone = $(".busFixedtelephone").text()
    $("#busMobiletelephone").val($(".busMobiletelephone").text())
    var busMobiletelephone = $(".busMobiletelephone").text()
    $("#busIntroduction").val($(".busIntroduction").text())
    var busIntroduction = $(".busIntroduction").text()
    var id = $(".id").text()
    $("#save").click(function () {
        $.ajax({
            url:"/modifybus",
            data:{
                id:id,
                busName:busName,
                busSer:busSer,
                busFixedtelephone:busFixedtelephone,
                busMobiletelephone:busMobiletelephone,
                busIntroduction:busIntroduction
            },
            success:function (res) {
                if (res>0){
                    alert("修改成功")
                }else{
                    alert("修改失败")
                }
            }
        })
    })





})
var id1 = 0
function addImg(id,busName) {
    id1 = id
    $.ajax({
        url:"/jumpaddimg",
        success:function (res) {
            if (res>3){
                alert("最多只能给三个商家添加宣传图")
            }else{
                document.getElementById("bus").innerHTML = '['+busName+']'
                document.getElementById("id").innerHTML = '['+id+']'
                $("#Publicity").modal({
                    target:'#Publicity'
                })
             }
         }
     })
}

function saveImg() {
    var id = id1;
    // var fileName = $("#busImg").val()

    $.ajaxFileUpload({
        url:'/upload',
        type:'POST',
        data:{
          id:id
        },
        secureuri:false,
        fileElementId:'busImg',
        dataTye:'JSON',
        success:function (data,status) {
            if (status=='success'){
                alert("成功")
            }else{
                alert("失败")
            }
        },
        error:function (data,status,e) {
            alert(e)
        }
    })
}

var id2 = 0
function delBtn(id,busName) {
    id2 = id
    document.getElementById("del").innerHTML = '['+busName+']'
    $("#delete").modal({
        target:'#delete'
    })
}

function delBus() {
    var id = id2

    $.ajax({
        url:'/delbus',
        data:{
            id:id
        },
        dataType:'JSON',
        success:function (res) {
            if (res>0){
                alert("成功")
            }else{
                alert("失败")
            }
        },
        error:function (e) {
          alert(e)
        }
    })
}