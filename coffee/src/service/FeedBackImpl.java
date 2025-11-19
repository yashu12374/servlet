package service;

import DTO.FeedBackDTO;
import impl.FeedBackService;

public class FeedBackImpl implements FeedBackService {
    @Override
    public void validateAndSave(FeedBackDTO feedBackDTO) {
        System.out.println("FeedBack info");
    }
}
