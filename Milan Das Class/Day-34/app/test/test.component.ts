import { Component, EventEmitter, OnInit } from '@angular/core';
import { Input, Output } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  @Input("parentData") public ms_ceo;
  @Output() public childEvent = new EventEmitter();
  public company = "ThE CoDeRs NaTiOn";
  public leader = {
      name: "Narendra Modi",
      age: 68,
      designation: "Prime Minister",
      location: "New Delhi"
  };
  public today = new Date();

  constructor() { }

  ngOnInit(): void {
  }

  fireEvent() {
      this.childEvent.emit("Hello Milan Das");
  }

}
