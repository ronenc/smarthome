/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.persistence;

/**
 * A queryable persistence service which can be used to store and retrieve
 * data from openHAB. This is most likely some kind of database system.
 *
 * @author Kai Kreuzer - Initial contribution and API
 */
public interface QueryablePersistenceService extends PersistenceService {

    /**
     * Queries the {@link PersistenceService} for data with a given filter criteria
     * 
     * @param filter the filter to apply to the query
     * @return a time series of items
     */
    Iterable<HistoricItem> query(FilterCriteria filter);

}
