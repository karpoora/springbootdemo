package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

  private final DemoRepository demoRepository;

  public String getMessage() {
    Employee employee = demoRepository.save(new Employee(null, "pandian", "44"));
    return "Hi "+employee.getName();
  }
}
