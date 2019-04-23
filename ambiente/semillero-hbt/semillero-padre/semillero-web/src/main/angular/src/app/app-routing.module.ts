import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionPedidosComponent } from './gestion/capa/menu/gestion-pedidos/gestion-pedidos.component';


const routes: Routes = [
	{
    path: 'hacer-pedido',
    component: GestionPedidosComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
