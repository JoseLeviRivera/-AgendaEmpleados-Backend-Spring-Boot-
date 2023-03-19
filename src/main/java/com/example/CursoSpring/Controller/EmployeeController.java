package com.example.CursoSpring.Controller;
import com.example.CursoSpring.Model.Employee;
import com.example.CursoSpring.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @GetMapping(path = "/all")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping(path = "/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PutMapping(path = "/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping(path = "/find/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeRepository.findById(id).get();
    }

    @DeleteMapping (path = "/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        if(employeeRepository.findById(id).isEmpty()) { return "No existe ese empleado"; }
        employeeRepository.deleteById(id);
        return "Se elimino el empleado!";
    }

}
