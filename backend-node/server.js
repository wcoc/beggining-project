const http = require('http');

const server = http.createServer((request, response) => {
  response.setHeader('Access-Control-Allow-Origin', '*');

  
  if (request.method === 'GET') {
    console.log('é get');
    if (request.url.endsWith('/motorista')) {
      response.write('ola do da api node no endpoint /motorista');
    }
    if (request.url.endsWith('/test/ola2')) {
      response.write('ola do da api node no endpoint /test/ola2');
    }
    if (request.url.endsWith('/test/ola3')) {
      response.write('ola do da api node no endpoint /test/ola3');
    }
  }
  
  if(request.method === 'POST') {
    let rawBody = [];
    request.on('data', (chunk) => {
      rawBody.push(chunk);
    }).on('end', () => {
      rawBody = Buffer.concat(rawBody).toString();
      const jsonBody = JSON.parse(rawBody);
      // at this point, `body` has the entire request body stored in it as a string

      if (request.url.endsWith('/motorista')) {
        console.log(`Nome: ${jsonBody.nome}`);
        console.log(`Idade: ${jsonBody.idade}`);
        console.log(`Cidade: ${jsonBody.cidade}`);
        // save on database for example.
        // return the same data you received in backend api with flag received
        jsonBody.received = true;
        response.write(JSON.stringify(jsonBody));
      }

      response.end();
    });
  }
 
  
});

server.on('clientError', (err, socket) => {
  socket.end('HTTP/1.1 400 Bad Request\r\n\r\n');
});

server.listen(8000);


// {
//   "nome": "willian",
//   "idade": "26",
//   "endereco": {
//     "cidade": "Londrina",
//     "estado": "PR"
//   }
// }