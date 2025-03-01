import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ifex',
  templateUrl: './ifex.component.html',
  styleUrls: ['./ifex.component.css']
})
export class IfexComponent implements OnInit {
  showInfo : boolean = false;
  caption : string = 'Show Text';
  public changeData(): void{
    this.showInfo = !this.showInfo;
    if(this.showInfo){
      this.caption = 'Hide Text';
    }else{
      this.caption = 'Show Text';
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}
