package com;


import com.config.AppConfig;
import com.repository.*;
import com.shema.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * in the main class the mapping methods are implemented by the example of CRUD operations, named queries and @ Query requests
 */
@Component

public class Main {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TeachersRepository teachersRepository;
    @Autowired
    private SinRepository sinRepository;
    @Autowired
    private SchoolboyRepository schoolboyRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private GradesRepository gradesRepository;
    @Autowired
    private DisciplinesRepository disciplinesRepository;
    @Autowired
    private ClassesRepository classesRepository;

    /**
     * examples of operations
     */
    public static void main(String[] arguments) {
        AnnotationConfigApplicationContext annotatedClassApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Main main = annotatedClassApplicationContext.getBean("main", Main.class);
        Optional<Schedule> one = main.scheduleRepository.findById(2L);
        one.ifPresent(System.out::println);

        one.ifPresent(main.getScheduleRepository()::delete);
        one = main.getScheduleRepository().findById(2L);
        System.out.println(one.isPresent());

        User user = new User();
        user.setFirst_name("Павел");
        user.setLast_name("Мороз");
        user.setId(4L);
        user.setRoles(main.getRolesRepository().getOne(1L));
        main.getUserRepository().save(user);

        Optional<User> three = main.getUserRepository().findById(4L);
        three.ifPresent(System.out::println);

        Optional<User> two = Optional.ofNullable(main.getUserRepository().findByRolesId(3L));
        two.ifPresent(System.out::println);

        List<Disciplines> four = (List<Disciplines>) main.disciplinesRepository.findAllDisciplines();
        System.out.println(four);


    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public TeachersRepository getTeachersRepository() {
        return teachersRepository;
    }

    public void setTeachersRepository(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    public SinRepository getSinRepository() {
        return sinRepository;
    }

    public void setSinRepository(SinRepository sinRepository) {
        this.sinRepository = sinRepository;
    }

    public SchoolboyRepository getSchoolboyRepository() {
        return schoolboyRepository;
    }

    public void setSchoolboyRepository(SchoolboyRepository schoolboyRepository) {
        this.schoolboyRepository = schoolboyRepository;
    }

    public ScheduleRepository getScheduleRepository() {
        return scheduleRepository;
    }

    public void setScheduleRepository(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public RolesRepository getRolesRepository() {
        return rolesRepository;
    }

    public void setRolesRepository(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public GradesRepository getGradesRepository() {
        return gradesRepository;
    }

    public void setGradesRepository(GradesRepository gradesRepository) {
        this.gradesRepository = gradesRepository;
    }

    public DisciplinesRepository getDisciplinesRepository() {
        return disciplinesRepository;
    }

    public void setDisciplinesRepository(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

    public ClassesRepository getClassesRepository() {
        return classesRepository;
    }

    public void setClassesRepository(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }
}