function contar()
{
    let numIni = document.getElementById( "txtIni" );
    let numFim = document.getElementById( "txtFim" );
    let numPas = document.getElementById( "txtPas" );
    var res  = document.getElementById( "res" );

    if ( numIni.value.length !== 0 && numFim.value.length !== 0 && numPas.value.length !== 0 )
    {
        res.innerHTML = "<br> Contando: <br>";
    
        let ini = Number( numIni.value );
        let fim = Number( numFim.value );
        let pas = Number( numPas.value );
    
        if ( pas <= 0 )
        {
            window.alert( "Passo inválido! Considerando Passo 1" );
            pas = 1;
        }
    
        if ( ini < fim ) 
        {
            // Contagem Crescente
            for ( let x = ini; x <= fim; x += pas )
            {
                res.innerHTML += `${x} \u{1F449} `;
            }
        }
    
        else 
        {
            // Contagem Regressiva
            for ( let y = ini; y >= fim; y -= pas )
            {
                res.innerHTML += `${y} \u{1F449} `;
            }
        }
    
        res.innerHTML += `\u{1F3C1}`;
    }
    
    else
    {
        res.innerHTML = "<br> Impossível Contar";
    }
}