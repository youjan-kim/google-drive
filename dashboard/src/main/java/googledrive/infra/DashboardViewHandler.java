package googledrive.infra;

import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class DashboardViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private DashboardRepository dashboardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            Dashboard dashboard = new Dashboard();
            // view 객체에 이벤트의 Value 를 set 함
            dashboard.setFileId(String.valueOf(fileUploaded.getId()));
            dashboard.setFileSize(String.valueOf(fileUploaded.getFileSize()));
            dashboard.setFileName(fileUploaded.getFileName());
            dashboard.setUpdateDt(fileUploaded.getUploadDt());
            dashboard.setUploadId(String.valueOf(fileUploaded.getUserid()));
            dashboard.setFileSize(String.valueOf(fileUploaded.getFileSize()));
            dashboard.setFileName(fileUploaded.getFileName());
            dashboard.setUpdateDt(fileUploaded.getUploadDt());
            dashboard.setUploadId(String.valueOf(fileUploaded.getUserid()));
            // view 레파지 토리에 save
            dashboardRepository.save(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenSteamProcessed_then_UPDATE_1(
        @Payload SteamProcessed steamProcessed
    ) {
        try {
            if (!steamProcessed.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
