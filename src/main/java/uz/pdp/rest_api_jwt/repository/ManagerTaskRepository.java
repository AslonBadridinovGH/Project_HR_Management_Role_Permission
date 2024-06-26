package uz.pdp.rest_api_jwt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.rest_api_jwt.entity.Task;

import java.time.LocalDate;
import java.util.*;

@Repository
public interface ManagerTaskRepository extends JpaRepository<Task, UUID> {


    // NEW TASKS, IN PROGRESS
    List<Task> findByEmployeeIdAndStatusIn(UUID employee_id, Set<Integer> status);

    // IF THE ROLE ID OF THE TASK'S EMPLOYEE IS 3
    List<Task>findAllByEmployee_RolesId(Integer employee_roles_id);

    // IF THE ROLE ID OF THE TASK'S EMPLOYEE IS 3  And through Task ID
    Optional<Task> findByIdAndEmployeeRolesId(UUID id, Integer employee_roles_id);

}
