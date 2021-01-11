import 'package:flutter/material.dart';
import 'package:minha_lista_flutter/models/myhero.dart';

class MinhaListaHome extends StatelessWidget {
  final _myHeroList = [MyHero("All Might","Maromba","https://static.wikia.nocookie.net/p__/images/4/4d/All_Might_Full_Body_True_Form_Action.png/revision/latest?cb=20200726092835&path-prefix=protagonist"),MyHero("Deku","Menino Porcelana","https://static.wikia.nocookie.net/bokunoheroacademia/images/f/f7/Izuku_Midoriya_Hero_Costume_Action_Pose.png/revision/latest?cb=20200416203912&path-prefix=pt-br"),MyHero("Bakugo","Olha a explosão","https://vignette.wikia.nocookie.net/bokunohero/images/f/fc/Bakugou_render_1.png/revision/latest/scale-to-width-down/340?cb=20190624114800&path-prefix=pt-br")];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: ListView(
        children: [
          //Fazendo desse jeito, quando a lista fica muito grande ela ja tem scroll
          ListTile(title: Text(_myHeroList[0].nome),subtitle: Text(_myHeroList[0].singularidade),
            leading: Image.network(_myHeroList[0].urlImg),),
          ListTile(title: Text(_myHeroList[1].nome),subtitle: Text(_myHeroList[1].singularidade),
            leading: Image.network(_myHeroList[1].urlImg),),
          ListTile(title: Text(_myHeroList[2].nome),subtitle: Text(_myHeroList[2].singularidade),
            leading: Image.network(_myHeroList[2].urlImg),),
        ],
      ),
    );
  }
}

class MinhaListaHome2 extends StatelessWidget {
  final _myHeroList = [
    MyHero("All Might","Maromba","https://static.wikia.nocookie.net/p__/images/4/4d/All_Might_Full_Body_True_Form_Action.png/revision/latest?cb=20200726092835&path-prefix=protagonist"),
    MyHero("Deku","Menino Porcelana","https://static.wikia.nocookie.net/bokunoheroacademia/images/f/f7/Izuku_Midoriya_Hero_Costume_Action_Pose.png/revision/latest?cb=20200416203912&path-prefix=pt-br"),
    MyHero("Bakugo","Olha a explosão","https://vignette.wikia.nocookie.net/bokunohero/images/f/fc/Bakugou_render_1.png/revision/latest/scale-to-width-down/340?cb=20190624114800&path-prefix=pt-br"),
    MyHero("Uraraka", "Vamos flutuar juntos", "https://vignette.wikia.nocookie.net/bokunohero/images/4/47/Ochako_render.png/revision/latest/scale-to-width-down/340?cb=20190624120026&path-prefix=pt-br")];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: ListView.builder(
          itemBuilder: (context, index){
            return ListTile(
              title: Text(_myHeroList[index].nome),
              subtitle: Text(_myHeroList[index].singularidade),
              leading: Image.network(_myHeroList[index].urlImg)
            );
          },
          itemCount: _myHeroList.length,
      ),
    );
  }
}

class MinhaListaHome3 extends StatefulWidget {
  @override
  _MinhaListaHome3State createState() => _MinhaListaHome3State();
}

class _MinhaListaHome3State extends State<MinhaListaHome3> {
  final _myHeroList = [
    MyHero("All Might","Maromba","https://static.wikia.nocookie.net/p__/images/4/4d/All_Might_Full_Body_True_Form_Action.png/revision/latest?cb=20200726092835&path-prefix=protagonist"),
    MyHero("Deku","Menino Porcelana","https://static.wikia.nocookie.net/bokunoheroacademia/images/f/f7/Izuku_Midoriya_Hero_Costume_Action_Pose.png/revision/latest?cb=20200416203912&path-prefix=pt-br"),
    MyHero("Bakugo","Olha a explosão","https://vignette.wikia.nocookie.net/bokunohero/images/f/fc/Bakugou_render_1.png/revision/latest/scale-to-width-down/340?cb=20190624114800&path-prefix=pt-br"),
    MyHero("Uraraka", "Vamos flutuar juntos", "https://vignette.wikia.nocookie.net/bokunohero/images/4/47/Ochako_render.png/revision/latest/scale-to-width-down/340?cb=20190624120026&path-prefix=pt-br")];

  final controladorNome = TextEditingController();

  final controladorSingularidade = TextEditingController();

  final controladorUrlImg = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          children: [
            Expanded(child: Image.network("https://i.pinimg.com/originals/4c/67/51/4c67516ab6bf8f6ebda56b8bfb064d41.png")),
            myTextField(controladorNome,"Nome do herói","Nome",Icons.drive_file_rename_outline),
            myTextField(controladorSingularidade,"Nome da Singularidade","Singularidade",Icons.ac_unit),
            myTextField(controladorUrlImg,"Url da Imagem","url",Icons.image),
            FlatButton(onPressed: (){
              adicionar_novo_registro();
            }, child: Text("Adicionar")),
            Expanded(
              child: ListView.builder(
                itemBuilder: (context, index){
                  return ListTile(
                      title: Text(_myHeroList[index].nome),
                      subtitle: Text(_myHeroList[index].singularidade),
                      leading: Image.network(_myHeroList[index].urlImg)
                  );
                },
                itemCount: _myHeroList.length,
              ),
            ),
          ],
        )
      ),
    );
  }

  Padding myTextField(TextEditingController controlador, String hint, String label, IconData icone) {
    return Padding(
            padding: const EdgeInsets.all(4.0),
            child: TextField(controller: controlador,decoration: InputDecoration(
              hintText: hint,
              labelText: label,
              icon: Icon(icone)
            ),),
          );
  }

  void adicionar_novo_registro() {
    setState(() {
      _myHeroList.add(MyHero(controladorNome.text, controladorSingularidade.text, controladorUrlImg.text));
      print(MyHero(controladorNome.text, controladorSingularidade.text, controladorUrlImg.text).toString());
    });

  }
}
