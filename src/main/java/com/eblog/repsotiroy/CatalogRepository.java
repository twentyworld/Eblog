package com.eblog.repsotiroy;

import com.eblog.entity.Catalog;
import org.springframework.stereotype.Component;

/**
 * Created by teemper on 2018/3/5, 22:34.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component
public interface CatalogRepository {

    public Catalog getCatalog();
    public Catalog getCatalogUnderFile(String path);


}
