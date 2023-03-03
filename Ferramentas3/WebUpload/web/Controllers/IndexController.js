function carregarMensagem() {
    let mensagem = document.getElementById("mensagem")
    fetch("MensagemServlet")
            .then(response => { response.text().then((dados) => {mensagem.innerHTML=dados }) })
            .catch((error) => {console.log(mensagem.dados)})
}

function enviaArquivo () {
    event.preventDefault();
    
    const URL_TO_FETCH = 'UpServlet';
    
    var formData = new FormData(document.getElementById("fdados"))
    
    fetch(URL_TO_FETCH, {method: 'post', body: formData}).then(response => {
        return response.text();}).then(retorno => {
        mensagem.innerHTML="Upload concluído";
    })
            .catch(erro => {
                console.log("Erro no upload")
    })
}
