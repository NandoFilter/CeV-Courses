function carregar() {
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')

    var hora = new Date().getHours()

    msg.innerHTML = `Agora são ${hora} horas.`

    if (hora >= 6 && hora < 12) {

        img.src = 'img/manha.png'
        document.body.style.background = '#acc0c9'

    } else if (hora >= 12 && hora <= 18) {

        img.src = 'img/tarde.png'
        document.body.style.background = '#fdc765'

    } else {

        img.src = 'img/noite.png'
        document.body.style.background = '#7c5477'
        
    }
}