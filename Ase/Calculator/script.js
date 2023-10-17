function clearAll(){
    document.getElementById("result").value="";
}
function display(value){
    document.getElementById("result").value+=value;
}
function calculate(){
    let res=document.getElementById("result").value;
    let finalres=eval(res);
    document.getElementById("result").value=finalres;
}