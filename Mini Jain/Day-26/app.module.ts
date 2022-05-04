import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { Test2Component } from './test2/test2.component';
import { GoodSamaritanComponent } from './good-samaritan/good-samaritan.component';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    Test2Component,
    GoodSamaritanComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }