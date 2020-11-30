import 'package:flutter/material.dart';
import 'package:p2_flutter/models/Heroi.dart';
import 'package:p2_flutter/models/RespostaAPI.dart';
import 'package:p2_flutter/utility/network_helper.dart';


class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  var _listaHerois = [];
  final _controlador = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(title: Text("BokuNoWiki"),centerTitle: true,),
        body: Column(
          children: [
            customTextField(_controlador, "", "URL:", Icons.search),
            FlatButton(onPressed: ()async{
              await procurarHeroi();

            }, child: Text("Buscar")),
            Expanded(
              child: ListView.builder(

                  itemBuilder: (context, index){
                    return ListTile(
                      title: Text("asd"));
                  },
                itemCount: _listaHerois.length,
              ),
            )
            
          ],
        ),
      ),
    );
  }

  Future procurarHeroi() async {
    var _req = NetworkHelper(url:"https://myheroacademiaapi.com/api/character?alias="+_controlador.text);
    var _resp = await _req.getData();
    if(_resp!=null){
      var _json = RespostaAPI.fromJson(_resp);
      setState(() {
        var novoHeroi = Heroi(
            _json.result.first.images.first,
            _json.result.first.name,
            _json.result.first.gender,
            _json.result.first.alias,
            _json.result.first.quirk,
            _json.result.first.affiliation,
            _json.result.first.birthday);
        if(!_listaHerois.contains(novoHeroi)){_listaHerois.add(novoHeroi);}
      });
    }
  }

  Padding customTextField(TextEditingController controlador, String hint, String label, IconData icone) {
    return Padding(
      padding: const EdgeInsets.all(4.0),
      child: TextField(controller: controlador,decoration: InputDecoration(
          hintText: hint,
          labelText: label,
          icon: Icon(icone)
      ),),
    );
  }
}
