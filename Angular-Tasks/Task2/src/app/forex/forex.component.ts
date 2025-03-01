import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forex',
  templateUrl: './forex.component.html',
  styleUrls: ['./forex.component.css']
})
export class ForexComponent implements OnInit {
  title = "Structural Component";
  productList : Array<String> = ['Iphone',
    'Galaxy',
    'Oppo',
    'Vivo',
    'AsusRog'
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
