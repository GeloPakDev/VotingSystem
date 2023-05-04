package org.voting.esm.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.voting.esm.service.AdminService;

import java.util.List;

import static org.voting.esm.util.WebPaths.*;
import static org.voting.esm.util.WebPaths.JSON;

@RestController
@RequestMapping(path = BASE_URL + API + ADMIN, produces = JSON)
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Integer> findHomeData() {
        return adminService.getHomeData();
    }
}
