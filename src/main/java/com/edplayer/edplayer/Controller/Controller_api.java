package com.edplayer.edplayer.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.data.domain.Page;
import com.edplayer.edplayer.Model.Model_Edp;
import com.edplayer.edplayer.Model.Model_api;
import org.springframework.http.ResponseEntity;
import com.edplayer.edplayer.Service.Service_Edp;
import com.edplayer.edplayer.Repository.Repository_Edp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST EdPlayer")
public class Controller_api {

    @Autowired
    Repository_Edp repository;

    private final Service_Edp service_API;

    public Controller_api(Service_Edp service_API) {
        this.service_API = service_API;
    }

    @GetMapping
    @ApiOperation(value = "Listar todos atributos")
    public ResponseEntity<Page<Model_Edp>> getModel_API(Model_api model_api) {

        return new ResponseEntity<>(service_API.getModel_API(model_api), HttpStatus.OK);

    }

    @PostMapping("/add")
    @ApiOperation(value = "Salvar atributo")
    public ResponseEntity<Model_Edp> addModelEdp(@RequestBody Model_Edp model_Edp) {

        return new ResponseEntity<>(service_API.addModelEdp(model_Edp), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Buscar uma música")
    public Model_Edp FindSound(@PathVariable(value = "id") long id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "Deletar atributo")
    public void Delete(@RequestBody Model_Edp model) {

        repository.delete(model);
        /* Deleta um único atributo */
    }

    @PutMapping("/update")
    @ApiOperation(value = "Atualizar atributo")
    public Model_Edp Update(@RequestBody Model_Edp model) {

        return repository.save(model);
        /* Atualizar atributo */
    }

}
