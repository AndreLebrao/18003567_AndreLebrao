import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-cliente-lista',
  templateUrl: './cliente-lista.component.html',
  styleUrls: ['./cliente-lista.component.css']
})
export class ClienteListaComponent implements OnInit {

  // clientes=[
  //   {
  //     nome:'jose',
  //     email:'jose@gmail.com',
  //     fone:'12315135'

  //   },
  //   {
  //     nome:'maria',
  //     email:'maria@gmail.com',
  //     fone:'3847617356'

  //   },
  // ]

  @Input() clientes=[]

  constructor() { }

  ngOnInit(): void {
  }

}
