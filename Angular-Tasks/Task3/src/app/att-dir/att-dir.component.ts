import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-att-dir',
  templateUrl: './att-dir.component.html',
  styleUrls: ['./att-dir.component.css']
})
export class AttDirComponent implements OnInit {
  showColor = false;
  constructor() { }
  public changeColor() : void{
    this.showColor = !this.showColor;
  }
  ngOnInit(): void {
  }

}
