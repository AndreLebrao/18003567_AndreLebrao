const express = require('express');
const axios = require('axios');

const app = express();
app.use(express.json());

const eventos = []

app.post('/eventos',(req,res)=>{
    const evento = req.body;
    // console.log(evento);
    eventos.push(evento);
    //envia o evento para o microsserviço de lembretes
    axios.post('http://localhost:4000/eventos',evento);
    //envia o evento para o microsserviço de observações
    axios.post('http://localhost:5000/eventos',evento);
    //envia o evento para o microsserviço de consulta
    axios.post('http://localhost:6000/eventos', evento);
    //envia o evento para o microsserviço de classificacao
    axios.post('http://localhost:7000/eventos', evento);
    res.status(200).send({msg:'ok'});
});

app.get('/eventos',(req,res)=>{
    try {
        funcoes[req.body.tipo](req.body.dados);
    } catch (error) {
        
    }
});

app.listen(10000,()=>console.log('Microsserviço Evento Bus. Porta 10000'))