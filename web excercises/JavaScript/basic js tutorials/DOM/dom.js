//  console.log(document.querySelectorAll("h1"));
// const firstHead=document.querySelectorAll("h1");
// console.log(firstHead);
// const second=document.querySelector(".second");
// console.log(document.querySelector("#para"));
// console.log(document.getElementById('para'));
// console.log(document.getElementsByTagName("h2"));
// second.style.color='red';
// second.style.backgroundColor='yellow';

const  btn=document.createElement("button");
btn.textContent="Click here";
btn.className="btn1";

const division =document.querySelector('div');
division.appendChild(btn);

btn.addEventListener('click',()=>
    document.querySelector('h3').remove());



const diiv=document.createElement('div');
diiv.textContent="hi hello ra how are u";
const body =document.querySelector('body');
body.appendChild(diiv);
const p=document.querySelector('p');
p.addEventListener("click",function (){
    clickPara("hello");

});
function clickPara(name)
{
    console.log(name+"para Clicked");
}
document.addEventListener("keydown",()=>console.log("key pressed"));















