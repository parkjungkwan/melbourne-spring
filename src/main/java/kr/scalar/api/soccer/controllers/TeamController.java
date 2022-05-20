package kr.scalar.api.soccer.controllers;

import kr.scalar.api.soccer.domains.Team;
import kr.scalar.api.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName   :   com.toomuchcoder.api.soccer.controllers
 * fileName      :   TeamController
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/teams")
public class TeamController {
    private final TeamService service;
    @GetMapping("/findAll")
    public List<Team> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Team> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Team> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Team player) {
        return service.delete(player);
    }

    @PostMapping("/join")
    public String save(@RequestBody Team player) {
        return service.save(player);
    }

    @GetMapping("/findById/{playerid}")
    public Optional<Team> findById(@PathVariable String playerid) {
        return service.findById(playerid);
    }

    @GetMapping("/existsById/{playerid}")
    public boolean existsById(@PathVariable String playerid) {
        return service.existsById(playerid);
    }
}
