function requestGetToBackend() {
  const xmlHttp = new XMLHttpRequest();
  xmlHttp.open("GET", "http://localhost:8000/motorista", false);
  xmlHttp.send(null);
  
  const response = xmlHttp.responseText;

  /**
   * GET -> buscar algo
   * POST -> salvar algo
   * PUT -> atualizar algo
   * DELETE -> deletar algo
   * PATCH -> atualizar parte de algo
   * OPTIONS -> valida cors.
   */

  document.getElementById('result').innerHTML = 'Resultado da api: ' + response;
}

function requestPostToBackend() {
  let content = {
    nome: document.getElementById('nome').value,
    idade: document.getElementById('idade').value,
    cidade: document.getElementById('cidade').value
  };

  const contentJson = JSON.stringify(content);
  console.log(contentJson);

  const xmlHttp = new XMLHttpRequest();
  xmlHttp.open("POST", "http://localhost:8000/motorista", false);
  xmlHttp.send(contentJson);
  
  const response = xmlHttp.responseText;

  /**
   * GET -> buscar algo
   * POST -> salvar algo
   * PUT -> atualizar algo
   * DELETE -> deletar algo
   * PATCH -> atualizar parte de algo
   * OPTIONS -> valida cors.
   */

  document.getElementById('result').innerHTML = 'Resultado da api: ' + response;
}