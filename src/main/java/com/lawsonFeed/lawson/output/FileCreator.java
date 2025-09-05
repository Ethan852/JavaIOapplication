package com.lawsonFeed.lawson.output;

import com.lawsonFeed.lawson.DTO.ReportDto;
import org.docx4j.wml.R;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileCreator {

    public void createFile(){
        List<ReportDto> dataList = new ArrayList<>();
        ReportDto data1 = new ReportDto("Ethan", 12, new BigDecimal(33), 'A');
        ReportDto data2 = new ReportDto("Mary", 2, new BigDecimal(555), 'A');
        ReportDto data3 = new ReportDto("Jason", 55, new BigDecimal(1155), 'A');
        ReportDto data4 = new ReportDto("Joe", 0, new BigDecimal(555), 'A');
        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);

        try(FileWriter writer = new FileWriter("MPF_FILE")){

            for(ReportDto data : dataList){
                writer.append("\"").append(String.format("%-5s", data.getName())).append("\"").append(",")
                        .append("\"").append(String.format("%-5s", "")).append("\"").append(",")
                        .append(String.format("%02d", data.getNumber() == 0? 1 : 2)).append(",")
                        .append(String.format("%07.2f", data.getAmount())).append(",")
                        .append("\"").append(String.format("%-1c", data.getSeq())).append("\"").append(",")
                        .append("\n");
            }

        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
