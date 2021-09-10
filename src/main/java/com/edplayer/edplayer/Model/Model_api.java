package com.edplayer.edplayer.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

@Getter
@Setter
public class Model_api {

    private int pageSize = 10;
    private int pageNumber = 0;
    private String sortBy = "id";
    private Sort.Direction sortDirection = Sort.Direction.ASC;
}
