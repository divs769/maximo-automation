package com.shopdirect.version.infrastructure.resource;

import com.shopdirect.version.domain.exceptions.VersionException;
import com.shopdirect.version.domain.reader.VersionReader;
import com.shopdirect.version.infrastructure.model.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/version", produces = "application/json")
public class VersionResource {

    private VersionReader versionReader;

    @Autowired
    public VersionResource(VersionReader versionReader) {
        this.versionReader = versionReader;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Version> getVersion() throws VersionException {
        return ResponseEntity.ok(new Version(versionReader.getVersion()));
    }
}
