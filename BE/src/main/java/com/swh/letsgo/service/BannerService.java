package com.swh.letsgo.service;

import java.util.List;

import com.swh.letsgo.model.dto.BannerDTO;

public interface BannerService {
    void insertBanner(BannerDTO bannerDTO);
    List<BannerDTO> findBanners();
}