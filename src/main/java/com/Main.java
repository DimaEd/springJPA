package com;


import com.config.AppConfig;
import com.repository.*;
import com.shema.Roles;
import com.shema.Schedule;
import com.shema.Schoolboy;
import com.shema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

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
    private DictiplinesRepository disciplinesRepository;
    @Autowired
    private ClassesRepository classesRepository;

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
        main.getUserRepository().save(user);
        Optional<User> three = main.getUserRepository().findById(4L);
        three.ifPresent(System.out::println);
      //  Optional<User> two = main.getUserRepository().findByName("Маня");
     //   two.ifPresent(System.out::println);



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

    public DictiplinesRepository getDisciplinesRepository() {
        return disciplinesRepository;
    }

    public void setDisciplinesRepository(DictiplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

    public ClassesRepository getClassesRepository() {
        return classesRepository;
    }

    public void setClassesRepository(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }
}