package lk.ijse.dep8.polling.service.custom;

import lk.ijse.dep8.polling.dto.PollDTO;
import lk.ijse.dep8.polling.service.SuperService;

import java.util.List;

public interface PollService extends SuperService {
List<PollDTO>listAllPolls();
    PollDTO savePoll(PollDTO dto);



    PollDTO getPoll(int dto);
    void updatePoll(PollDTO dto);
   void deletePoll(int dto);


}
