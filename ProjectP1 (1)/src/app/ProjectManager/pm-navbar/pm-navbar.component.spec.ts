import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PMNavbarComponent } from './pm-navbar.component';

describe('PMNavbarComponent', () => {
  let component: PMNavbarComponent;
  let fixture: ComponentFixture<PMNavbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PMNavbarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PMNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
