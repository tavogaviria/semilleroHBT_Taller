import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Router} from '@angular/router';
import { CapaComponent } from './capa/capa.component';
import { FormsModule } from '@angular/forms';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { MenuComponent } from './capa/menu/menu.component';
import { PiepaginaComponent } from './capa/piepagina/piepagina.component';
import { ApoyoComponent } from './capa/menu/apoyo/apoyo.component';
import { GestionPedidosComponent } from './capa/menu/gestion-pedidos/gestion-pedidos.component';
import { ConsultaPedidosServicioComponent } from './capa/menu/servicios/consulta-pedidos-servicio/consulta-pedidos-servicio.component';

//Gestion representa el modulo que contiene los componentes de la aplicación
//Se debe importar al compronente principal
@NgModule({
  declarations: [EncabezadoComponent, MenuComponent, PiepaginaComponent, CapaComponent, ApoyoComponent, GestionPedidosComponent],
  imports: [
    CommonModule,RouterModule,FormsModule
  ],
  exports: [
    CapaComponent
  ],
  providers: [
    ConsultaPedidosServicioComponent
  ]
})
export class GestionModule { }
