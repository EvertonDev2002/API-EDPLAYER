package com.edplayer.edplayer.Controller;

import java.util.List;
import javax.validation.Valid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.edplayer.edplayer.Model.Model_Edp;
import com.edplayer.edplayer.Repository.Repository_Edp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST EdPlayer")
public class Controller_api {

    @Autowired
    Repository_Edp repository;

    @GetMapping
    public List<Model_Edp> listSound() {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Buscar uma música")
    public Model_Edp FindSound(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }

    @PostMapping(path = "/AddSound")
    @ApiOperation(value = "Salvar atributo")
    public Model_Edp addSound(@RequestBody @Valid Model_Edp model_Edp) {
        return repository.save(model_Edp);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Deleta um único atributo")
    public void Delete(@RequestBody @Valid Model_Edp model_Edp) {

        repository.delete(model_Edp);
    }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Atualizar atributo")
    public Model_Edp Update(@RequestBody @Valid Model_Edp model_Edp) {

        return repository.save(model_Edp);
    }
}
