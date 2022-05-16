import { Component, EventEmitter, OnInit } from '@angular/core';
import { Input, Output } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  @Input("parentData") public ms_ceo: any;
  @Output() public childEvent = new EventEmitter();
  public company = "ThE CoDeRs NaTiOn";
  public employee= {
    emp_id: 4672,
    emp_name: "akhil",
    emp_father: "srinu",
    emp_department: "tester",
    emp_designation: "software developer",
    emp_dob: "4-12-1997",
    emp_doj: "3-06-2022",
    emp_dor: "5-2-4"
  };
  public today = new Date();

  constructor() { }

  ngOnInit(): void {
  }

  fireEvent() {
      this.childEvent.emit("Alexandar is a Great King");
  }

}