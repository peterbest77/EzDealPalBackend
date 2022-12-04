package com.laioffer.ezdealpal.repository;

import com.laioffer.ezdealpal.entity.ZipcodeMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipcodeRepository extends JpaRepository<ZipcodeMap, String> {
    ZipcodeMap getZipcodeMapByZipcode(String zipcode);
}
