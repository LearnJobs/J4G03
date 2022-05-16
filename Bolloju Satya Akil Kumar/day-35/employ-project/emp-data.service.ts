import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpDataService {

  public employees = [
    {"id":1, "name":"Dabade Vishal Dilip", "age":24, "designation":"Software Developer"},
    {"id":2, "name":"Akash Bairagi", "age":23, "designation":"Software Developer"},
    {"id":3, "name":"Savita Shahaji Khakale", "age":23, "designation":"Software Developer"},
    {"id":4, "name":"Someshwar Rao", "age":27, "designation":"Team Lead"},
    {"id":5, "name":"Sweta Raj Suman", "age":22, "designation":"Software Developer"},
    {"id":6, "name":"Ruturaj Pal", "age":30, "designation":"Manager"}
  ];

  constructor() { }

  getEmployees() {
    return this.employees;
  }
}
