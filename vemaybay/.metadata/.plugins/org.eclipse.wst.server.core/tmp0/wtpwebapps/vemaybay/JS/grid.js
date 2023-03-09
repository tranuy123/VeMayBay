var button=document.querySelector('.app button')
var fixed=document.querySelector('.fixed')
var close=document.querySelector('.close')
button.addEventListener('click',function(){
    fixed.classList.add('show')
})

close.addEventListener('click',function(){
    fixed.classList.remove('show')
})

document.addEventListener('keydown',function(e){
    if(e.keyCode == 27){
    fixed.classList.remove('show')

    }
})
















































