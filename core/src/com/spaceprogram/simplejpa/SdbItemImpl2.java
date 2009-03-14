package com.spaceprogram.simplejpa;

import com.xerox.amazonws.sdb.Item;
import com.xerox.amazonws.sdb.ItemAttribute;
import com.xerox.amazonws.sdb.SDBException;

import javax.persistence.PersistenceException;
import java.util.List;

/**
 * User: treeder
 * Date: Mar 8, 2009
 * Time: 10:42:36 PM
 */
public class SdbItemImpl2 implements SdbItem {
    private Item item;

    public SdbItemImpl2(Item item) {
        this.item = item;
    }

    public String getIdentifier() {
        return item.getIdentifier();
    }

    public List<ItemAttribute> getAttributes() {
        try {
            return item.getAttributes();
        } catch (SDBException e) {
            throw new PersistenceException(e);
        }
    }
}
