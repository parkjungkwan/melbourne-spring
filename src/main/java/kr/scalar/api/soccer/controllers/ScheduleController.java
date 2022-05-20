package kr.scalar.api.soccer.controllers;

import kr.scalar.api.soccer.domains.Schedule;
import kr.scalar.api.soccer.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName   :   com.toomuchcoder.api.soccer.controllers
 * fileName      :   ScheduleController
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
@RequestMapping("/schedules")
public class ScheduleController {
    private final ScheduleService service;
    @GetMapping("/findAll")
    public List<Schedule> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Schedule player) {
        return service.delete(player);
    }

    @PostMapping("/join")
    public String save(@RequestBody Schedule player) {
        return service.save(player);
    }

    @GetMapping("/findById/{playerid}")
    public Optional<Schedule> findById(@PathVariable String playerid) {
        return service.findById(playerid);
    }

    @GetMapping("/existsById/{playerid}")
    public boolean existsById(@PathVariable String playerid) {
        return service.existsById(playerid);
    }
}
