package com.eblog.service;

import com.eblog.entity.Catalog;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by teemper on 2018/3/5, 22:22.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Service
public interface CatalogService {
    public Catalog getCatalogByUserId(long id);

    public List<Catalog> getSecondaryCatalog();

    public Catalog getAdminCatalog();
}
