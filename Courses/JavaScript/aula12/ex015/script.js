function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var fAno = document.getElementById('txtano')
    var res = document.getElementById('res')

    if(fAno.value.length == 0 || Number(fAno.value) > ano){
        window.alert('[ERROR] Verifique os dados e tente novamente')
    } else {
        var fSex = document.getElementsByName('radsex')
        var idade = ano - Number(fAno.value)
        var genero = ''
    
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')
    
        if(fSex[0].checked){
            genero = 'Homem'
            
            if(idade >= 0 && idade < 13){
                // Criança
                img.setAttribute('src', 'img/baby-boy.png')
            } else if (idade < 21){
                // Jovem
                img.setAttribute('src', 'img/young-boy.png')
            } else if (idade < 60){
                // Adulto
                img.setAttribute('src', 'img/man.png')
            } else {
                // Idoso
                img.setAttribute('src', 'img/old-man.png')
            }
    
        } else {
            genero = 'Mulher'
    
            if(idade >= 0 && idade < 13){
                // Criança
                img.setAttribute('src', 'img/baby-girl.png')
            } else if (idade < 21){
                // Jovem
                img.setAttribute('src', 'img/young-girl.png')
            } else if (idade < 60){
                // Adulto
                img.setAttribute('src', 'img/woman.png')
            } else {
                // Idoso
                img.setAttribute('src', 'img/old-woman.png')
            }
        }

        res.style.textAlign = 'center';
        
        if ( Number(idade) == 1 ){
            res.innerHTML = `Detectamos ${genero} com ${idade} ano`
        } else {
            res.innerHTML = `Detectamos ${genero} com ${idade} anos`
        }
        
        res.appendChild(img)
    }
}