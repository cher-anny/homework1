import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExcelFile {
    public static void main(String[] args) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Лист");

        int rowNum = 0;

        Row row = sheet.createRow(rowNum);
        row.createCell(0).setCellValue("Фамилия");
        row.createCell(1).setCellValue("Имя");
        row.createCell(2).setCellValue("Отчество");
        row.createCell(3).setCellValue("Дата рождения");
        row.createCell(4).setCellValue("Место рождения");
        row.createCell(5).setCellValue("Возраст");
        row.createCell(6).setCellValue("Пол");
        row.createCell(7).setCellValue("Индекс");
        row.createCell(8).setCellValue("Страна");
        row.createCell(9).setCellValue("Область");
        row.createCell(10).setCellValue("Город");
        row.createCell(11).setCellValue("Улица");
        row.createCell(12).setCellValue("Дом");
        row.createCell(13).setCellValue("Квартира");

        int numOfPerson = (int) (Math.random() * (30 - 1) + 1);

        for (int i = 1; i <= numOfPerson; i++){
            Person person = new Person();
            row = sheet.createRow(i);
            row.createCell(0).setCellValue(person.getName());
            row.createCell(1).setCellValue(person.getSurname());
            row.createCell(2).setCellValue(person.getMiddleName());
            row.createCell(3).setCellValue(changeBirthdayFormat(person.getBirthday()));
            row.createCell(4).setCellValue(person.getPlaceOfBirth());
            row.createCell(5).setCellValue(person.getAge());
            row.createCell(6).setCellValue(person.getSex());
            row.createCell(7).setCellValue(person.getIndex());
            row.createCell(8).setCellValue(person.getCountry());
            row.createCell(9).setCellValue(person.getDistrict());
            row.createCell(10).setCellValue(person.getCity());
            row.createCell(11).setCellValue(person.getStreet());
            row.createCell(12).setCellValue(person.getHouse());
            row.createCell(13).setCellValue(person.getFlat());
        }

        try {File file = new File("src/main/resources/UserData.xls");
                FileOutputStream out = new FileOutputStream(file);
            workbook.write(out);
            System.out.println("Файл создан. Путь: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String changeBirthdayFormat(LocalDate birthdayDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        return dateTimeFormatter.format(birthdayDate);
    }
    }

