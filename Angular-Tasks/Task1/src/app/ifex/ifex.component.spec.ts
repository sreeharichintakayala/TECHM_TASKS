import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IfexComponent } from './ifex.component';

describe('IfexComponent', () => {
  let component: IfexComponent;
  let fixture: ComponentFixture<IfexComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IfexComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IfexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
