package com.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
