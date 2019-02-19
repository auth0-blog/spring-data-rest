package com.auth0.ads;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdRepository extends PagingAndSortingRepository<Ad, Long> {
}