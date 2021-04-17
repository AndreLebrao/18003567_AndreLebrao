import { Directive, ElementRef, HostBinding, HostListener, Input, Renderer2 } from '@angular/core';

@Directive({
  selector: 'table'
})
export class SombraNaTabelaDirective {

  @Directive({
    selector:'[sombraNoElemento]'
  })

  @HostBinding('style.boxShadow') sombra: string;
  @Input() sombraEntrada: string;

  @HostListener('mouseover') quandoOMousePassarPorCima():void{
    // this.renderer.setStyle(
    //   this.elementRef.nativeElement,
    //   'box-shadow','10px 10px')
    this.sombra = this.sombraEntrada;
  }
  @HostListener('mouseleave') quandoOMouseSairDeCima():void{
    // this.renderer.removeStyle(
    //   this.elementRef.nativeElement,'box-shadow')
    this.sombra = "";
  }

  //depedency injection
  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2
  ){
    // this.renderer.setStyle(
    //   this.elementRef.nativeElement,
    //   'box-shadow','10px 10px'
    // )
  }

}
