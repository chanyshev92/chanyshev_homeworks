package ru.pcs.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.web.models.Booking;

import java.util.List;

public interface BookingsRepository extends JpaRepository<Booking,Integer> {
    List<Booking> findAllByProduct_Id(Integer id);
    List<Booking> findAllByProductIsNull();
}
