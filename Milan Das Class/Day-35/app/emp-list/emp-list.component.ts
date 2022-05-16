import { Component, OnInit } from '@angular/core';
import { EmpDataService } from '../emp-data.service';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  public employees = [];
  //   {"id":1, "name":"Dabade Vishal Dilip", "age":24, "designation":"Software Developer"},
  //   {"id":2, "name":"Akash Bairagi", "age":23, "designation":"Software Developer"},
  //   {"id":3, "name":"Savita Shahaji Khakale", "age":23, "designation":"Software Developer"},
  //   {"id":4, "name":"Someshwar Rao", "age":27, "designation":"Team Lead"},
  //   {"id":5, "name":"Ruturaj Pal", "age":30, "designation":"Manager"}
  // ];

  constructor(private _employeeService: EmpDataService) { }

  ngOnInit(): void {
    this.employees = this._employeeService.getEmployees();
  }

}
