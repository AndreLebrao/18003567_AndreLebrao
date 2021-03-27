const express = require('express');
const axios = require('axios');
const app = express();
app.use(express.json());


const funcoes = {
    LembreteCriado: (lembrete) =>{
        baseConsulta[lembrete.contador] = lembrete;
    },
    ObservacaoCriada: (observacao)=>{
        const observacoes = baseConsulta[observacao.lembreteId]['observacoes'] || [];
        observacoes.push(observacao);
        baseConsulta[observacao.lembreteId]['observacoes'] = observacoes;
    },
    ObservacaoAtualizada:(observacao) =>{
        const observacoes = baseConsulta[observacao.lembreteId]['observacoes'];
        const indice = observacoes.findIndex(o=>o.id===observacao.id);
        observacoes[indice] = observacao;
    }

}

const baseConsulta= {};

app.get(('/lembretes'),(req,res)=>{
    res.status(200).send(baseConsulta);
});

app.post('/eventos',(req,res)=>{
    funcoes[req.body.tipo](req.body.dados);
    try {
        funcoes[req.body.tipo](req.body.dados)
    } catch (error) {
        res.status(200).send(baseConsulta);
    }
    
});

app.listen(6000,()=>console.log("Microsserviço consulta. Porta 6000"));