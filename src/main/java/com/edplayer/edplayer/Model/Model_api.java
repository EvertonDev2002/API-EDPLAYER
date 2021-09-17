package com.edplayer.edplayer.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

@Getter
@Setter
public class Model_api {

    private int pageSize = 20;
    private int pageNumber = 1;
    private String sortBy = "id";
    private Sort.Direction sortDirection = Sort.Direction.ASC;
}
