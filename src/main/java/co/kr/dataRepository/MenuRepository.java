package co.kr.dataRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kr.doosam.data.HmcMenu;

public interface MenuRepository extends JpaRepository<HmcMenu, Integer>{

}
