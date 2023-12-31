package com.r2s.mobilestore.promotion.service;

import com.r2s.mobilestore.promotion.dtos.PageDTO;
import com.r2s.mobilestore.promotion.dtos.SearchPromotionDTO;
import com.r2s.mobilestore.promotion.entities.Promotion;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * Represents a promotion service
 *
 * @author xuanmai
 * @since 2023-10-03
 */
public interface PromotionService {

    /**
     * This method is used to list all promotions
     *
     * @param pageDTO This is a page
     * @return list all of promotions
     */
    public Page<Promotion> listAll(PageDTO pageDTO);

    /**
     * Find promotion by keyword
     *
     * @param searchPromotionDTO This is keyword
     * @return List of promotions
     */
    public Page<Promotion> search(SearchPromotionDTO searchPromotionDTO);

    /**
     * This method is used to get a promotion base on id
     *
     * @param id This is promotion id
     * @return promotion base on id
     */
    public Optional<Promotion> getPromotionById(Long id);

    /**
     * This method is used to create a promotion
     *
     * @param promotion This is a promotion
     */
    public Promotion save(Promotion promotion);

    /**
     * This method is used to delete a promotion by id
     *
     * @param id This is promotion
     */
    public void delete(Long id);

    /**
     * This method is used to random discount code
     *
     * @param length This is length of discount code
     */
    public String getRandomDiscountCode(Integer length);
}
