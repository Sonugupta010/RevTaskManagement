import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PmNavComponent } from './pm-nav.component';

describe('PmNavComponent', () => {
  let component: PmNavComponent;
  let fixture: ComponentFixture<PmNavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PmNavComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PmNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
