import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GoodSamaritanComponent } from './good-samaritan.component';

describe('GoodSamaritanComponent', () => {
  let component: GoodSamaritanComponent;
  let fixture: ComponentFixture<GoodSamaritanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GoodSamaritanComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GoodSamaritanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});