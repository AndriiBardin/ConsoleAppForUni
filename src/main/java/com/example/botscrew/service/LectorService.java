package com.example.botscrew.service;

import com.example.botscrew.model.Lector;
import java.util.List;

public interface LectorService {
    Lector add(Lector lector);

    List<Lector> getAllLectors();
}
