const express = require('express');
const bodyParser = require('body-parser');
const {v4: uuidv4} = require ('uuid');
const axios = require('axios');

const app = express();
app.use(bodyParser.json());

/* {
        1:[
            {id: a,texto:exemplo 1}
            {id: b,texto:exemplo 2}
        ],
        2:[
            {id: c,texto:exemplo 3}
            {id: d,texto:exemplo 4}
        ]
    }
*/

const observacoesPorLembreteId = {};

// localhost:5000/lembretes/123/observacoes
app.put('/lembretes/:id/observacoes',async(req,res)=>{
    const idObs = uuidv4();
    const {texto} = req.body;
    const observacoesDoLembrete = observacoesPorLembreteId[req.params.id] || [];
    observacoesDoLembrete.push({id:idObs,texto});
    observacoesPorLembreteId[req.params.id] = observacoesDoLembrete;

    await axios.post('http://localhost:10000/eventos',{
    tipo:"ObservacaoCriada",
    dados:{id:idObs,texto,lembreteId:req.params.id}
});
    res.status(201).send(observacoesDoLembrete);
});

app.post('/eventos',(req,res)=>{
    console.log(req.body);
    res.status(200).send({msg:'ok'});
});

app.get('/lembretes/:id/observacoes',(req,res)=>{
    res.send(observacoesPorLembreteId[req.params.id]||[]);
});

app.listen(5000, () => {
    console.log("Microsserviço de lembretes executando na porta 5000.")
});