package spring.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.hibernate.entity.TicketInfo;

@Repository
public interface TicketInfoRepository extends JpaRepository<TicketInfo, Long> {

}
