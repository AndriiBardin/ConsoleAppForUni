package com.example.botscrew.service;

import com.example.botscrew.model.Lector;
import com.example.botscrew.repository.LectorRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LectorServiceImpl implements LectorService {
    private final LectorRepository lectorRepository;

    @Override
    public Lector add(Lector lector) {
        return lectorRepository.save(lector);
    }

    @Override
    public List<Lector> getAllLectors() {
        return lectorRepository.findAll();
    }

}
