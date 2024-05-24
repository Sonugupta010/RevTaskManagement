import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Card1NavComponent } from './card1-nav.component';

describe('Card1NavComponent', () => {
  let component: Card1NavComponent;
  let fixture: ComponentFixture<Card1NavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Card1NavComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Card1NavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
