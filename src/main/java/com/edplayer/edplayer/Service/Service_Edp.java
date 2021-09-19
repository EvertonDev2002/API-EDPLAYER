package com.edplayer.edplayer.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import com.edplayer.edplayer.Model.Model_Edp;
import com.edplayer.edplayer.Model.Model_api;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import com.edplayer.edplayer.Repository.Repository_Edp;

@Service
public class Service_Edp {

    private final Repository_Edp repository_Edp;

    public Service_Edp(Repository_Edp repository_Edp) {
        this.repository_Edp = repository_Edp;
    }

    public Page<Model_Edp> getModel_API(Model_api model_api) {

        Sort sort = Sort.by(model_api.getSortDirection(), model_api.getSortBy());

        Pageable pageable = PageRequest.of(

                model_api.getPageNumber(), model_api.getPageSize(), sort);

        return repository_Edp.findAll(pageable);
    }

/*     public Model_Edp addModelEdp(Model_Edp model_Edp) {

        return repository_Edp.save(model_Edp);
    } */
}
