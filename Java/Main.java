import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Начало работы Университетской Системы ===");

        University vsu = new University();
        vsu.setName("VSU");

        Faculty csFaculty = new Faculty();
        csFaculty.setName("Computer Science");
        vsu.getFaculties().add(csFaculty);

        Dean dean = new Dean();
        dean.setName("Ivanov");
        dean.setEmail("ivanov@vsu.ru");
        dean.setSsNo(12345);
        csFaculty.setDean(dean);

        Institute isDept = new Institute();
        isDept.setName("Information Systems");
        isDept.setAddress("Universitetskaya pl. 1");
        csFaculty.getInstitutes().add(isDept);

        ResearchAssociate researcher = new ResearchAssociate();
        researcher.setName("Petrov");
        researcher.setEmail("petrov@vsu.ru");
        researcher.setSsNo(67890);
        researcher.setFieldOfStudy("AI & Big Data");

        System.out.println("Декан " + dean.getName() + " назначает сотрудника " + researcher.getName() + "...");

        if (csFaculty.getInstitutes().contains(isDept)) {
            isDept.getResearchAssociates().add(researcher);
            System.out.println("[OK] Сотрудник успешно назначен на кафедру " + isDept.getName());
        } else {
            System.out.println("[Error] Кафедра не найдена!");
        }

        System.out.println("=== Завершение ===");
    }
}
