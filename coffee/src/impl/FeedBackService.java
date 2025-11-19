package impl;

import DTO.FeedBackDTO;

public interface FeedBackService {
    void validateAndSave(FeedBackDTO feedBackDTO);
}
