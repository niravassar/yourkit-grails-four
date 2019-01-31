package demo

import grails.gorm.services.Service

@Service(Student)
interface StudentDataService {
    Student save(Student student)
}