import 'package:flutter/material.dart';
import 'screens/Home.dart';
void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
        // This makes the visual density adapt to the platform that you run
        // the app on. For desktop platforms, the controls will be smaller and
        // closer together (more dense) than on mobile platforms.
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: HomeScreen(),
    );
  }
}
// class MinhaTela extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//     appBar: AppBar(title: Text("Flutter App"),),
//       body: Column(
//         children: [
//           Text("Hey Hey Hey!"),
//           Padding(
//             padding: const EdgeInsets.all(8.0),
//             child: Image.network("https://i.pinimg.com/originals/76/46/00/764600d80eed6ca78e39607d71d20255.jpg"),
//           ),
//           Expanded(
//             child: Row(
//               children: [
//                 Expanded(child: Image.network("https://assets.pokemon.com/assets/cms2/img/pokedex/full/249.png",fit: BoxFit.contain,)),
//               Expanded(
//                 child: Column(
//                   mainAxisAlignment: MainAxisAlignment.center,
//                   crossAxisAlignment: CrossAxisAlignment.center,
//                   children: [
//                     minha_linha("https://assets.pokemon.com/assets/cms2/img/pokedex/full/249.png","https://github.com/andledrao/18003567_AndreLebrao"),
//                   ],
//                 ),
//               )
//               ],
//             ),
//           ),
//           Expanded(child: Image.asset("assets/qr_code_github.png"))
//         ],
//       ),
//       floatingActionButton: FloatingActionButton(
//         onPressed: (){
//           print("butao");
//         },
//         child: Icon(Icons.assistant_photo),
//       ),
//     );
//   }
//
//   minha_linha(String url,String text) {
//     return Row(
//       children: [
//         Expanded(child: Image.network(url,fit: BoxFit.contain,)),
//         Expanded(child: Text(text))
//       ],
//     );
//   }
// }
