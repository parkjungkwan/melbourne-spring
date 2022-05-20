package kr.scalar.api.soccer.services;

import kr.scalar.api.soccer.domains.Team;
import kr.scalar.api.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName   :   com.toomuchcoder.api.soccer.services
 * fileName      :   TeamServiceImpl
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 */
@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;

    @Override
    public List<Team> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Team player) {
        repository.delete(player);
        return "";
    }

    @Override
    public String save(Team player) {
        repository.save(player);
        return "";
    }

    @Override
    public Optional<Team> findById(String playerid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String playerid) {
        return repository.existsById(0L);
    }
}
